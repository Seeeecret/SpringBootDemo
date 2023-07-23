package com.secret.controller;

import com.secret.exception.BusinessException;
import com.secret.exception.SystemException;
import com.secret.pojo.dto.ResultSet;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public ResultSet doSystemException(SystemException e) {
        return new ResultSet(false,e.getCode(),e.getMsg(),null);
    }
    @ExceptionHandler(BusinessException.class)
    public ResultSet doBusinessException(BusinessException e) {
        return new ResultSet(false,e.getCode(),e.getMsg(),null);
    }

    @ExceptionHandler(Exception.class)
    public ResultSet doException(Exception e) {
        return new ResultSet(false,500,"系统繁忙，请稍后再试",null);
    }
}
