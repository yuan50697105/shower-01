package org.yuan.boot.hateoas.pojo;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import com.jn.sqlhelper.dialect.pagination.PagingResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageResultModel<T> extends PageCollectionResultModel<T> {
    public PageResultModel(@NonNull Integer code, @NonNull String message) {
        super(code, message);
    }

    public <E extends IPage<T>> PageResultModel(@NonNull Integer code, @NonNull String message, E page) {
        super(code, message, page.getRecords(), page.getCurrent(), page.getSize(), page.getTotal(), page.getPages());
    }

    public PageResultModel(@NonNull Integer code, @NonNull String message, PageInfo<T> pageInfo) {
        super(code, message, pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResultModel(@NonNull Integer code, @NonNull String message, PagingResult<T> result) {
        super(code, message, result.getItems(), result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount());
    }

}
