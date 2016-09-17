/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjchaney.htest.entity;

import com.bjchaney.htest.entity.base.TimeScopeEntity;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author qiuzhenhuan
 */

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_user")
public class User extends TimeScopeEntity{
    
    @Getter
    @Setter
    private String name;
    
}
