package org.yuan.boot.hateoas.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DataResultModel<T> extends ResultModel {
    private T data;


    public DataResultModel(Integer code, String message, T data) {
        super(code, message);
        this.data = data;
    }

    public DataResultModel(Integer code, String message) {
        super(code, message);
    }

    public DataResultModel(T data) {
        super();
        this.data = data;
    }
}
