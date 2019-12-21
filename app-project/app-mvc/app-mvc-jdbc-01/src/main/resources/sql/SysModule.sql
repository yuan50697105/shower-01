-- auto Generated on 2019-12-21
DROP TABLE IF EXISTS sys_module;
CREATE TABLE sys_module
(
    id      BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name`  VARCHAR(50) COMMENT 'name',
    content VARCHAR(50) COMMENT 'content',
    url     VARCHAR(50) COMMENT 'url',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'sys_module';
