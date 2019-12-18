package org.yuan.boot.app.pojo;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.jpa.pojo.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "goods_info")
public class GoodsInfo extends BaseEntity<GoodsInfo> {
    private String code;
    private String name;
    private Integer number;
    private BigDecimal price;
}
