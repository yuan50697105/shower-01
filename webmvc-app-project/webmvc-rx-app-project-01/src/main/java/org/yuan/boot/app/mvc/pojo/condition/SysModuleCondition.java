package org.yuan.boot.app.mvc.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.pojo.BaseCondition;

@EqualsAndHashCode(callSuper = true)
@Data
public class SysModuleCondition extends BaseCondition {
    private String name;

    public SysModuleCondition() {
    }

    public SysModuleCondition(int page, int size) {
        super(page, size);
    }
}
