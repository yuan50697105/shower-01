package org.yuan.boot.mvc.pojo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.jdbc.pojo.BaseCondition;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-20 14:22
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class SysUserCondition extends BaseCondition {
    private Long id;
    private List<Long> ids;
    private LocalDateTime createDate;
    private LocalDateTime createDateStart;
    private LocalDateTime createDateEnd;
    private String createUser;
    private String name;
    private String username;
    private String nickName;
    private String realName;

    public SysUserCondition() {
    }

    public SysUserCondition(int page, int size) {
        super(page, size);
    }
}
