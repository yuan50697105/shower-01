-- auto Generated on 2019-12-20
DROP TABLE IF EXISTS sys_user;
CREATE TABLE sys_user
(
    create_user VARCHAR(50) COMMENT 'createUser',
    update_user VARCHAR(50) COMMENT 'updateUser',
    create_time DATETIME COMMENT 'createTime',
    update_time DATETIME COMMENT 'updateTime',
    id          BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    username    VARCHAR(50) COMMENT 'username',
    `password`  VARCHAR(50) COMMENT 'password',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'sys_user';
