package org.yuan.boot.hateoas.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.hateoas.pojo.ResultModel;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResultModelException extends RuntimeException {
    private ResultModel result;

    public ResultModelException(ResultModel result) {
        this.result = result;
    }
}
