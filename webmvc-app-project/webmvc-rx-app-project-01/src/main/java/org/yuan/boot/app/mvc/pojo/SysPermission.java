package org.yuan.boot.app.mvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.pojo.BaseEntity;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
public class SysPermission extends BaseEntity<SysPermission> {
    /**
     * name
     */
    private String name;

    /**
     * createUser
     */
    private String createUser;

    /**
     * updateUser
     */
    private String updateUser;

    /**
     * createTime
     */
    private Date createTime;

    /**
     * updateTime
     */
    private Date updateTime;
}