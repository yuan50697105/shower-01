package org.yuan.boot.db.core.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbstractBaseCondition {
    private int page = 1;
    private int size = 20;
}
