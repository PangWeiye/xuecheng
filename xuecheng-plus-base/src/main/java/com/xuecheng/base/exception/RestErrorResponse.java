package com.xuecheng.base.exception;

/**
 * @Author pangwy
 * @Date 2024/8/23 15:11
 * @PackageName:com.xuecheng.base.exception
 * @ClassName: RestErrorResponse
 * @Description: 和前端约定返回的异常信息
 * @Version 1.0
 */

import java.io.Serializable;

/**
 * 错误响应参数包装
 */
public class RestErrorResponse implements Serializable {

    private String errMessage;

    public RestErrorResponse(String errMessage){
        this.errMessage= errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}