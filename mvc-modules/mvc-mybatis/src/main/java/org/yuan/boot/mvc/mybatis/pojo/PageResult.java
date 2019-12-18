package org.yuan.boot.mvc.mybatis.pojo;


import com.github.pagehelper.PageInfo;
import com.jn.sqlhelper.dialect.pagination.PagingResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import org.yuan.boot.mvc.pojo.PageCollectionResult;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends PageCollectionResult<T> {
    public PageResult(@NonNull Integer code, @NonNull String message) {
        super(code, message);
    }

    public PageResult(@NonNull Integer code, @NonNull String message, PageInfo<T> pageInfo) {
        super(code, message, pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResult(@NonNull Integer code, @NonNull String message, PagingResult<T> result) {
        super(code, message, result.getItems(), result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount());
    }
}
