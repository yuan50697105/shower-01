package org.yuan.boot.db.pojo;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuane
 * @create: 2019-12-29 13:55
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends CorePageResult<T> {

    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getList(), pageInfo.getTotal(), pageInfo.getPages());
    }


    public PageResult(long page, long size, List<T> data, long totalNumberOfRows, long totalPages) {
        super(page, size, data, totalNumberOfRows, totalPages);
    }
}