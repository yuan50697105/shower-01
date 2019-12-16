package org.yuan.boot.jpa.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.jpa.mapper.BaseMapper;
import org.yuan.boot.jpa.pojo.BaseEntity;
import org.yuan.boot.jpa.repository.BaseRepository;
import org.yuan.boot.jpa.service.BaseService;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("SpringJavaAutowiredMembersInspection")
public abstract class BaseServiceImpl<T extends BaseEntity<T>, R extends BaseRepository<T>, D extends BaseMapper<T>> implements BaseService<T> {
    @Autowired
    private R baseRepository;
    @Autowired
    private D baseMapper;

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

    private Pageable pageable(Pageable pageable) {
        return PageRequest.of(pageable.getPageNumber() - 1, pageable.getPageSize(), pageable.getSort());
    }
}
