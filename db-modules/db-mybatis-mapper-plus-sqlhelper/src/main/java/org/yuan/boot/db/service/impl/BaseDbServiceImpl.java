package org.yuan.boot.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.pojo.BaseEntity;
import org.yuan.boot.db.service.BaseDbService;

import java.io.Serializable;
import java.util.List;
import java.util.StringJoiner;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuane
 * @create: 2019-12-29 13:20
 */

public abstract class BaseDbServiceImpl<T extends BaseEntity<T>, ID extends Serializable, M extends BaseMapper<T>> extends ServiceImpl<M, T> implements BaseDbService<T, ID> {
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insert(T t) {
        return baseMapper.insert(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertSelective(T t) {
        return baseMapper.insertSelective(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(T t) {
        return baseMapper.updateByPrimaryKey(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateSelective(T t) {
        return baseMapper.updateByPrimaryKeySelective(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Iterable<ID> ids) {
        StringJoiner joiner = new StringJoiner(",");
        for (ID id : ids) {
            joiner.add(id.toString());
        }
        return baseMapper.deleteByIds(joiner.toString());
    }

    @Override
    public T selectById(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public T selectOne(T t) {
        return baseMapper.selectOne(t);
    }

    @Override
    public List<T> selectList(T t) {
        return baseMapper.select(t);
    }

    @Override
    public PageInfo<T> selectList(T t, int page, int size) {
        PageHelper.startPage(page, size);
        return PageInfo.of(baseMapper.select(t));
    }
}