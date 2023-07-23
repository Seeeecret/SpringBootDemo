package com.secret.exception;

import com.secret.constants.ResultCodeEnum;

public class SystemException extends RuntimeException{
    private Integer code;
    private String msg;

    public SystemException() {
    }

    public SystemException(Integer code) {
        this.code = code;
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

    public SystemException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public SystemException(ResultCodeEnum resultCodeEnum) {
        this.code = resultCodeEnum.getCode();
        this.msg = resultCodeEnum.getMessage();
    }
}
