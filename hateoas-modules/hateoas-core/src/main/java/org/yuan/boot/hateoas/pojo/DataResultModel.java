package org.yuan.boot.hateoas.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@EqualsAndHashCode(callSuper = true)
@Data
public class DataResultModel<T> extends ResultModel {
    private T data;

    public DataResultModel(@NonNull Integer code, @NonNull String message) {
        super(code, message);
    }

    public DataResultModel(@NonNull Integer code, @NonNull String message, T data) {
        super(code, message);
        this.data = data;
    }
}
