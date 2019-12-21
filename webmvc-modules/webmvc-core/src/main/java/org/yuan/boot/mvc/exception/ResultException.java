package org.yuan.boot.mvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.mvc.pojo.Result;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResultException extends RuntimeException {
    private Result result;

    public ResultException() {
    }

    public ResultException(Result result) {
        this.result = result;
    }
}
