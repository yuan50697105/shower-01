package org.yuan.boot.db.core.pojo;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import lombok.Data;

import java.util.Map;

/**
 * @author yuanez
 */
@Data
public abstract class AbstractCoreBaseEntity<T> {
    @SuppressWarnings("unchecked")
    public T copyFrom(T t) {
        BeanUtil.copyProperties(t, this, CopyOptions.create().ignoreError().ignoreCase().ignoreNullValue());
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T copyFromWithNull(T t) {
        BeanUtil.copyProperties(t, this, CopyOptions.create().ignoreError().ignoreCase());
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T copyFrom(Map<?, ?> map) {
        return (T) BeanUtil.fillBeanWithMap(map, this, CopyOptions.create().ignoreError().ignoreCase().ignoreNullValue());
    }

    @SuppressWarnings("unchecked")
    public T copyFromWithNull(Map<?, ?> map) {
        return (T) BeanUtil.fillBeanWithMap(map, this, CopyOptions.create().ignoreCase().ignoreError());
    }

}
