package org.yuan.boot.mvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DataResult<T> extends Result {
    private T data;


    public DataResult(Integer code, String message, T data) {
        super(code, message);
        this.data = data;
    }

    public DataResult(T data) {
        super();
        this.data = data;
    }
}
