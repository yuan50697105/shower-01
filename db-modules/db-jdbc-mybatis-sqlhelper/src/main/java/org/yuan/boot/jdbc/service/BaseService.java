package org.yuan.boot.jdbc.service;

import org.yuan.boot.jdbc.pojo.BaseEntity;

import java.util.Optional;

public interface BaseService<T extends BaseEntity<T>> {
    T save(T t);

    Iterable<T> saveAll(Iterable<T> iterable);

    void delete(Long id);

    void delete(Iterable<Long> iterable);

    Optional<T> selectById(Long id);

}
