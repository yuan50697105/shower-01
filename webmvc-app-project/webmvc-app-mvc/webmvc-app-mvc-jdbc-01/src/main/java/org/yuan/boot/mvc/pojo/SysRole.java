package org.yuan.boot.mvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.relational.core.mapping.Table;
import org.yuan.boot.db.jdbc.pojo.BaseEntity;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@Table("sys_role")
@Accessors(chain = true)
public class SysRole extends BaseEntity<SysRole> {
    private String name;
    private String createUser;
    private String updateUser;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public SysRole() {
    }

    public SysRole(Long id) {
        super(id);
    }
}
