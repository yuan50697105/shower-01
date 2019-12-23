package org.yuan.boot.app.mvc.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.BaseCondition;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class SysPermissionCondition extends BaseCondition {
    public SysPermissionCondition() {
    }

    public SysPermissionCondition(int page, int size) {
        super(page, size);
    }
}
