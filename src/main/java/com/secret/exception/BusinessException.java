package com.secret.exception;

import com.secret.constants.ResultCodeEnum;

public class BusinessException extends RuntimeException{
    private Integer code;
    private String msg;

    public BusinessException() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public BusinessException(Integer code) {
        this.code = code;
    }

    public BusinessException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public BusinessException(ResultCodeEnum resultCodeEnum) {
        this.code = resultCodeEnum.getCode();
        this.msg = resultCodeEnum.getMessage();
    }
}
