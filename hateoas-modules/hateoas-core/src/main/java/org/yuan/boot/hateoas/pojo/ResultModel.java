package org.yuan.boot.hateoas.pojo;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class ResultModel extends RepresentationModel<ResultModel> {
    private Integer code;
    private String message;

    public ResultModel(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
