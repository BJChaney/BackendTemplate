/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjchaney.htest.service;

import com.bjchaney.htest.entity.User;

/**
 *
 * @author qiuzhenhuan
 */
public interface UserService {
    
    /**
     * 
     * @param id
     * @return 
     */
    User findOne(String id);
    
    /**
     * 
     * @param user
     * @return 
     */
    User save(User user);
}
