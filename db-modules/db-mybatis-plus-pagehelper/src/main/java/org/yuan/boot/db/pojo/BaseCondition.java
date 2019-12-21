package org.yuan.boot.db.pojo;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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

    public Page<?> page() {
        return PageHelper.startPage(getPage(), getSize());
    }
}
