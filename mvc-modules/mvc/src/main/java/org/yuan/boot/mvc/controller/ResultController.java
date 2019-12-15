package org.yuan.boot.mvc.controller;

import org.yuan.boot.mvc.pojo.Result;


public class ResultController {

    public Result<Object> result(int code, String message) {
        return new Result<>(code, message);
    }
}
