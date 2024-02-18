package com.wasy.web.common.controller;

import com.wasy.web.common.result.Result;
import com.wasy.web.common.result.ResultEnum;
import lombok.extern.slf4j.Slf4j;

/**
 * 返回结果
 *
 * @Author ly
 * @Date 2023/03/06
 * @Version 1.0
 */
@Slf4j
public class ControllerResult<T> {
    private final ControllerFunctionResult<T> controllerFunctionResult;

    public ControllerResult(ControllerFunctionResult<T> controllerFunctionResult) {
        this.controllerFunctionResult = controllerFunctionResult;
    }

    public Result<T> computed() {
        ResultEnum rce = ResultEnum.SUCCESS;
        String code = rce.getCode();
        String msg = rce.getMsg();
        Result<T> result = null;
        try {
            result = controllerFunctionResult.computedResult();
        } catch (Exception e) {
            code = "-1";
            msg = "操作异常:" + e.getMessage();
            log.error(e.getMessage());
        }
        return Result.result(code, msg, result == null ? null : result.getData());
    }
}
