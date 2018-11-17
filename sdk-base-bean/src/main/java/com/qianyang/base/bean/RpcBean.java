package com.qianyang.base.bean;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * <br>
 *
 * @author 千阳
 * @date 2018-11-17
 */
public class RpcBean implements Serializable {
    private static final long serialVersionUID = -2686940635927704806L;

    @Override
    public String toString(){
        return toJson();
    }

    public String toJson(){
        return JSON.toJSONString(this);
    }
}
