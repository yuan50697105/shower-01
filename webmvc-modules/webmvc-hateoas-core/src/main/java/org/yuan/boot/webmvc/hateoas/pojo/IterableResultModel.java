package org.yuan.boot.webmvc.hateoas.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class IterableResultModel<E extends Iterable<?>> extends DataResultModel<E> {


    public IterableResultModel(Integer code, String message) {
        super(code, message);
    }

    public IterableResultModel(Integer code, String message, E data) {
        super(code, message, data);
    }


    public IterableResultModel(E data) {
        super(data);
    }
}
