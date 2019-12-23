-- auto Generated on 2019-12-23
DROP TABLE IF EXISTS base_customer_info;
CREATE TABLE base_customer_info
(
    id                    BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name`                VARCHAR(50) COMMENT 'name',
    age                   INT(11) COMMENT 'age',
    identification_number VARCHAR(50) COMMENT 'identificationNumber',
    mailing_address       VARCHAR(50) COMMENT 'mailingAddress',
    contact_number        VARCHAR(50) COMMENT 'contactNumber',
    work_place            VARCHAR(50) COMMENT 'workPlace',
    create_user           VARCHAR(50) COMMENT 'createUser',
    update_user           VARCHAR(50) COMMENT 'updateUser',
    create_time           DATETIME COMMENT 'createTime',
    udpate_time           DATETIME COMMENT 'udpateTime',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'base_customer_info';
