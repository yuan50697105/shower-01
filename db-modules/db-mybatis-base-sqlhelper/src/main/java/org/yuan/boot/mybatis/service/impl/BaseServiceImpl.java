package org.yuan.boot.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.yuan.boot.mybatis.mapper.BaseMapper;
import org.yuan.boot.mybatis.pojo.BaseEntity;
import org.yuan.boot.mybatis.service.BaseService;

@SuppressWarnings("SpringJavaAutowiredMembersInspection")
public abstract class BaseServiceImpl<T extends BaseEntity<T>, M extends BaseMapper<T>> implements BaseService<T> {
    @Autowired
    private M baseMapper;

    public M baseMapper() {
        return baseMapper;
    }
}
