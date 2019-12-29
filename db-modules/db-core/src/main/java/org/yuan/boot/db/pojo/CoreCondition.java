package org.yuan.boot.db.pojo;

import lombok.Data;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuane
 * @create: 2019-12-29 13:17
 */
@Data
public class CoreCondition {
    private int page = 1;
    private int size = 20;

    public CoreCondition() {
    }

    public CoreCondition(int page, int size) {
        this.page = page;
        this.size = size;
    }
}