package org.yuan.boot.mvc.modules.pojo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.mvc.commons.pojo.dto.BaseAuditEntityCondition;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-20 14:22
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUserCondition extends BaseAuditEntityCondition {
    private String name;
    private String username;
    private String nickName;
    private String realName;

    public SysUserCondition() {
    }

    public SysUserCondition(int page, int size) {
        super(page, size);
    }
}
