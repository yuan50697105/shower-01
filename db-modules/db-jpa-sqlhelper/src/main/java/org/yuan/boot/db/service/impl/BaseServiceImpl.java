package org.yuan.boot.db.service.impl;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.dao.BaseDao;
import org.yuan.boot.db.pojo.BaseEntity;
import org.yuan.boot.db.repository.BaseRepository;
import org.yuan.boot.db.service.BaseService;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@SuppressWarnings("SpringJavaAutowiredMembersInspection")
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
    public T save(T t) {
        return baseRepository.save(t);
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
    public Optional<T> selectOne(T t) {
        return baseRepository.findOne(Example.of(t));
    }

    @Override
    public Optional<T> selectOne(Example<T> example) {
        return baseRepository.findOne(example);
    }

    @Override
    public Optional<T> selectOne(Specification<T> specification) {
        return baseRepository.findOne(specification);
    }

    @Override
    public List<T> selectList(T t) {
        return baseRepository.findAll(Example.of(t));
    }

    @Override
    public List<T> selectList(Example<T> example) {
        return baseRepository.findAll(example);
    }

    @Override
    public List<T> selectList(Specification<T> specification) {
        return baseRepository.findAll(specification);
    }

    @Override
    public List<T> selectList(T t, Sort sort) {
        return baseRepository.findAll(Example.of(t), sort);
    }

    @Override
    public List<T> selectList(Example<T> example, Sort sort) {
        return baseRepository.findAll(example, sort);
    }

    @Override
    public List<T> selectList(Specification<T> specification, Sort sort) {
        return baseRepository.findAll(specification, sort);
    }

    @Override
    public Page<T> selectList(T t, Pageable pageable) {
        return baseRepository.findAll(Example.of(t), pageable(pageable));
    }

    @Override
    public Page<T> selectList(Example<T> example, Pageable pageable) {
        return baseRepository.findAll(example, pageable(pageable));
    }

    @Override
    public Page<T> selectList(Specification<T> specification, Pageable pageable) {
        return baseRepository.findAll(specification, pageable(pageable));
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

    private Pageable pageable(Pageable pageable) {
        return PageRequest.of(pageable.getPageNumber() - 1, pageable.getPageSize(), pageable.getSort());
    }
}
