package org.yuan.boot.db.service.impl;

import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.pojo.BaseEntity;
import org.yuan.boot.db.service.BaseDbService;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuane
 * @create: 2019-12-29 13:20
 */

public abstract class BaseDbServiceImpl<T extends BaseEntity<T>, M extends BaseMapper<T>> implements BaseDbService<T> {
    private M baseMapper;

    public M baseMapper() {
        return baseMapper;
    }
}