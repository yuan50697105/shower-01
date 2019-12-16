package org.yuan.boot.jpa.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.core.pojo.AbstractCoreBaseEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public class BaseEntity<T> extends AbstractCoreBaseEntity<T> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
