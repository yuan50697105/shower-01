package org.yuan.boot.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.yuan.boot.mybatis.mapper.BaseMapper;
import org.yuan.boot.mybatis.pojo.BaseEntity;
import org.yuan.boot.mybatis.service.BaseService;

public abstract class BaseServiceImpl<T extends BaseEntity<T>, M extends BaseMapper<T>> extends ServiceImpl<M, T> implements BaseService<T> {
}
