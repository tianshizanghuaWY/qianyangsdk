package com.qianyang.base.sdk.exception;

import java.io.Serializable;
import java.util.MissingFormatArgumentException;

/**
 * <br>
 *
 * @author 千阳
 * @date 2018-11-17
 */
public class BaseException
        extends Exception
        implements Serializable
{
    private static final long serialVersionUID = 1L;
    protected ErrorCode errorCode;
    protected String userMsg;
    protected String detail;

    public BaseException(ErrorCode errorCode, Object... msgArgs)
    {
        super(format(errorCode.getUserMsg(), msgArgs));
        this.userMsg = format(errorCode.getUserMsg(), msgArgs);
        this.detail = this.userMsg;
        this.errorCode = errorCode;
    }

    public BaseException(ErrorCode errorCode, String message, Throwable cause)
    {
        super(message, cause);
        this.detail = message;
        this.userMsg = message;
        this.errorCode = errorCode;
    }

    public BaseException() {}

    public ErrorCode getErrorCode()
    {
        return this.errorCode;
    }

    public String getUserMsg()
    {
        return this.userMsg;
    }

    public String getDetail()
    {
        return this.detail;
    }

    public void setDetail(String detail)
    {
        this.detail = detail;
    }

    public void setErrorCode(ErrorCode errorCode)
    {
        this.errorCode = errorCode;
    }

    public void setUserMsg(String userMsg)
    {
        this.userMsg = userMsg;
    }

    private static String format(String msg, Object[] msgArgs)
    {
        try
        {
            return String.format(msg, msgArgs);
        }
        catch (MissingFormatArgumentException ex)
        {
            for (Object arg : msgArgs) {
                msg = msg.replaceFirst("%s", String.valueOf(arg));
            }
        }
        return msg;
    }
}
