package org.yuan.boot.app.pojo;


import com.jn.sqlhelper.common.annotation.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.jdbc.pojo.BaseEntity;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@Table("sys_user")
public class SysUser extends BaseEntity<SysUser> {
    private String createUser;
    private String updateUser;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String username;
    private String password;
    private String realName;
    private String nickName;
}
