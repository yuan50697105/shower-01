package org.yuan.boot.hateoas.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class DataResultModel<T> extends ResultModel {
    private T data;

    public DataResultModel(Integer code, String message) {
        super(code, message);
    }

    public DataResultModel(Integer code, String message, T data) {
        super(code, message);
        this.data = data;
    }
}
