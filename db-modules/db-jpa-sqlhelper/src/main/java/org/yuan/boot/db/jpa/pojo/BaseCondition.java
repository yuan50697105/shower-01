package org.yuan.boot.db.jpa.pojo;

import com.jn.sqlhelper.dialect.pagination.PagingRequest;
import com.jn.sqlhelper.dialect.pagination.SqlPaginations;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.yuan.boot.db.core.pojo.AbstractBaseCondition;

@EqualsAndHashCode(callSuper = true)
@Data
public class BaseCondition extends AbstractBaseCondition {
    public BaseCondition() {
    }

    public BaseCondition(int page, int size) {
        super(page, size);
    }

    public Pageable pageable() {
        return PageRequest.of(getPage() - 1, getSize());
    }

    public <T extends BaseCondition> PagingRequest<T, ?> pagingRequest() {
        return SqlPaginations.preparePagination(getPage(), getSize());
    }

}
