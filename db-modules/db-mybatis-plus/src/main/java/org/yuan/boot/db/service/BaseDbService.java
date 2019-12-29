package org.yuan.boot.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yuan.boot.db.pojo.BaseEntity;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuane
 * @create: 2019-12-29 13:19
 */
public interface BaseDbService<T extends BaseEntity<T>> extends IService<T> {
}
