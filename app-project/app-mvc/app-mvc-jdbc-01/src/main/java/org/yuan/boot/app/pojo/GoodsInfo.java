package org.yuan.boot.app.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;
import org.springframework.data.relational.core.mapping.Table;
import org.yuan.boot.db.jdbc.pojo.BaseEntity;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@Table("goods_info")
@FieldNameConstants
@Accessors(fluent = true)
public class GoodsInfo extends BaseEntity<GoodsInfo> {
    private String code;
    private String name;
    private Integer number;
    private BigDecimal price;

    public GoodsInfo() {
    }

    public GoodsInfo(Long id) {
        super(id);
    }
}
