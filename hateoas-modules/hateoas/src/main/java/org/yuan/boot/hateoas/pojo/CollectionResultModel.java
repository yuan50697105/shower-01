package org.yuan.boot.hateoas.pojo;

import lombok.NonNull;

import java.util.Collection;


public class CollectionResultModel<T> extends ResultModel<Collection<T>> {

    public CollectionResultModel(@NonNull Integer code, @NonNull String message, Collection<T> data) {
        super(code, message, data);
    }

    public CollectionResultModel(@NonNull Integer code, @NonNull String message) {
        super(code, message);
    }
}
