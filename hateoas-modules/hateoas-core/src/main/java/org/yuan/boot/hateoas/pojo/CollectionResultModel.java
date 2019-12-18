package org.yuan.boot.hateoas.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class CollectionResultModel<T> extends DataResultModel<Collection<T>> {

    public CollectionResultModel(Integer code, String message) {
        super(code, message);
    }

    public CollectionResultModel(Integer code, String message, Collection<T> data) {
        super(code, message, data);
    }
}
