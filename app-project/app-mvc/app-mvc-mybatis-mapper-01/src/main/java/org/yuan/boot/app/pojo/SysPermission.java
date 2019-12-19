package org.yuan.boot.app.pojo;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;
import org.yuan.boot.db.mybatis.pojo.BaseEntity;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@FieldNameConstants
@Accessors(fluent = true)
public class SysPermission extends BaseEntity<SysPermission> {
    private String createUser;
    private String updateUser;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String permissionName;

    public SysPermission() {
    }

    public SysPermission(Long id) {
        super(id);
    }
}
