package com.qianyang.base.dao.entity;

import java.io.Serializable;

/**
 * <br>
 *
 * @author 千阳
 * @date 2018-11-17
 */
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    protected Long id;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }
}
