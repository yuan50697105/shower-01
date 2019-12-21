package org.yuan.boot.db.service;

import org.yuan.boot.db.pojo.BaseEntity;

import java.util.Optional;

public interface BaseService<T extends BaseEntity<T>> {
    T save(T t);

    void update(T t);

    void updateWithNull(T t);

    Iterable<T> saveAll(Iterable<T> iterable);

    void delete(Long id);

    void delete(Iterable<Long> iterable);

    Optional<T> selectById(Long id);

}
