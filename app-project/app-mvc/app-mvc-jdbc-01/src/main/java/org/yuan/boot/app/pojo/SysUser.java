package org.yuan.boot.app.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.relational.core.mapping.Table;
import org.yuan.boot.jdbc.pojo.BaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@Table("sys_user")
public class SysUser extends BaseEntity<SysUser> {
    private String username;
    private String password;
    private String realName;
    private String nickName;
}
