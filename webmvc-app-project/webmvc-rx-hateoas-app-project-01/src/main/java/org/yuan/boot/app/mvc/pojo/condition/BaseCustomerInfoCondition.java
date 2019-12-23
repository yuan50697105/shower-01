package org.yuan.boot.app.mvc.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.BaseCondition;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class BaseCustomerInfoCondition extends BaseCondition {
    private String name;

    public BaseCustomerInfoCondition() {
    }

    public BaseCustomerInfoCondition(int page, int size) {
        super(page, size);
    }
}
