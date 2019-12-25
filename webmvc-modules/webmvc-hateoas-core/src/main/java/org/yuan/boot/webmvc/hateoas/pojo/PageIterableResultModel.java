package org.yuan.boot.webmvc.hateoas.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageIterableResultModel<T> extends IterableResultModel<T> {
    private long page;
    private long size;
    private long totalNumberOfRows;
    private long totalPages;

    public PageIterableResultModel(Integer code, String message) {
        super(code, message);
    }

    public PageIterableResultModel(Integer code, String message, Iterable<T> data, long page, long size, long totalNumberOfRows, long totalPages) {
        super(code, message, data);
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }

    public PageIterableResultModel(Iterable<T> data, long page, long size, long totalNumberOfRows, long totalPages) {
        super(data);
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }
}
