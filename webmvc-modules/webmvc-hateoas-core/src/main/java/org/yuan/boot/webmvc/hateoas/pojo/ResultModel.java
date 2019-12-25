package org.yuan.boot.webmvc.hateoas.pojo;

import cn.hutool.http.HttpStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultModel extends RepresentationModel<ResultModel> implements Serializable {
    public static final String OK_MESSAGE = "操作成功";
    public static final String ERROR_MESSAGE = "操作失败";
    private Integer code;
    private String message;

    public ResultModel() {
        this.code = HttpStatus.HTTP_OK;
        this.message = OK_MESSAGE;
    }

    public ResultModel(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResultModel ok() {
        return new ResultModel(HttpStatus.HTTP_OK, OK_MESSAGE);
    }

    public static ResultModel ok(String message) {
        return new ResultModel(HttpStatus.HTTP_OK, message);
    }

    public static ResultModel error(Integer code, String message) {
        return new ResultModel(code, message);
    }
}
