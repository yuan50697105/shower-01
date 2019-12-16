package org.yuan.boot.hateoas.pojo;

import lombok.EqualsAndHashCode;
import lombok.NonNull;

import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
public class PageResultModel<T> extends CollectionResultModel<T> {
    private long page;
    private long size;
    private long totalNumberOfRows;
    private long totalPages;

    public PageResultModel(@NonNull Integer code, @NonNull String message) {
        super(code, message);
    }

    public PageResultModel(@NonNull Integer code, @NonNull String message, Collection<T> data, long page, long size, long totalNumberOfRows, long totalPages) {
        super(code, message, data);
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }
}
