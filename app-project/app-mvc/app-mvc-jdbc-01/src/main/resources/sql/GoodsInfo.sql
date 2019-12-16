-- auto Generated on 2019-12-17
-- DROP TABLE IF EXISTS goods_info;
CREATE TABLE goods_info
(
    id       BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    code     VARCHAR(50) COMMENT 'code',
    `name`   VARCHAR(50) COMMENT 'name',
    `number` INT(11) COMMENT 'number',
    price    DECIMAL(13, 4) COMMENT 'price',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'goods_info';
