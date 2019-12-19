package org.yuan.boot.app.pojo.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.mybatis.pojo.BaseCondition;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(fluent = true)
public class OrderInfoQueryCondition extends BaseCondition {
    private Long id;
    private String orderNo;
    private Long userId;
}
