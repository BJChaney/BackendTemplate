/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjchaney.htest.entity.base;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author qiuzhenhuan
 */
@MappedSuperclass
public abstract class TimeScopeEntity extends UUIDEntity {

    @Getter
    @Setter
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date timeCreated;

    @Getter
    @Setter
    @Column(nullable=false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date timeLastUpdated;

    @PrePersist
    private void setup() {
        Date date = new Date();
        this.timeCreated = date;
        this.timeLastUpdated = date;
    }

}