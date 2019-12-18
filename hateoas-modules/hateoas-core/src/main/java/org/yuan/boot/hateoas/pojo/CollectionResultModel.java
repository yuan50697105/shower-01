package org.yuan.boot.hateoas.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
public class CollectionResultModel<T> extends DataResultModel<Collection<T>> {

    public CollectionResultModel(@NonNull Integer code, @NonNull String message) {
        super(code, message);
    }

    public CollectionResultModel(@NonNull Integer code, @NonNull String message, Collection<T> data) {
        super(code, message, data);
    }
}
