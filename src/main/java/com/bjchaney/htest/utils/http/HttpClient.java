/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjchaney.htest.utils.http;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 *
 * @author qiuzhenhuan
 */
public class HttpClient {

    private static OkHttpClient client = new OkHttpClient();

    public static String post(String url, HashMap<String, String> params) {
        try {
            Request request = new Request.Builder()
                    .post(parseRequestBody(params))
                    .url(url)
                    .build();
            return client.newCall(request).execute().body().string();
        } catch (IOException ex) {
            Logger.getLogger(HttpClient.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return null;
    }

    public static void postAsync(String url, HashMap<String, String> params, Callback callback) {
        Request request = new Request.Builder()
                .post(parseRequestBody(params))
                .url(url)
                .build();
        client.newCall(request).enqueue(callback);
    }

    public static String get(String url, HashMap<String, String> params) {
        try {
            Request request = new Request.Builder()
                    .url(formatUrl(url, params))
                    .build();
            return client.newCall(request).execute().body().string();
        } catch (IOException ex) {
            Logger.getLogger(HttpClient.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return null;
    }

    public static void getAsync(String url, HashMap<String, String> params, Callback callback) {
        Request request = new Request.Builder()
                .url(formatUrl(url, params))
                .build();
        client.newCall(request).enqueue(callback);

    }
    
    private static String formatUrl(String url,HashMap<String, String> params) {
        if (params == null || params.isEmpty()) {
            return null;
        }
        StringBuilder builder = new StringBuilder(url);
        builder.append("?");
        for (String key : params.keySet()) {
           builder.append(key).append("=").append(params.get(key)).append("&");
        }
        return builder.toString();
    }

    private static FormBody parseRequestBody(HashMap<String, String> params) {
        if (params == null || params.isEmpty()) {
            return null;
        }
        FormBody.Builder body = new FormBody.Builder();
        for (String key : params.keySet()) {
            body.add(key, params.get(key));
        }
        return body.build();
    }
}
