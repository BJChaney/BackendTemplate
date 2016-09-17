/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjchaney.htest.common;

/**
 *
 * @author qiuzhenhuan
 */
public enum ResponseCode {
    
    SUCCESS("成功", 0000),
    ERROR_UNKNOW("未知错误", 100);
    
    
    final private String msg;
    
    final private int code;
    
    ResponseCode(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }
    
    public String getMsg() {
        return msg;
    }
 
    public int getCode() {
        return code;
    }
}
