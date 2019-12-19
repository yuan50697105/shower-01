package org.yuan.boot.app.pojo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.jdbc.pojo.BaseCondition;


@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(fluent = true)
public class OrderInfoQueryCondition extends BaseCondition {
    private Long id;
    private String orderNo;
    private Long userId;

    public OrderInfoQueryCondition() {
    }

    public OrderInfoQueryCondition(int page, int size) {
        super(page, size);
    }
}
