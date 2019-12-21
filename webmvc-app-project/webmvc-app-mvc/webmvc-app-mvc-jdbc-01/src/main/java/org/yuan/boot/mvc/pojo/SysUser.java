package org.yuan.boot.mvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.relational.core.mapping.Table;
import org.yuan.boot.db.jdbc.pojo.BaseEntity;

import java.time.LocalDateTime;

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
public class SysUser extends BaseEntity<SysUser> {
    private String username;
    private String password;
    private String createUser;
    private String updateUser;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public SysUser() {
    }

    public SysUser(Long id) {
        super(id);
    }
}
