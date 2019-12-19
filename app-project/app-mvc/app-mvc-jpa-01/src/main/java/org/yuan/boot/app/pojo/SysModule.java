package org.yuan.boot.app.pojo;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.jpa.pojo.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "sys_module")
public class SysModule extends BaseEntity<SysModule> {
    private String createUser;
    private String updateUser;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String moduleName;
}
