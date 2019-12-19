package org.yuan.boot.hateoas.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class IterableResultModel<E extends Iterable<?>> extends DataResultModel<E> {

    public IterableResultModel(Integer code, String message) {
        super(code, message);
    }

    public IterableResultModel(Integer code, String message, E data) {
        super(code, message, data);
    }
}
