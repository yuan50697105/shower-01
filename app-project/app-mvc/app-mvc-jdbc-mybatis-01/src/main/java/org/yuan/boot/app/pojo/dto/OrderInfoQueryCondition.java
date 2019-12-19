package org.yuan.boot.app.pojo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.jdbc.pojo.BaseCondition;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-17 12:33
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(fluent = true)
public class OrderInfoQueryCondition extends BaseCondition {
    private Long id;
    private String orderNo;
    private Long userId;
}
