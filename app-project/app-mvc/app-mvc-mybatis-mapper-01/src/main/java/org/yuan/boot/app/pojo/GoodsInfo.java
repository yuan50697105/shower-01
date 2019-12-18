package org.yuan.boot.app.pojo;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.mybatis.pojo.BaseEntity;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class GoodsInfo extends BaseEntity<GoodsInfo> {
    private String code;
    private String name;
    private Integer number;
    private BigDecimal price;
}
