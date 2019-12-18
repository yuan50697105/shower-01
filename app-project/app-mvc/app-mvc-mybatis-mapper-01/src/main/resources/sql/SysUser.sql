-- auto Generated on 2019-12-16
DROP TABLE IF EXISTS sys_user;
CREATE TABLE sys_user
(
    id         BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    username   VARCHAR(50) COMMENT 'username',
    `password` VARCHAR(50) COMMENT 'password',
    real_name  VARCHAR(50) COMMENT 'realName',
    nick_name  VARCHAR(50) COMMENT 'nickName',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'sys_user';
