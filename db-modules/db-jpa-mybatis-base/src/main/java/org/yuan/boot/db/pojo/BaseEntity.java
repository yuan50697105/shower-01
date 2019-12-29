package org.yuan.boot.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuane
 * @create: 2019-12-29 13:18
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseEntity<T> extends CoreEntity<T> {
}