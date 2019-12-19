package org.yuan.boot.db.jdbc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.jdbc.mapper.BaseMapper;
import org.yuan.boot.db.jdbc.pojo.BaseEntity;
import org.yuan.boot.db.jdbc.repository.BaseRepository;
import org.yuan.boot.db.jdbc.service.BaseService;

import java.util.Optional;


public abstract class BaseServiceImpl<T extends BaseEntity<T>, R extends BaseRepository<T>, D extends BaseMapper<T>> implements BaseService<T> {
    @Autowired
    private R baseRepository;
    @Autowired
    private D baseMapper;

    public R baseRepository() {
        return baseRepository;
    }

    public D baseMapper() {
        return baseMapper;
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
}
