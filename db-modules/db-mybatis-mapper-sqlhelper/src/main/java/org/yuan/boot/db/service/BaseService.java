package org.yuan.boot.db.service;

import com.github.pagehelper.PageInfo;
import org.yuan.boot.db.pojo.BaseEntity;

import java.util.List;
import java.util.Optional;

public interface BaseService<T extends BaseEntity<T>> {
    int insert(T t);

    int insertSelective(T t);

    int update(T t);

    int updateSelective(T t);

    int delete(Long id);

    int delete(Iterable<Long> iterable);

    Optional<T> selectById(Long id);

    Optional<T> selectOne(T t);

    List<T> selectList(T t);

    PageInfo<T> selectList(T t, int page, int size);
}
