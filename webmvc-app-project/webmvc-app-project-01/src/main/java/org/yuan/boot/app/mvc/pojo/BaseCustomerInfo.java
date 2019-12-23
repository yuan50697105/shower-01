package org.yuan.boot.app.mvc.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.BaseEntity;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BaseCustomerInfo extends BaseEntity<BaseCustomerInfo> {
    /**
     * name
     */
    private String name;

    /**
     * age
     */
    private Integer age;

    /**
     * identificationNumber
     */
    private String identificationNumber;

    /**
     * mailingAddress
     */
    private String mailingAddress;

    /**
     * contactNumber
     */
    private String contactNumber;

    /**
     * workPlace
     */
    private String workPlace;

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
     * udpateTime
     */
    private Date udpateTime;
}