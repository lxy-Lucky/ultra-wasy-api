package com.wasy.web.common.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * Controller 返回Model
 *
 * @Author ly
 * @Date 2023/03/05
 * @Version 1.0
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> implements Serializable {

    /* 状态码 */
    private String code;

    /* 消息 */
    private String message;

    /* 数据 */
    private T data;

    /**
     * 正常处理 重载方法
     *
     * @param <T> Type
     * @return success(null)
     */
    public static <T> Result<T> success() {
        return success(null);
    }

    /**
     * 正常处理 重载方法
     *
     * @param data data
     * @param <T>  Type
     * @return success+data
     */
    public static <T> Result<T> success(T data) {
        ResultEnum rem = ResultEnum.SUCCESS;
        return result(rem, data);
    }

    /**
     * 系统错误 重载方法
     *
     * @param <T> Type
     * @return 默认Message
     */
    public static <T> Result<T> failure() {
        return result(ResultEnum.SYSTEM_EXECUTION_ERROR.getCode(), ResultEnum.SYSTEM_EXECUTION_ERROR.getMsg(), null);
    }

    /**
     * 系统错误 重载方法
     *
     * @param msg msg
     * @param <T> Type
     * @return 自定义Message
     */
    public static <T> Result<T> failure(String msg) {
        return result(ResultEnum.SYSTEM_EXECUTION_ERROR.getCode(), msg, null);
    }

    /**
     * @param resultCode resultCode
     * @param data       data
     * @param <T>        Type
     * @return 系统状态信息
     */
    private static <T> Result<T> result(IResultCode resultCode, T data) {
        return result(resultCode.getCode(), resultCode.getMsg(), data);
    }

    /**
     * @param code code
     * @param msg  msg
     * @param data data
     * @param <T>  Type
     * @return 自定义状态信息
     */
    public static <T> Result<T> result(String code, String msg, T data) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMessage(msg);
        result.setData(data);
        return result;
    }

    /**
     * 是否成功
     *
     * @param result result
     * @return True/False
     */
    public static boolean isSuccess(Result<?> result) {
        return result != null && ResultEnum.SUCCESS.getCode().equals(result.getCode());
    }
}
