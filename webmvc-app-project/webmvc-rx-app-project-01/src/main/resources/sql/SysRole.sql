-- auto Generated on 2019-12-22
DROP TABLE IF EXISTS sys_role;
CREATE TABLE sys_role
(
    id          BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name`      VARCHAR(50) COMMENT 'name',
    create_time DATETIME COMMENT 'createTime',
    update_time TIMESTAMP COMMENT 'updateTime',
    create_user VARCHAR(50) COMMENT 'createUser',
    update_user VARCHAR(50) COMMENT 'updateUser',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'sys_role';
