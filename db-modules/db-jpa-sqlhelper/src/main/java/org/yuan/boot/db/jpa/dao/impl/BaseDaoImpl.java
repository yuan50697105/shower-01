package org.yuan.boot.db.jpa.dao.impl;


import cn.hutool.core.util.ObjectUtil;
import com.jn.sqlhelper.dialect.pagination.PagingRequest;
import com.jn.sqlhelper.dialect.pagination.PagingResult;
import com.jn.sqlhelper.dialect.pagination.SqlPaginations;
import com.jn.sqlhelper.springjdbc.JdbcTemplate;
import com.jn.sqlhelper.springjdbc.NamedParameterJdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.jpa.dao.BaseDao;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@SuppressWarnings("SpringJavaAutowiredMembersInspection")
public abstract class BaseDaoImpl<T> implements BaseDao<T> {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate parameterJdbcTemplate;
    private Class<T> type;

    @SuppressWarnings("unchecked")
    public BaseDaoImpl() {
        type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public boolean isNotEmpty(Object object) {
        return ObjectUtil.isNotEmpty(object);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(String sql) {
        return jdbcTemplate.update(sql);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(String sql, Object... objects) {
        return jdbcTemplate.update(sql, objects);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(String sql, Collection<Object> collection) {
        return jdbcTemplate.update(sql, collection.toArray());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(String sql, Map<String, Object> map) {
        return parameterJdbcTemplate.update(sql, map);
    }

    @Override
    public Optional<T> selectOne(String sql) {
        return Optional.ofNullable(jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(type)));
    }

    @Override
    public Optional<T> selectOne(String sql, Object... objects) {
        return Optional.ofNullable(jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(type), objects));
    }

    @Override
    public Optional<T> selectOne(String sql, Collection<Object> collection) {
        return Optional.ofNullable(jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(type), collection.toArray()));
    }

    @Override
    public Optional<T> selectOne(String sql, Map<String, Object> map) {
        return Optional.ofNullable(parameterJdbcTemplate.queryForObject(sql, map, new BeanPropertyRowMapper<>(type)));
    }

    @Override
    public List<T> selectList(String sql) {
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(type));
    }

    @Override
    public List<T> selectList(String sql, Object... objects) {
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(type), objects);
    }

