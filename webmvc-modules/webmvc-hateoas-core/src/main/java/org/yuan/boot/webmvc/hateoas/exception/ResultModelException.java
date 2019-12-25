package org.yuan.boot.webmvc.hateoas.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.hateoas.pojo.ResultModel;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResultModelException extends RuntimeException {
    private ResultModel resultModel;

    public ResultModelException() {
    }

    public ResultModelException(ResultModel resultModel) {
        this.resultModel = resultModel;
    }
}
