/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjchaney.htest.dao;

import com.bjchaney.htest.entity.User;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author qiuzhenhuan
 */

@Transactional
public interface UserRepository extends CrudRepository<User, String>{
    
    
}
