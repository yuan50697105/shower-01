package org.yuan.boot.mvc.hateoas.db;


import com.jn.sqlhelper.dialect.pagination.PagingResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.Page;
import org.yuan.boot.hateoas.pojo.PageCollectionResultModel;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageResultModel<T> extends PageCollectionResultModel<T> {
    public PageResultModel(Page<T> page) {
        super(page.getContent(), page.getPageable().getPageNumber() + 1, page.getPageable().getPageSize(), page.getTotalElements(), page.getTotalPages());
    }

    public PageResultModel(PagingResult<T> result) {
        super(result.getItems(), result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount());
    }

    public PageResultModel(Integer code, String message, Page<T> page) {
        super(code, message, page.getContent(), page.getPageable().getPageNumber() + 1, page.getPageable().getPageSize(), page.getTotalElements(), page.getTotalPages());
    }

    public PageResultModel(Integer code, String message, PagingResult<T> result) {
        super(code, message, result.getItems(), result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount());
    }
}
