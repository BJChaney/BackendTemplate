/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjchaney.htest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author qiuzhenhuan
 */
@RequestMapping("/hello")
@Controller
public class HelloController {

    @RequestMapping(name = "")
    public String main(){
        return "index";
    }
}
