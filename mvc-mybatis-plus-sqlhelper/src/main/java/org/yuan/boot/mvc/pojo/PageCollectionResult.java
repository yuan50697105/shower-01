package org.yuan.boot.mvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageCollectionResult<T> extends CollectionResult<T> {
    private long page;
    private long size;
    private long totalNumberOfRows;
    private long totalPages;

    public PageCollectionResult(@NonNull Integer code, @NonNull String message) {
        super(code, message);
    }

    public PageCollectionResult(@NonNull Integer code, @NonNull String message, T data, long page, long size, long totalNumberOfRows, long totalPages) {
        super(code, message, data);
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }
}
