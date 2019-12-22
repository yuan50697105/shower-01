package org.yuan.boot.app.mvc.pojo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.pojo.BaseCondition;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class SysRoleCondition extends BaseCondition {
    private Long id;
    private List<Long> ids;
    private String name;

    public SysRoleCondition() {
    }

    public SysRoleCondition(int page, int size) {
        super(page, size);
    }
}
