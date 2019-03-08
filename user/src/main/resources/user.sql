drop table if exists `user`;

CREATE TABLE IF NOT EXISTS `user`(
   `id` INT UNSIGNED AUTO_INCREMENT,
   `username` VARCHAR(40) NOT NULL,
   `name` VARCHAR(20) NOT NULL,
   `age` INT(3) NOT NULL,
   `balance` DECIMAL(10,2),
   PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user(username,name,age,balance) values
("account1","Amanda",18,90),("account2","Bruce",23,120),("account3","Clerk",27,118);

