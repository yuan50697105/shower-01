package org.yuan.boot.webmvc.hateoas.exception;

import org.yuan.boot.webmvc.hateoas.pojo.ResultModel;

public class NoValidateResultModelException extends ResultModelException {
    public NoValidateResultModelException() {

    }

    public NoValidateResultModelException(ResultModel result) {
        super(result);
    }
}
