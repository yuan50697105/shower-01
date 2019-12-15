package org.yuan.boot.mvc.controller;

import org.yuan.boot.mvc.pojo.Result;

public class ResultController {
    public Result result(int code, String message, Object data) {
        return new Result(code, message, data);
    }
}
