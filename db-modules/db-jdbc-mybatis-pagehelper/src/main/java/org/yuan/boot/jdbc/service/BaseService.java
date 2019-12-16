package org.yuan.boot.jdbc.service;

import org.yuan.boot.jdbc.pojo.BaseEntity;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BaseService<T extends BaseEntity<T>> {
    T save(T t);

    Iterable<T> saveAll(Iterable<T> iterable);

    void delete(Long id);

    void delete(Iterable<Long> iterable);

    Optional<T> selectById(Long id);

    Optional<T> selectOne(String sql);

    Optional<T> selectOne(String sql, Object... objects);

    Optional<T> selectOne(String sql, Collection<Object> collection);

    Optional<T> selectOne(String sql, Map<String, Object> map);

    List<T> selectList(String sql);

    List<T> selectList(String sql, Object... objects);

    List<T> selectList(String sql, Collection<Object> collection);

    List<T> selectList(String sql, Map<String, Object> map);

}
