package org.yuan.boot.mvc.commons.pojo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.jdbc.pojo.BaseCondition;

import java.time.LocalDateTime;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-20 14:20
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class BaseAuditEntityCondition extends BaseCondition {
    private String createUser;
    private LocalDateTime createDate;
    private LocalDateTime createDateStart;
    private LocalDateTime createDateEnd;

    public BaseAuditEntityCondition() {
    }

    public BaseAuditEntityCondition(int page, int size) {
        super(page, size);
    }
}
