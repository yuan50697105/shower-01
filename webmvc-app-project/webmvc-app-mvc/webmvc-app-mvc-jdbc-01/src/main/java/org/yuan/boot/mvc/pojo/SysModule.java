package org.yuan.boot.mvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.relational.core.mapping.Table;
import org.yuan.boot.db.jdbc.pojo.BaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@Table("sys_module")
@Accessors(chain = true)
public class SysModule extends BaseEntity<SysModule> {
    private String name;
    private String content;
    private String url;

    public SysModule() {
    }

    public SysModule(Long id) {
        super(id);
    }
}
