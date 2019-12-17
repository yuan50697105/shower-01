package org.yuan.boot.app.pojo;

import com.jn.sqlhelper.common.annotation.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.jdbc.pojo.BaseEntity;

import java.math.BigDecimal;

/**
 * @program: learning-demo-01
 * @description: 订单信息
 * @author: yuanez
 * @create: 2019-12-17 12:20
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@Table("order_info")
public class OrderInfo extends BaseEntity<OrderInfo> {
    private String code;
    private Long userId;
    private BigDecimal decimal;
}
