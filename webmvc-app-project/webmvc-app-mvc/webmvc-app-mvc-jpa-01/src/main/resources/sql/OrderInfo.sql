-- auto Generated on 2019-12-17
DROP TABLE IF EXISTS order_info;
CREATE TABLE order_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	code VARCHAR (50) COMMENT 'code',
	user_id BIGINT (15) COMMENT 'userId',
	`decimal` DECIMAL (13,4) COMMENT 'decimal',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'order_info';
