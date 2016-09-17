/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjchaney.htest.service.impl;

import com.bjchaney.htest.dao.UserRepository;
import com.bjchaney.htest.entity.User;
import com.bjchaney.htest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author qiuzhenhuan
 */
@Component
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;
    
    public User findOne(String id) {
        return userRepository.findOne(id);
    }

    public User save(User user) {
        return userRepository.save(user);
    }
    
}
