package org.yuan.boot.mybatis.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.mybatis.mapper.BaseMapper;
import org.yuan.boot.mybatis.pojo.BaseEntity;
import org.yuan.boot.mybatis.service.BaseService;

import java.util.Collection;

@SuppressWarnings("SpringJavaAutowiredMembersInspection")
public abstract class BaseServiceImpl<T extends BaseEntity<T>, M extends BaseMapper<T>> implements BaseService<T> {
    @Autowired
    private M baseMapper;

    public M baseMapper() {
        return baseMapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int save(T t) {
        return baseMapper.save(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int saveIgnoreNull(T t) {
        return baseMapper.saveIgnoreNull(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(T t) {
        return baseMapper.update(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateIgnoreNull(T t) {
        return baseMapper.updateIgnoreNull(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return baseMapper.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Collection<Long> collection) {
        return baseMapper.deleteByQuery(new Query().in("id", collection));
    }

    @Override
    public T selectById(Long id) {
        return baseMapper.getById(id);
    }
}
