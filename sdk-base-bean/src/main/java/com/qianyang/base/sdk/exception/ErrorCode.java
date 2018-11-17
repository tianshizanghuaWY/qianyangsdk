package com.qianyang.base.sdk.exception;

import java.io.Serializable;

/**
 * <br>
 *
 * @author 千阳
 * @date 2018-11-17
 */
public class ErrorCode implements Serializable
{
    private String code;
    private String msg;
    private String userMsg;
    private ErrorType type;

    public ErrorCode(String code, String msg, ErrorType type)
    {
        this(code, msg, msg, type);
    }

    public ErrorCode(String code, String msg, String userMsg, ErrorType type)
    {
        this.code = code;
        this.msg = msg;
        this.userMsg = userMsg;
        this.type = type;
    }

    public String getCode()
    {
        return this.code;
    }

    public String getMsg()
    {
        return this.msg;
    }

    public ErrorType getType()
    {
        return this.type;
    }

    public String getUserMsg()
    {
        return this.userMsg;
    }

    void setUserMsg(String userMsg)
    {
        this.userMsg = userMsg;
    }
}

