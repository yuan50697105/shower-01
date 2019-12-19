package org.yuan.boot.app.pojo;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.jpa.pojo.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "order_info")
public class OrderInfo extends BaseEntity<OrderInfo> {
    private String code;
    private Long userId;
    private BigDecimal decimal;
}
