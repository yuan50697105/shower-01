-- auto Generated on 2019-12-17
DROP TABLE IF EXISTS sys_permission;
CREATE TABLE sys_permission
(
    id              BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    create_user     VARCHAR(50) COMMENT 'createUser',
    update_user     VARCHAR(50) COMMENT 'updateUser',
    create_time     DATETIME COMMENT 'createTime',
    update_time     TIMESTAMP COMMENT 'updateTime',
    permission_name VARCHAR(50) COMMENT 'permissionName',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'sys_permission';
