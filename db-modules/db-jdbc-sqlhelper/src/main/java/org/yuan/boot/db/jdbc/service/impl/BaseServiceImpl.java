package org.yuan.boot.db.jdbc.service.impl;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.jdbc.dao.BaseDao;
import org.yuan.boot.db.jdbc.pojo.BaseEntity;
import org.yuan.boot.db.jdbc.repository.BaseRepository;
import org.yuan.boot.db.jdbc.service.BaseService;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public abstract class BaseServiceImpl<T extends BaseEntity<T>, R extends BaseRepository<T>, D extends BaseDao<T>> implements BaseService<T> {
    @Autowired
    private R baseRepository;
    @Autowired
    private D baseDao;

    protected R baseRepository() {
        return baseRepository;
    }

    protected D baseDao() {
        return baseDao;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public T save(T t) {
        return baseRepository.save(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(T t) {
        Optional<T> optional = baseRepository.findById(t.getId());
        if (optional.isPresent()) {
            T copy = optional.get().copyFrom(t);
            baseRepository.save(copy);
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateWithNull(T t) {
        Optional<T> optional = baseRepository.findById(t.getId());
        if (optional.isPresent()) {
            T copy = optional.get().copyFromWithNull(t);
            baseRepository.save(copy);
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Iterable<T> saveAll(Iterable<T> iterable) {
        return baseRepository.saveAll(iterable);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        baseRepository.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Iterable<Long> iterable) {
        baseRepository.findAllById(iterable).forEach(baseRepository::delete);
    }

    @Override
    public Optional<T> selectById(Long id) {
        return baseRepository.findById(id);
    }

    @Override
    public Optional<T> selectOne(String sql) {
        return baseDao.selectOne(sql);
    }

    @Override
    public Optional<T> selectOne(String sql, Object... objects) {
        return baseDao.selectOne(sql, objects);
    }

    @Override
    public Optional<T> selectOne(String sql, Collection<Object> collection) {
        return baseDao.selectOne(sql, collection);
    }

    @Override
    public Optional<T> selectOne(String sql, Map<String, Object> map) {
        return baseDao.selectOne(sql, map);
    }

    @Override
    public List<T> selectList(String sql) {
        return baseDao.selectList(sql);
    }

    @Override
    public List<T> selectList(String sql, Object... objects) {
        return baseDao.selectList(sql, objects);
    }

    @Override
    public List<T> selectList(String sql, Collection<Object> collection) {
        return baseDao.selectList(sql, collection);
    }

    @Override
    public List<T> selectList(String sql, Map<String, Object> map) {
        return baseDao.selectList(sql, map);
    }

    @Override
    public PagingResult<T> selectList(String sql, int page, int size) {
        return baseDao.selectList(sql, page, size);
    }

    @Override
    public PagingResult<T> selectList(String sql, int page, int size, Object... objects) {
        return baseDao.selectList(sql, page, size, objects);
    }

    @Override
    public PagingResult<T> selectList(String sql, int page, int size, Collection<Object> collection) {
        return baseDao.selectList(sql, page, size, collection);
    }

    @Override
    public PagingResult<T> selectList(String sql, int page, int size, Map<String, Object> map) {
        return baseDao.selectList(sql, page, size, map);
    }
}
