package org.yuan.boot.app.pojo;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.relational.core.mapping.Table;
import org.yuan.boot.jdbc.pojo.BaseEntity;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@Table("goods_info")
public class GoodsInfo extends BaseEntity<GoodsInfo> {
    private String code;
    private String name;
    private Integer number;
    private BigDecimal price;
}
