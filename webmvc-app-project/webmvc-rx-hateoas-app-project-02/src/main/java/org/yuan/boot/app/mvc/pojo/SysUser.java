package org.yuan.boot.app.mvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Entity
@Table(name = "sys_user")
public class SysUser extends BaseEntity<SysUser> {
    /**
     * username
     */
    private String username;

    /**
     * password
     */
    private String password;

    /**
     * realName
     */
    private String realName;

    /**
     * nickName
     */
    private String nickName;

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

    public SysUser() {
    }

    public SysUser(Long id) {
        super(id);
    }
}