package org.yuan.boot.mvc.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {
    @NonNull
    private Integer code;
    @NonNull
    private String message;
    private T data;
}
