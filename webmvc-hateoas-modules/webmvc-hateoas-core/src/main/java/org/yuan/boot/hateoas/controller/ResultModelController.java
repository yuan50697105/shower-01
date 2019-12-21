package org.yuan.boot.hateoas.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yuan.boot.hateoas.exception.ResultModelException;
import org.yuan.boot.hateoas.pojo.ResultModel;


@RestControllerAdvice
public class ResultModelController {

    @ExceptionHandler(ResultModelException.class)
    public ResultModel handler(ResultModelException e) {
        return e.getResult();
    }

    public ResultModel result(ResultModel result) {
        return result;
    }

}
