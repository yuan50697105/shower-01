package org.yuan.boot.app.mvc.pojo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.BaseCondition;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class SysUserCondition extends BaseCondition {
    private Long id;
    private List<Long> ids;
    private String name;
    private String username;
    private String realName;
    private String nickName;

    public SysUserCondition() {
    }

    public SysUserCondition(int page, int size) {
        super(page, size);
    }
}
