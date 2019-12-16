-- auto Generated on 2019-12-17
DROP TABLE IF EXISTS sys_module;
CREATE TABLE sys_module
(
    id          BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    create_user VARCHAR(50) COMMENT 'createUser',
    update_user VARCHAR(50) COMMENT 'updateUser',
    create_time DATETIME COMMENT 'createTime',
    update_time TIMESTAMP COMMENT 'updateTime',
    module_name VARCHAR(50) COMMENT 'moduleName',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'sys_module';
