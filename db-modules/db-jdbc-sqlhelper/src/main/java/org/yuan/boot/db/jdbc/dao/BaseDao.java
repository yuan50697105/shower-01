package org.yuan.boot.db.jdbc.dao;

import com.jn.sqlhelper.dialect.pagination.PagingResult;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BaseDao<T> {

    int update(String sql);

    int update(String sql, Object... objects);

    int update(String sql, Collection<Object> collection);

    int update(String sql, Map<String, Object> map);

    Optional<T> selectOne(String sql);

    Optional<T> selectOne(String sql, Object... objects);

    Optional<T> selectOne(String sql, Collection<Object> objects);

    Optional<T> selectOne(String sql, Map<String, Object> map);

    List<T> selectList(String sql);

    List<T> selectList(String sql, Object... objects);

    List<T> selectList(String sql, Collection<Object> collection);

    List<T> selectList(String sql, Map<String, Object> map);

    PagingResult<T> selectList(String sql, int page, int size);

    PagingResult<T> selectList(String sql, int page, int size, Object... objects);

    PagingResult<T> selectList(String sql, int page, int size, Collection<Object> collection);

    PagingResult<T> selectList(String sql, int page, int size, Map<String, Object> map);

    <R> Optional<R> selectObject(String sql, Class<R> type);

    <R> Optional<R> selectObject(String sql, Class<R> type, Object... objects);

    <R> Optional<R> selectObject(String sql, Class<R> type, Collection<Object> collection);

    <R> Optional<R> selectObject(String sql, Class<R> type, Map<String, Object> map);

    <R> List<R> selectObjects(String sql, Class<R> type);

    <R> List<R> selectObjects(String sql, Class<R> type, Object... objects);

    <R> List<R> selectObjects(String sql, Class<R> type, Collection<Object> collection);

    <R> List<R> selectObjects(String sql, Class<R> type, Map<String, Object> map);

    <R> PagingResult<R> selectObjects(String sql, Class<R> type, int page, int size);

    <R> PagingResult<R> selectObjects(String sql, Class<R> type, int page, int size, Object... objects);

    <R> PagingResult<R> selectObjects(String sql, Class<R> type, int page, int size, Collection<Object> collection);

    <R> PagingResult<R> selectObjects(String sql, Class<R> type, int page, int size, Map<String, Object> map);

    Map<String, Object> selectMap(String sql);

    Map<String, Object> selectMap(String sql, Object... objects);

    Map<String, Object> selectMap(String sql, Collection<Object> collection);

    Map<String, Object> selectMap(String sql, Map<String, Object> map);

    List<Map<String, Object>> selectMaps(String sql);

    List<Map<String, Object>> selectMaps(String sql, Object... objects);

    List<Map<String, Object>> selectMaps(String sql, Collection<Object> collection);

    List<Map<String, Object>> selectMaps(String sql, Map<String, Object> map);

    PagingResult<Map<String, Object>> selectMaps(String sql, int page, int size);

    PagingResult<Map<String, Object>> selectMaps(String sql, int page, int size, Object... objects);

    PagingResult<Map<String, Object>> selectMaps(String sql, int page, int size, Collection<Object> collection);

    PagingResult<Map<String, Object>> selectMaps(String sql, int page, int size, Map<String, Object> map);
}
