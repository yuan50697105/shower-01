package org.yuan.boot.app.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;
import org.springframework.data.relational.core.mapping.Table;
import org.yuan.boot.db.jdbc.pojo.BaseEntity;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@Table("sys_user")
@FieldNameConstants
@Accessors(fluent = true)
public class SysUser extends BaseEntity<SysUser> {
    private String createUser;
    private String updateUser;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String username;
    private String password;
    private String realName;
    private String nickName;

    public SysUser() {
    }

    public SysUser(Long id) {
        super(id);
    }
}
