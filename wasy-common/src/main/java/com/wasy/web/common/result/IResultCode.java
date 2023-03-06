package com.wasy.web.common.result;

/**
 * 获取消息和状态码
 *
 * @Author ly
 * @Date 2023/03/05
 * @Version 0.1
 */
public interface IResultCode {

    /* 获取状态码 */
    String getCode();

    /* 获取消息 */
    String getMsg();
}