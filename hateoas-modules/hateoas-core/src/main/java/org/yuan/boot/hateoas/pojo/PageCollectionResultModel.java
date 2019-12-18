package org.yuan.boot.hateoas.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class PageCollectionResultModel<T> extends CollectionResultModel<T> {
    private long page;
    private long size;
    private long totalNumberOfRows;
    private long totalPages;


    public PageCollectionResultModel(@NonNull Integer code, @NonNull String message) {
        super(code, message);
    }

    public PageCollectionResultModel(@NonNull Integer code, @NonNull String message, Collection<T> data, long page, long size, long totalNumberOfRows, long totalPages) {
        super(code, message, data);
        this.page = page;
        this.size = size;
        this.totalNumberOfRows = totalNumberOfRows;
        this.totalPages = totalPages;
    }
}
