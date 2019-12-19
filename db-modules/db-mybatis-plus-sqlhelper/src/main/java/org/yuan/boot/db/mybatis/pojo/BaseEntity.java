package org.yuan.boot.db.mybatis.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.core.pojo.AbstractBaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class BaseEntity<T> extends AbstractBaseEntity<T> {
    @TableId(type = IdType.AUTO)
    private Long id;
}
