package org.yuan.boot.db.mybatis.pojo;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jn.sqlhelper.dialect.pagination.PagingRequest;
import com.jn.sqlhelper.dialect.pagination.SqlPaginations;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.core.pojo.AbstractBaseCondition;

@EqualsAndHashCode(callSuper = true)
@Data
public class BaseCondition extends AbstractBaseCondition {
    public BaseCondition() {
    }

    public BaseCondition(int page, int size) {
        super(page, size);
    }

    public Page<?> pageable() {
        return PageHelper.startPage(getPage(), getSize());
    }

    public <T extends BaseCondition> PagingRequest<T, ?> pagingRequest() {
        return SqlPaginations.preparePagination(getPage(), getSize());
    }
}
