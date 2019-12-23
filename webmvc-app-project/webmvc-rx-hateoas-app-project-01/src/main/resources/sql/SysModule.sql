-- auto Generated on 2019-12-23
DROP TABLE IF EXISTS sys_module;
CREATE TABLE sys_module
(
    id        BIGINT(15)  NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name`    VARCHAR(50) NULL DEFAULT '' COMMENT 'name',
    content   VARCHAR(50) NULL DEFAULT '' COMMENT 'content',
    `type`    VARCHAR(50) NULL DEFAULT '' COMMENT 'type',
    parent_id BIGINT(15)  NULL DEFAULT -1 COMMENT 'parentId',
    `level`   INT(11)     NULL DEFAULT -1 COMMENT 'level',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'sys_module';
