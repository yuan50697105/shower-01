package org.yuan.boot.app.pojo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.app.pojo.SysUser;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class SysUserQueryCondition extends SysUser {
    private List<Long> ids;
    private LocalDateTime createDateStart;
    private LocalDateTime createDateEnd;
}
