package org.yuan.boot.mvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@EqualsAndHashCode(callSuper = true)
@Data
public class DataResult<T> extends Result {
    private T data;

    public DataResult(@NonNull Integer code, @NonNull String message) {
        super(code, message);
    }

    public DataResult(@NonNull Integer code, @NonNull String message, T data) {
        super(code, message);
        this.data = data;
    }
}
