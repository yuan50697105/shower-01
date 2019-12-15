package org.yuan.boot.mvc.pojo;

import lombok.Data;
import lombok.Value;

import java.util.List;

@Value
@Data
public class PageResult<T> {
    private long page;
    private long size;
    private long totalNumberOfRows;
    private long totalPages;
    private List<T> data;

}
