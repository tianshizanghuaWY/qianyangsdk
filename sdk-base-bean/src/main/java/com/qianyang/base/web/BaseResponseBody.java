package com.qianyang.base.web;

import java.io.Serializable;

/**
 * <br>
 *
 * @author 千阳
 * @date 2018-11-17
 */
public class BaseResponseBody<T>
        implements Serializable
{
    private static final long serialVersionUID = 2488663702267110932L;
    private static final String SUCCESS_CODE = "10000";
    private static final String SUCCESS_MESSAGE = "success";
    private String code;
    private String message;
    private String detail;
    private T content;

    public BaseResponseBody(String code, String message, String detail, T content)
    {
        this.code = code;
        this.message = message;
        this.detail = detail;
        this.content = content;
    }

    private BaseResponseBody(T content)
    {
        this.code = "10000";
        this.message = "success";
        this.detail = null;
        this.content = content;
    }

    public static <T> BaseResponseBody<T> bulidSuccessResponseBody(T content)
    {
        return new BaseResponseBody(content);
    }


    public String getCode()
    {
        return this.code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return this.message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getDetail()
    {
        return this.detail;
    }

    public void setDetail(String detail)
    {
        this.detail = detail;
    }

    public T getContent()
    {
        return this.content;
    }

    public void setContent(T content)
    {
        this.content = content;
    }
}
