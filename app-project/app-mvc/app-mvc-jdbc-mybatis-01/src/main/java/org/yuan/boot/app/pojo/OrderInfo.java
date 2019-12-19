package org.yuan.boot.app.pojo;

import com.jn.sqlhelper.common.annotation.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;
import org.yuan.boot.db.jdbc.pojo.BaseEntity;

import java.math.BigDecimal;


@EqualsAndHashCode(callSuper = true)
@Data
@Table("order_info")
@FieldNameConstants
@Accessors(fluent = true)
public class OrderInfo extends BaseEntity<OrderInfo> {
    private String code;
    private Long userId;
    private BigDecimal decimal;

    public OrderInfo() {
    }

    public OrderInfo(Long id) {
        super(id);
    }
}
