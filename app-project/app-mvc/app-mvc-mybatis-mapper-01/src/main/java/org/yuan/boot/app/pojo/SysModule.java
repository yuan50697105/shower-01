package org.yuan.boot.app.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.mybatis.pojo.BaseEntity;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class SysModule extends BaseEntity<SysModule> {
    private String createUser;
    private String updateUser;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String moduleName;
}
