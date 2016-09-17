/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjchaney.htest.controller;

import com.bjchaney.htest.common.RestResponse;
import com.bjchaney.htest.entity.User;
import com.bjchaney.htest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author qiuzhenhuan
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService; 
    
    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public RestResponse add(@RequestParam("name")String name){
        RestResponse response = new RestResponse();
        User user = new User(name);
        return response.success(userService.save(user));
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public RestResponse find(@PathVariable("id")String id){
        RestResponse response = new RestResponse();
        return response.success(userService.findOne(id));
    }
}
