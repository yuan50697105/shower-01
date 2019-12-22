package org.yuan.boot.hateoas.exception;

import org.yuan.boot.hateoas.pojo.ResultModel;

public class NoValidateResultModelException extends ResultModelException {
    public NoValidateResultModelException() {

    }

    public NoValidateResultModelException(ResultModel result) {
        super(result);
    }
}
