package org.yuan.boot.mvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.relational.core.mapping.Table;
import org.yuan.boot.db.jdbc.pojo.BaseEntity;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@Table("sys_permission")
@Accessors(chain = true)
public class SysPermission extends BaseEntity<SysPermission> {
    private String name;
    private String createUser;
    private String updateUser;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public SysPermission() {
    }

    public SysPermission(Long id) {
        super(id);
    }
}
