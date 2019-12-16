package org.yuan.boot.db.core.pojo;


import cn.hutool.core.bean.BeanUtil;

/**
 * @author yuanez
 */
public abstract class AbstractCoreBaseEntity<T> {
    @SuppressWarnings("unchecked")
    public T copyFrom(T t) {
        BeanUtil.copyProperties(t, this);
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T copyFromWithNull(T t) {
        BeanUtil.copyProperties(t, this);
        return (T) this;
    }
}
