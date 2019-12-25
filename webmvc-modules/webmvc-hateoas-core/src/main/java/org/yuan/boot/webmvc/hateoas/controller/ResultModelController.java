package org.yuan.boot.webmvc.hateoas.controller;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yuan.boot.webmvc.hateoas.exception.NoValidateResultModelException;
import org.yuan.boot.webmvc.hateoas.exception.ResultModelException;
import org.yuan.boot.webmvc.hateoas.pojo.ResultModel;


@RestControllerAdvice
public class ResultModelController {
    public static final String SUCCESS_MESSAGE = "成功";
    public static final String ERROR_MESSAGE = "失败";

    @ExceptionHandler(ResultModelException.class)
    public ResultModel handler(ResultModelException e) {
        return e.getResultModel();
    }

    @SuppressWarnings("ConstantConditions")
    public void validate(BindingResult result) throws NoValidateResultModelException {
        if (result.hasErrors()) {
            throw new NoValidateResultModelException(new ResultModel(HttpStatus.HTTP_NOT_ACCEPTABLE, ObjectUtil.defaultIfNull(result.getFieldError().getDefaultMessage(), "表单错误")));
        }
    }

    public ResultModel ok() {
        return ResultModel.ok();
    }

    public ResultModel ok(String message) {
        return ResultModel.ok(message);
    }

    public ResultModel error(int code, String message) {
        return ResultModel.error(code, message);
    }


}
