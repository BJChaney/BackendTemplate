/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjchaney.htest.service.impl;

import com.bjchaney.htest.service.SmsService;
import com.bjchaney.htest.utils.http.ApiConstants;
import com.bjchaney.htest.utils.http.HttpClient;
import java.util.HashMap;

/**
 *
 * @author qiuzhenhuan
 */
public class SmsServiceImpl implements SmsService{

    public void sendCaptcha(String token, String mobile) {
        HashMap<String,String> params = new HashMap<String, String>();
        params.put("apikey", ApiConstants.API_KEY);
        params.put("mobile", mobile);
        params.put("text", ApiConstants.SMS_CAPTCHA);
        HttpClient.post(ApiConstants.API_SEND_SMS, params);
    }
    
}
