package org.yuan.boot.db.service;

import org.yuan.boot.db.pojo.BaseEntity;

import java.io.Serializable;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuane
 * @create: 2019-12-29 13:19
 */
public interface BaseDbService<T extends BaseEntity<T>, ID extends Serializable> {
}
