package org.yuan.boot.db.mybatis.service;

import com.github.pagehelper.PageInfo;
import org.yuan.boot.db.mybatis.pojo.BaseEntity;

import java.util.List;

public interface BaseService<T extends BaseEntity<T>> {
    int insert(T t);

    int insertSelective(T t);

    int update(T t);

    int updateSelective(T t);

    int delete(Long id);

    int delete(Iterable<Long> iterable);

    T selectById(Long id);

    T selectOne(T t);

    List<T> selectList(T t);

    PageInfo<T> selectList(T t, int page, int size);
}
