package org.yuan.boot.db.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.yuan.boot.db.mybatis.mapper.BaseMapper;
import org.yuan.boot.db.mybatis.pojo.BaseEntity;
import org.yuan.boot.db.mybatis.service.BaseService;

@SuppressWarnings("SpringJavaAutowiredMembersInspection")
public abstract class BaseServiceImpl<T extends BaseEntity<T>, M extends BaseMapper<T>> implements BaseService<T> {
    @Autowired
    private M baseMapper;

    public M baseMapper() {
        return baseMapper;
    }
}
