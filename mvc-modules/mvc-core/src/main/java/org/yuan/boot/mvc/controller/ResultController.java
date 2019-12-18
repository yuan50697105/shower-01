package org.yuan.boot.mvc.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yuan.boot.mvc.exception.ResultException;
import org.yuan.boot.mvc.pojo.Result;


@RestControllerAdvice
public class ResultController {

    @ExceptionHandler(ResultException.class)
    public Result handler(ResultException e) {
        return e.getResult();
    }

    public Result result(Result result) {
        return result;
    }

}
