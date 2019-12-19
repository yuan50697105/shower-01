package org.yuan.boot.app.pojo.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.mybatis.pojo.BaseCondition;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(fluent = true)
public class SysRoleQueryCondition extends BaseCondition {
    private Long id;
    private List<Long> ids;
    private String name;

    public SysRoleQueryCondition() {
    }

    public SysRoleQueryCondition(int page, int size) {
        super(page, size);
    }
}
