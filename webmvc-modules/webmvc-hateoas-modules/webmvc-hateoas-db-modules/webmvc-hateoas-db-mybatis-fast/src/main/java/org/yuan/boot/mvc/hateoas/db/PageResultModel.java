package org.yuan.boot.mvc.hateoas.db;


import com.github.pagehelper.PageInfo;
import com.jn.sqlhelper.dialect.pagination.PagingResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.hateoas.pojo.PageCollectionResultModel;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageResultModel<T> extends PageCollectionResultModel<T> {

    public PageResultModel(com.gitee.fastmybatis.core.PageInfo<T> pageInfo) {
        super(pageInfo.getList(), pageInfo.getCurrentPageIndex(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getPageCount());
    }

    public PageResultModel(PageInfo<T> pageInfo) {
        super(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResultModel(PagingResult<T> result) {
        super(result.getItems(), result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount());
    }

    public PageResultModel(Integer code, String message, com.gitee.fastmybatis.core.PageInfo<T> pageInfo) {
        super(code, message, pageInfo.getList(), pageInfo.getCurrentPageIndex(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getPageCount());
    }

    public PageResultModel(Integer code, String message, PageInfo<T> pageInfo) {
        super(code, message, pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResultModel(Integer code, String message, PagingResult<T> result) {
        super(code, message, result.getItems(), result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount());
    }
}
