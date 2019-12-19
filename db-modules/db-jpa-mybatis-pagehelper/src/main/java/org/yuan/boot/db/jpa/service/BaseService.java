package org.yuan.boot.db.jpa.service;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.yuan.boot.db.jpa.pojo.BaseEntity;

import java.util.List;
import java.util.Optional;

public interface BaseService<T extends BaseEntity<T>> {
    T save(T t);

    Iterable<T> saveAll(Iterable<T> iterable);

    void delete(Long id);

    void delete(Iterable<Long> iterable);

    Optional<T> selectById(Long id);

    Optional<T> selectOne(T t);

    Optional<T> selectOne(Specification<T> specification);

    List<T> selectList(T t);

    List<T> selectList(Specification<T> specification);

    List<T> selectList(T t, Sort sort);

    List<T> selectList(Example<T> example, Sort sort);

    List<T> selectList(Specification<T> specification, Sort sort);

    Page<T> selectList(T t, Pageable pageable);

    Optional<T> selectOne(Example<T> example);

    List<T> selectList(Example<T> example);

    Page<T> selectList(Example<T> example, Pageable pageable);

    Page<T> selectList(Specification<T> specification, Pageable pageable);
}
