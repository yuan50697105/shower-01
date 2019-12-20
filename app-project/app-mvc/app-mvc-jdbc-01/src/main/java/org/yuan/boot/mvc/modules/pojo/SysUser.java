package org.yuan.boot.mvc.modules.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.relational.core.mapping.Table;
import org.yuan.boot.mvc.commons.pojo.BaseAuditEntity;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-20 13:54
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@Table("sys_user")
@Accessors(chain = true)
public class SysUser extends BaseAuditEntity<SysUser> {
    private String username;
    private String password;

    public SysUser() {
    }

    public SysUser(Long id) {
        super(id);
    }
}
