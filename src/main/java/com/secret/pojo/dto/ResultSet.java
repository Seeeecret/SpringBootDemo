package com.secret.pojo.dto;

import com.secret.constants.ResultCodeEnum;

public class ResultSet {
    private boolean success;
    private Integer code;
    private String msg;
    private Object data;

    public ResultSet() {
    }

    public ResultSet(boolean success, Integer code, String msg, Object data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public ResultSet(ResultCodeEnum resultCodeEnum, Object data) {
        this.success = resultCodeEnum.isSuccess();
        this.code = resultCodeEnum.getCode();
        this.msg = resultCodeEnum.getMessage();
        this.data = data;
    }
    @Override
    public String toString() {
        return "ResultSet{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", success=" + success +
                '}';
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
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

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
