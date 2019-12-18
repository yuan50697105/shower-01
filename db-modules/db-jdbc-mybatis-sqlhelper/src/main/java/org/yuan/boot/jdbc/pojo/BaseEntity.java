package org.yuan.boot.jdbc.pojo;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.yuan.boot.db.core.pojo.AbstractBaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class BaseEntity<T> extends AbstractBaseEntity<T> {
    @Id
    private Long id;

}
