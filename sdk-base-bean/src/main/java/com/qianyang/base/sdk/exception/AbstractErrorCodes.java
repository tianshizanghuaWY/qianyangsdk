package com.qianyang.base.sdk.exception;

import java.util.Properties;

/**
 * <br>
 *
 * @author 千阳
 * @date 2018-11-17
 */
public abstract class AbstractErrorCodes
{
    private static Properties i18ErrorCodeMsg = new Properties();

    protected static final ErrorCode newErrorCode(String code, String msg, ErrorType type)
    {
        String userMsg = i18ErrorCodeMsg.getProperty(code);
        if ((userMsg == null) || ("".equals(userMsg))) {
            return new ErrorCode(code, msg, type);
        }
        return new ErrorCode(code, msg, userMsg, type);
    }

    protected static final ErrorCode newErrorCodeWithDefaultType(String code, String msg)
    {
        return newErrorCode(code, msg, ErrorType.COMMON);
    }

    public static final ErrorCode PARAM_REQUIRED = newErrorCodeWithDefaultType("C0001", "参数必须输入。{paramName:%s}");
    public static final ErrorCode PARAM_INVALID = newErrorCodeWithDefaultType("C0002", "参数非法。{paramName:%s, value:%s}");
    public static final ErrorCode STATUS_INVALID = newErrorCodeWithDefaultType("C0003", "数据状态异常。{dataName:%s, status:%s");
    public static final ErrorCode URL_INVALID = newErrorCodeWithDefaultType("C0004", "参数不是合法URL。{paramName:%s, value:%s}");
    public static final ErrorCode PWD_INVALID = newErrorCodeWithDefaultType("C0005", "参数不是合法密码。{paramName:%s, value:%s}");
    public static final ErrorCode EMAIL_INVALID = newErrorCodeWithDefaultType("C0006", "参数不是合法Email地址。{paramName:%s, value:%s}");
    public static final ErrorCode PARAM_ISNOT_INTEGER = newErrorCodeWithDefaultType("C0007", "参数不是合法整数。{paramName:%s, value:%s}");
    public static final ErrorCode PARAM_ISNOT_NUMERIC = newErrorCodeWithDefaultType("C0008", "参数不是合法整数或者浮点数。{paramName:%s, value:%s}");
    public static final ErrorCode PARAM_ISNOT_FLOAT = newErrorCodeWithDefaultType("C0009", "参数不是合法浮点数。{paramName:%s, value:%s}");
    public static final ErrorCode PARAM_ISNOT_PHONE = newErrorCodeWithDefaultType("C0010", "参数不是合法整数或者浮点数。{paramName:%s, value:%s}");
    public static final ErrorCode PARAM_ISNOT_LINEDPHONE = newErrorCodeWithDefaultType("C0011", "参数不是合法固定电话。{paramName:%s, value:%s}");
    public static final ErrorCode PARAM_ISNOT_MOBILEPHONE = newErrorCodeWithDefaultType("C0012", "参数不是合法移动电话。{paramName:%s, value:%s}");
    public static final ErrorCode PARAM_ISNOT_ZIPCODE = newErrorCodeWithDefaultType("C0013", "参数不是合法邮政编码。{paramName:%s, value:%s}");
    public static final ErrorCode PARAM_ISNOT_ENGLISH_CHARS = newErrorCodeWithDefaultType("C0014", "参数必须全部是英文字母。{paramName:%s, value:%s}");
    public static final ErrorCode PARAM_ISNOT_CHINESE_CHARS = newErrorCodeWithDefaultType("C0015", "参数必须全部是中文字母。{paramName:%s, value:%s}");
    public static final ErrorCode PARAM_NOTMATCH_REG = newErrorCodeWithDefaultType("C0016", "参数不配置正则表达式。{paramName:%s, value:%s, regexp:%s}");
    public static final ErrorCode PARAM_SCOPE_INVALID = newErrorCodeWithDefaultType("C0017", "参数值不在合法范围内。{paramName:%s, value:%s, range:%s}");
    public static final ErrorCode PARAM_ISNOT_IDCARDNO = newErrorCodeWithDefaultType("C0018", "参数不是合法身份证号码。{paramName:%s, value:%s}");
    public static final ErrorCode TIME_PERIOD_INVALID = newErrorCodeWithDefaultType("C0019", "时间区间指定不正确。{开始时间:%s, 结束时间:%s, 要求:%s}");
    public static final ErrorCode MONEY_SCALE_INVALID = newErrorCodeWithDefaultType("C0020", "金额的精度不正确。{paramName:%s, amount:%s, requiredScale:%s}");
    public static final ErrorCode CONFIG_INVALID = newErrorCodeWithDefaultType("C0021", "配置信息有误。{configName:%s, configval:%s}");
    public static final ErrorCode PARAM_INTERVAL_INVALID = newErrorCodeWithDefaultType("C0022", "参数区间指定不正确。{开始值:%s, 结束值:%s, 要求:%s}");
    public static final ErrorCode SDK_ERROR = newErrorCodeWithDefaultType("C0023", "SDK错误");
    public static final ErrorCode DB_INTEGRITY_ERROR = newErrorCodeWithDefaultType("C1001", "数据库数据完整性异常。%s");
    public static final ErrorCode DB_RECORD_NOTEXIST = newErrorCodeWithDefaultType("C1002", "根据查询条件查询不到DB记录。{表名/实体类名:%s, 条件:%s}");
    public static final ErrorCode DB_RECORD_DUPLICATED = newErrorCodeWithDefaultType("C1003", "根据查询条件查询到多条DB记录、但只期待一条。{表名/实体类名:%s, 条件:%s}");
    public static final ErrorCode MEMCACHED_ERROR = newErrorCodeWithDefaultType("C1004", "memcached操作发生异常。%s");
    public static final ErrorCode NEW_FEATURE_NOT_READY = newErrorCodeWithDefaultType("C1005", "新功能还没有就绪。%s");
    public static final ErrorCode RESTAPI_FAILED = newErrorCodeWithDefaultType("C1006", "RESTFull API调用失败。URL=%s, params=%s");
    public static final ErrorCode QUEUE_INTERRUPTED = newErrorCodeWithDefaultType("C1012", "队列插入异常");
    public static final ErrorCode SYS_ERROR = newErrorCodeWithDefaultType("C9999", "产生系统错误。%s");
}
