package com.wasy.web.common.result;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 枚举类返回异常信息表示
 *
 * @Author ly
 * @Date 2023/03/05
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
public enum ResultEnum implements IResultCode, Serializable {

    SUCCESS("200", "操作成功!"),
    ERROR_500("500", "服务器内部异常!"),
    ERROR_IO_500("500", "io异常!"),
    ERROR_SQL_500("500", "sql语句异常!"),
    ERROR_201("201", "数据重复,请检查!"),
    ERROR_401("401", "尚未登陆,请登录!"),
    ERROR_403("403", "权限不足,请联系管理员!"),
    ERROR_400("400", "参数错误!"),
    USER_NOT_EXIST("-1", "用户不存在！"),
    SYSTEM_EXECUTION_ERROR("-1", "系统执行错误,请联系管理员!"),
    CLIENT_AUTHENTICATION_FAILED("-1", "客户端认证失败!"),
    USERNAME_OR_PASSWORD_ERROR("-1", "用户名或密码错误!");

    /* 状态码 */
    private String code;

    /* 返回的消息*/
    private String message;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return message;
    }

    @Override
    public String toString() {
        return "{" +
                "\"code\":\"" + code + '\"' +
                ", \"message\":\"" + message + '\"' +
                '}';
    }

    public static ResultEnum getValue(String code) {
        for (ResultEnum value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return SYSTEM_EXECUTION_ERROR; // 系统异常错误
    }
}
