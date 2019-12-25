package org.yuan.boot.webmvc.hateoas.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class IterableResultModel<E  > extends DataResultModel<Iterable<E>> {


    public IterableResultModel(Integer code, String message) {
        super(code, message);
    }

    public IterableResultModel(Integer code, String message, Iterable<E> data) {
        super(code, message, data);
    }


    public IterableResultModel(Iterable<E> data) {
        super(data);
    }
}
