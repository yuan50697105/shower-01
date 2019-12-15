package org.yuan.boot.hateoas.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.hateoas.PagedModel;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Value
@Data
public class PageResultModel<T> extends PagedModel<PageResultModel<T>> {
    private long page;
    private long size;
    private long totalNumberOfRows;
    private long totalPages;
    private List<T> data;

}
