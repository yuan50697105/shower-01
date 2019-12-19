package org.yuan.boot.mvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@EqualsAndHashCode(callSuper = true)
@Data
public class IterableResult<E extends Iterable<?>> extends DataResult<E> {

    public IterableResult(@NonNull Integer code, @NonNull String message) {
        super(code, message);
    }

    public IterableResult(@NonNull Integer code, @NonNull String message, E data) {
        super(code, message, data);
    }
}
