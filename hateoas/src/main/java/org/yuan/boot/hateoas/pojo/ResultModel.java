package org.yuan.boot.hateoas.pojo;

import lombok.*;
import org.springframework.hateoas.RepresentationModel;

@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class ResultModel<T> extends RepresentationModel<ResultModel<T>> {
    @NonNull
    private Integer code;
    @NonNull
    private String message;
    private T data;
}
