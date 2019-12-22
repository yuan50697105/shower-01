package org.yuan.boot.app.mvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.pojo.BaseEntity;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
public class SysRole extends BaseEntity<SysRole> {
    /**
     * name
     */
    private String name;

    /**
     * createTime
     */
    private Date createTime;

    /**
     * updateTime
     */
    private Date updateTime;

    /**
     * createUser
     */
    private String createUser;

    /**
     * updateUser
     */
    private String updateUser;
}