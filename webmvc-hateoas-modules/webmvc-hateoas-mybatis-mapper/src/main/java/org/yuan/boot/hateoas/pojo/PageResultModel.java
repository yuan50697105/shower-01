package org.yuan.boot.hateoas.pojo;


import com.github.pagehelper.PageInfo;
import com.jn.sqlhelper.dialect.pagination.PagingResult;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageResultModel<T> extends PageCollectionResultModel<T> {
    public PageResultModel(Integer code, String message) {
        super(code, message);
    }

    public PageResultModel(Integer code, String message, PageInfo<T> pageInfo) {
        super(code, message, pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResultModel(Integer code, String message, PagingResult<T> result) {
        super(code, message, result.getItems(), result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount());
    }

}
