package org.yuan.boot.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.pojo.BaseEntity;
import org.yuan.boot.db.service.BaseService;

import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;

public abstract class BaseServiceImpl<T extends BaseEntity<T>, M extends BaseMapper<T>> implements BaseService<T> {
    private M baseMapper;

    public M baseMapper() {
        return baseMapper;
    }

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
    public int delete(Long id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Iterable<Long> iterable) {
        StringJoiner joiner = new StringJoiner(",");
        for (Long id : iterable) {
            joiner.add(id + "");
        }
        return baseMapper.deleteByIds(joiner.toString());
    }

    @Override
    public Optional<T> selectById(Long id) {
        return Optional.ofNullable(baseMapper.selectByPrimaryKey(id));
    }


    @Override
    public Optional<T> selectOne(T t) {
        return Optional.ofNullable(baseMapper.selectOne(t));
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
