package org.yuan.boot.mvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
public class CollectionResult<T> extends Result<Collection<T>> {

    public CollectionResult(@NonNull Integer code, @NonNull String message) {
        super(code, message);
    }

    public CollectionResult(@NonNull Integer code, @NonNull String message, Collection<T> data) {
        super(code, message, data);
    }
}
