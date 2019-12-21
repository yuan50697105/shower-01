package org.yuan.boot.mvc.controller;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yuan.boot.mvc.exception.NoValidateResultException;
import org.yuan.boot.mvc.exception.ResultException;
import org.yuan.boot.mvc.pojo.Result;


@RestControllerAdvice
public class ResultController {
    public static final String SUCCESS_MESSAGE = "成功";
    public static final String ERROR_MESSAGE = "失败";

    @ExceptionHandler(ResultException.class)
    public Result handler(ResultException e) {
        return e.getResult();
    }

    @SuppressWarnings("ConstantConditions")
    public void validate(BindingResult result) throws NoValidateResultException {
        if (result.hasErrors()) {
            throw new NoValidateResultException(new Result(HttpStatus.HTTP_NOT_ACCEPTABLE, ObjectUtil.defaultIfNull(result.getFieldError().getDefaultMessage(), "表单错误")));
        }
    }

    public Result ok() {
        return new Result(HttpStatus.HTTP_OK, SUCCESS_MESSAGE);
    }

    public Result ok(String message) {
        return new Result(HttpStatus.HTTP_OK, message);
    }

    public Result error(int code, String message) {
        return new Result(code, message);
    }


}
