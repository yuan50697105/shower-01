package org.yuan.boot.app.pojo.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.jpa.pojo.BaseCondition;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(fluent = true)
public class SysModuleQueryCondition extends BaseCondition {
    private Long id;
    private List<Long> ids;
    private String name;

    public SysModuleQueryCondition() {
    }

    public SysModuleQueryCondition(int page, int size) {
        super(page, size);
    }
}
