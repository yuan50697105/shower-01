package org.yuan.boot.mvc.mybatis.pojo;


import com.baomidou.mybatisplus.core.metadata.IPage;
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

    public <E extends IPage<T>> PageResult(@NonNull Integer code, @NonNull String message, E iPage) {
        super(code, message, iPage.getRecords(), iPage.getCurrent(), iPage.getSize(), iPage.getTotal(), iPage.getPages());
    }

    public PageResult(@NonNull Integer code, @NonNull String message, PagingResult<T> result) {
        super(code, message, result.getItems(), result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount());
    }
}
