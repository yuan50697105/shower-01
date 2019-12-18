package org.yuan.boot.mybatis.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.core.pojo.AbstractBaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class BaseEntity<T> extends AbstractBaseEntity<T> {
    private Long id;
}
