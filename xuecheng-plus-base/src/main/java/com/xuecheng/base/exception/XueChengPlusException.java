package com.xuecheng.base.exception;

/**
 * @Author pangwy
 * @Date 2024/8/23 15:13
 * @PackageName:com.xuecheng.base.exception
 * @ClassName: XueChengPlusException
 * @Description: 本项目自定义异常类型
 * @Version 1.0
 */
public class XueChengPlusException extends RuntimeException{
    private String errMessage;
    public XueChengPlusException() {
    }

    public XueChengPlusException(String message) {
        super(message);
        this.errMessage = message;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

    public static void cast(String message){
        throw new XueChengPlusException("课程名称为空");
    }
    public static void cast(CommonError error){
        throw new XueChengPlusException(error.getErrMessage());
    }
}
