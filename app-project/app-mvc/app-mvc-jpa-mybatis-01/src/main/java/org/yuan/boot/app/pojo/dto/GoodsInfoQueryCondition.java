package org.yuan.boot.app.pojo.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.jpa.pojo.BaseCondition;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(fluent = true)
public class GoodsInfoQueryCondition extends BaseCondition {

    public GoodsInfoQueryCondition() {
    }

    public GoodsInfoQueryCondition(int page, int size) {
        super(page, size);
    }
}
