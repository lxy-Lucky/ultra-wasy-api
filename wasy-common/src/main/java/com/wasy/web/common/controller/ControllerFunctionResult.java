package com.wasy.web.common.controller;

import com.wasy.web.common.result.Result;

/**
 * 获取Service返回值
 *
 * @Author ly
 * @Date 2023/03/07
 * @Version 1.0
 */
public interface ControllerFunctionResult<T> {
    Result<T> computedResult() throws Exception;
}
