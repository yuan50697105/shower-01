package org.yuan.boot.db.core.pojo;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import lombok.Data;

import java.util.Map;

/**
 * @author yuanez
 */
@Data
public class AbstractBaseEntity<T> {
    @SuppressWarnings("unchecked")
    public T copyFrom(T t, String... ignoreProperties) {
        BeanUtil.copyProperties(t, this, CopyOptions.create().ignoreError().ignoreCase().ignoreNullValue().setIgnoreProperties(ignoreProperties));
        return (T) this;
    }

    @SuppressWarnings({"unchecked"})
    public T copyFromWithNull(T t, String... ignoreProperties) {
        BeanUtil.copyProperties(t, this, CopyOptions.create().ignoreError().ignoreCase().setIgnoreProperties(ignoreProperties));
        return (T) this;
    }

    public T copyFrom(T t) {
        return copyFrom(t, "id");
    }

    public T copyFromWithNull(T t) {
        return copyFromWithNull(t, "id");
    }

    @SuppressWarnings("unchecked")
    public T copyFrom(Map<?, ?> map, String... ignoreProperties) {
        return (T) BeanUtil.fillBeanWithMap(map, this, CopyOptions.create().ignoreError().ignoreCase().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }

    public T copyFrom(Map<?, ?> map) {
        return copyFrom(map, "id");
    }

    @SuppressWarnings("unchecked")
    public T copyFromWithNull(Map<?, ?> map, String... ignoreProperties) {
        return (T) BeanUtil.fillBeanWithMap(map, this, CopyOptions.create().ignoreCase().ignoreError().setIgnoreProperties(ignoreProperties));
    }

    public T copyFromWithNull(Map<?, ?> map) {
        return copyFromWithNull(map, "id");
    }


}
