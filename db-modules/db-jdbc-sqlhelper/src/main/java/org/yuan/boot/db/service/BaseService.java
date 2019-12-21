package org.yuan.boot.db.service;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.yuan.boot.db.pojo.BaseEntity;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BaseService<T extends BaseEntity<T>> {
    T save(T t);

    void update(T t);

    void updateWithNull(T t);

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

    PagingResult<T> selectList(String sql, int page, int size);

    PagingResult<T> selectList(String sql, int page, int size, Object... objects);

    PagingResult<T> selectList(String sql, int page, int size, Collection<Object> collection);

    PagingResult<T> selectList(String sql, int page, int size, Map<String, Object> map);
}
