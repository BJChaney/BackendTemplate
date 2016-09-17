/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjchaney.htest.service;

/**
 *
 * @author qiuzhenhuan
 */
public interface SmsService {
    
    void sendCaptcha(String token,String mobile);
}
