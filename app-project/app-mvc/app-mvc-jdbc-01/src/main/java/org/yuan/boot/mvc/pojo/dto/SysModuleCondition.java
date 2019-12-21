package org.yuan.boot.mvc.pojo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.jdbc.pojo.BaseCondition;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class SysModuleCondition extends BaseCondition {
    private Long id;
    private List<Long> ids;
    private String name;

    public SysModuleCondition() {
    }

    public SysModuleCondition(int page, int size) {
        super(page, size);
    }
}
