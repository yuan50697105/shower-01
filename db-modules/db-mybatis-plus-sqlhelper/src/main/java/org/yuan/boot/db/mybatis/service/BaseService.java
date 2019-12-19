package org.yuan.boot.db.mybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yuan.boot.db.mybatis.pojo.BaseEntity;

public interface BaseService<T extends BaseEntity<T>> extends IService<T> {
}
