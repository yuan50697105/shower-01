package org.yuan.boot.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.yuan.boot.db.pojo.BaseEntity;

import java.io.Serializable;
import java.util.List;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuane
 * @create: 2019-12-29 13:19
 */
public interface BaseDbService<T extends BaseEntity<T>, ID extends Serializable> extends IService<T> {
    int insert(T t);

    int insertSelective(T t);

    int update(T t);

    int updateSelective(T t);

    int delete(ID id);

    int delete(Iterable<ID> ids);

    T selectById(ID id);

    T selectOne(T t);

    List<T> selectList(T t);

    PageInfo<T> selectList(T t, int page, int size);
}
