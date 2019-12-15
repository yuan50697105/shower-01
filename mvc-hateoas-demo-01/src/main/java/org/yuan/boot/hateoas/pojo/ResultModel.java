package org.yuan.boot.hateoas.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.hateoas.RepresentationModel;

@Value
@EqualsAndHashCode(callSuper = true)
@Data
public class ResultModel extends RepresentationModel<ResultModel> {
    private Integer code;
    private String message;
    private Object data;
}
