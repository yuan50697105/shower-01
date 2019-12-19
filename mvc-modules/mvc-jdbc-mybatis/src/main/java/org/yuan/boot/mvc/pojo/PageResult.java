package org.yuan.boot.mvc.pojo;

import com.github.pagehelper.PageInfo;
import com.jn.sqlhelper.dialect.pagination.PagingResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.Page;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends PageCollectionResult<T> {
    public PageResult(Integer code, String message) {
        super(code, message);
    }

    public PageResult(Integer code, String message, Page<T> page) {
        super(code, message, page.getContent(), page.getPageable().getPageNumber() + 1, page.getPageable().getPageSize(), page.getTotalElements(), page.getTotalPages());
    }

    public PageResult(Integer code, String message, PageInfo<T> pageInfo) {
        super(code, message, pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResult(Integer code, String message, PagingResult<T> result) {
        super(code, message, result.getItems(), result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount());
    }
}
