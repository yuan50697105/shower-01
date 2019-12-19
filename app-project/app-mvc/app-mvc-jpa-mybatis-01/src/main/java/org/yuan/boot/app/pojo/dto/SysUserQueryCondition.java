package org.yuan.boot.app.pojo.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.jpa.pojo.BaseCondition;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(fluent = true)
public class SysUserQueryCondition extends BaseCondition {
    private Long id;
    private List<Long> ids;
    private String username;
    private String nickName;
    private String realName;
    private String createUser;
    private LocalDateTime createDateStart;
    private LocalDateTime createDateEnd;
}