    @Override
    public List<T> selectList(String sql, Collection<Object> collection) {
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(type), collection.toArray());
    }

    @Override
    public List<T> selectList(String sql, Map<String, Object> map) {
        return parameterJdbcTemplate.query(sql, map, new BeanPropertyRowMapper<>(type));
    }

    @Override
    public PagingResult<T> selectList(String sql, int page, int size) {
        PagingRequest<Object, T> request = SqlPaginations.preparePagination(page, size);
        selectList(sql);
        return request.getResult();
    }

    @Override
    public PagingResult<T> selectList(String sql, int page, int size, Object... objects) {
        PagingRequest<Object, T> request = SqlPaginations.preparePagination(page, size);
        selectList(sql, objects);
        return request.getResult();
    }

    @Override
    public PagingResult<T> selectList(String sql, int page, int size, Collection<Object> collection) {
        PagingRequest<Object, T> request = SqlPaginations.preparePagination(page, size);
        selectList(sql, collection);
        return request.getResult();
    }

    @Override
    public PagingResult<T> selectList(String sql, int page, int size, Map<String, Object> map) {
        PagingRequest<Object, T> request = SqlPaginations.preparePagination(page, size);
        selectList(sql, map);
        return request.getResult();
    }

    @Override
    public <R> Optional<R> selectObject(String sql, Class<R> type) {
        return Optional.ofNullable(jdbcTemplate.queryForObject(sql, type));
    }

    @Override
    public <R> Optional<R> selectObject(String sql, Class<R> type, Object... objects) {
        return Optional.ofNullable(jdbcTemplate.queryForObject(sql, type, objects));
    }

    @Override
    public <R> Optional<R> selectObject(String sql, Class<R> type, Collection<Object> collection) {
        return Optional.ofNullable(jdbcTemplate.queryForObject(sql, type, collection.toArray()));
    }

    @Override
    public <R> Optional<R> selectObject(String sql, Class<R> type, Map<String, Object> map) {
        return Optional.ofNullable(parameterJdbcTemplate.queryForObject(sql, map, type));
    }

    @Override
    public <R> List<R> selectObjects(String sql, Class<R> type) {
        return jdbcTemplate.queryForList(sql, type);
    }

    @Override
    public <R> List<R> selectObjects(String sql, Class<R> type, Object... objects) {
        return jdbcTemplate.queryForList(sql, type, objects);
    }

    @Override
    public <R> List<R> selectObjects(String sql, Class<R> type, Collection<Object> collection) {
        return jdbcTemplate.queryForList(sql, type, collection.toArray());
    }

    @Override
    public <R> List<R> selectObjects(String sql, Class<R> type, Map<String, Object> map) {
        return parameterJdbcTemplate.queryForList(sql, map, type);
    }

    @Override
    public <R> PagingResult<R> selectObjects(String sql, Class<R> type, int page, int size) {
        PagingRequest<Object, R> request = SqlPaginations.preparePagination(page, size);
        selectList(sql, type);
        return request.getResult();
    }

    @Override
    public <R> PagingResult<R> selectObjects(String sql, Class<R> type, int page, int size, Object... objects) {
        PagingRequest<Object, R> request = SqlPaginations.preparePagination(page, size);
        selectList(sql, type, objects);
        return request.getResult();
    }

    @Override
    public <R> PagingResult<R> selectObjects(String sql, Class<R> type, int page, int size, Collection<Object> collection) {
        PagingRequest<Object, R> request = SqlPaginations.preparePagination(page, size);
        selectList(sql, type, collection);
        return request.getResult();
    }

    @Override
    public <R> PagingResult<R> selectObjects(String sql, Class<R> type, int page, int size, Map<String, Object> map) {
        PagingRequest<Object, R> request = SqlPaginations.preparePagination(page, size);
        selectList(sql, type, map);
        return request.getResult();
    }

    @Override
    public Map<String, Object> selectMap(String sql) {
        return jdbcTemplate.queryForMap(sql);
    }

    @Override
    public Map<String, Object> selectMap(String sql, Object... objects) {
        return jdbcTemplate.queryForMap(sql, objects);
    }

    @Override
    public Map<String, Object> selectMap(String sql, Collection<Object> collection) {
        return jdbcTemplate.queryForMap(sql, collection);
    }

    @Override
    public Map<String, Object> selectMap(String sql, Map<String, Object> map) {
        return parameterJdbcTemplate.queryForMap(sql, map);
    }

    @Override
    public List<Map<String, Object>> selectMaps(String sql) {
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public List<Map<String, Object>> selectMaps(String sql, Object... objects) {
        return jdbcTemplate.queryForList(sql, objects);
    }

    @Override
    public List<Map<String, Object>> selectMaps(String sql, Collection<Object> collection) {
        return jdbcTemplate.queryForList(sql, collection.toArray());
    }

    @Override
    public List<Map<String, Object>> selectMaps(String sql, Map<String, Object> map) {
        return parameterJdbcTemplate.queryForList(sql, map);
    }

    @Override
    public PagingResult<Map<String, Object>> selectMaps(String sql, int page, int size) {
        PagingRequest<Object, Map<String, Object>> request = SqlPaginations.preparePagination(page, size);
        selectList(sql);
        return request.getResult();
    }

    @Override
    public PagingResult<Map<String, Object>> selectMaps(String sql, int page, int size, Object... objects) {
        PagingRequest<Object, Map<String, Object>> request = SqlPaginations.preparePagination(page, size);
        selectList(sql, objects);
        return request.getResult();
    }

    @Override
    public PagingResult<Map<String, Object>> selectMaps(String sql, int page, int size, Collection<Object> collection) {
        PagingRequest<Object, Map<String, Object>> request = SqlPaginations.preparePagination(page, size);
        selectList(sql, collection);
        return request.getResult();
    }

    @Override
    public PagingResult<Map<String, Object>> selectMaps(String sql, int page, int size, Map<String, Object> map) {
        PagingRequest<Object, Map<String, Object>> request = SqlPaginations.preparePagination(page, size);
        selectList(sql, map);
        return request.getResult();
    }
}
