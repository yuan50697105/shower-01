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
public class SysModule extends BaseEntity<SysModule> {
    private String createUser;
    private String updateUser;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String moduleName;

    public SysModule() {
    }

    public SysModule(Long id) {
        super(id);
    }
}
