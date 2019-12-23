package org.yuan.boot.app.mvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysModule extends BaseEntity<SysModule> {
    /**
     * name
     */
    private String name;

    /**
     * content
     */
    private String content;

    /**
     * type
     */
    private String type;

    /**
     * parentId
     */
    private Long parentId;

    /**
     * level
     */
    private Integer level;

    public SysModule() {
    }

    public SysModule(Long id) {
        super(id);
    }
}