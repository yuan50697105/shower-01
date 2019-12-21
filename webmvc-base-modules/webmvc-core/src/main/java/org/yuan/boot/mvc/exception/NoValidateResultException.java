package org.yuan.boot.mvc.exception;

import org.yuan.boot.mvc.pojo.Result;

public class NoValidateResultException extends ResultException {
    public NoValidateResultException() {

    }

    public NoValidateResultException(Result result) {
        super(result);
    }
}
