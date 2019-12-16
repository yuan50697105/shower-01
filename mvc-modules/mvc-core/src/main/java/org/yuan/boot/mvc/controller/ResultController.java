package org.yuan.boot.mvc.controller;

import org.yuan.boot.mvc.pojo.Result;


public class ResultController {

    public <T> Result<T> result(Result<T> result) {
        return result;
    }
}
