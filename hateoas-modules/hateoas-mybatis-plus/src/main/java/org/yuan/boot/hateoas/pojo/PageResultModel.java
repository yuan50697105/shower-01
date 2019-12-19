package org.yuan.boot.hateoas.pojo;


import com.baomidou.mybatisplus.core.metadata.IPage;
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

    public <E extends IPage<T>> PageResultModel(Integer code, String message, E page) {
        super(code, message, page.getRecords(), page.getCurrent(), page.getSize(), page.getTotal(), page.getPages());
    }

    public PageResultModel(Integer code, String message, PageInfo<T> pageInfo) {
        super(code, message, pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResultModel(Integer code, String message, PagingResult<T> result) {
        super(code, message, result.getItems(), result.getPageNo(), result.getPageSize(), result.getTotal(), result.getMaxPageCount());
    }

}
