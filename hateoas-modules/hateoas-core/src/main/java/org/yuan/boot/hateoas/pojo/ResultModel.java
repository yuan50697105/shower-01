package org.yuan.boot.hateoas.pojo;

import lombok.*;
import org.springframework.hateoas.RepresentationModel;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class ResultModel extends RepresentationModel<ResultModel> {
    @NonNull
    private Integer code;
    @NonNull
    private String message;
}
