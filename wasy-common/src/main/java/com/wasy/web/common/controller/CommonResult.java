package com.wasy.web.common.controller;

import com.wasy.web.common.result.Result;

/**
 * 接收Service返回值
 *
 * @Author ly
 * @Date 2023/03/06
 * @Version 1.0
 */
public class CommonResult {
    public static <T> Result<T> controllerResult(ControllerFunctionResult controllerFunctionResult) {
        return new ControllerResult(controllerFunctionResult).computed();
    }
}
