package org.yuan.boot.mvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.yuan.boot.mvc.pojo.Result;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class ResultException extends RuntimeException {
    private Result result;

    public ResultException(Result result) {
        this.result = result;
    }
}
