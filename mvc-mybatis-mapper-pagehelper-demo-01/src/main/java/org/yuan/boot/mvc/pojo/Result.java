package org.yuan.boot.mvc.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Value;

import java.io.Serializable;

@Value
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result implements Serializable {
    private Integer code;
    private String message;

}
