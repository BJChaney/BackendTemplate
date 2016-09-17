/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjchaney.htest.common;

import lombok.Data;

/**
 *
 * @author qiuzhenhuan
 */
@Data
public class RestResponse<T> {

    private int code;
    
    private String msg;
    
    private T param;
    
    public RestResponse(){
        this.code = ResponseCode.SUCCESS.getCode();
        this.msg = ResponseCode.SUCCESS.getMsg();
        this.param = null;
    }
    
    public RestResponse(T param){
        this.param = param;
        this.code = ResponseCode.SUCCESS.getCode();
        this.msg = ResponseCode.SUCCESS.getMsg();
    }
    
    public RestResponse(ResponseCode code){
        this.code = code.getCode();
        this.msg = code.getMsg();
        this.param = null;
    }
    
    public RestResponse(ResponseCode code,T param){
        this.code = code.getCode();
        this.msg = code.getMsg();
        this.param = param;
    }
    
    public RestResponse<T> success(){
        setCode(ResponseCode.SUCCESS.getCode());
        setMsg(ResponseCode.SUCCESS.getMsg());
        setParam(null);
        return this;
    }
    
    public RestResponse <T> success(T data) {
        setCode(ResponseCode.SUCCESS.getCode());
        setMsg(ResponseCode.SUCCESS.getMsg());
        setParam(data);
        return this;
    }
    
    public RestResponse <T> success(T param, String msg) {
        setParam(param);
        setCode(ResponseCode.SUCCESS.getCode());
        setMsg(msg);
        return this;
    }
    
    public RestResponse <T> error(ResponseCode code) {
        setCode(code.getCode());
        setMsg(code.getMsg());
        return this;
    }
    
    public boolean isSuccess(){
        return this.code == ResponseCode.SUCCESS.getCode();
    }
    
}
