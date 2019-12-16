package org.yuan.boot.mybatis.service;

import org.yuan.boot.mybatis.pojo.BaseEntity;

import java.util.Collection;

public interface BaseService<T extends BaseEntity<T>> {
    int save(T t);

    int saveIgnoreNull(T t);

    int update(T t);

    int updateIgnoreNull(T t);

    int delete(Long id);

    int delete(Collection<Long> collection);

    T selectById(Long id);
}
