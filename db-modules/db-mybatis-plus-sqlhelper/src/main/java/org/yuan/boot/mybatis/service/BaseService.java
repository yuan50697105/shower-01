package org.yuan.boot.mybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yuan.boot.mybatis.pojo.BaseEntity;

public interface BaseService<T extends BaseEntity<T>> extends IService<T> {
}
