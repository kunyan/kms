SET MODE MYSQL;

-- --------------------------------------------------------

-- -----------------------------------------------------
-- Table `mydb`.`article`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS article (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `subject` VARCHAR(45) NULL,
  `content` BLOB NULL,
  `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `create_user_id` BIGINT NOT NULL,
  `update_user_id` BIGINT NOT NULL,
  `category_id` BIGINT NULL,
  `is_published` TINYINT(1) NULL,
  `publish_time` TIMESTAMP NULL,
  PRIMARY KEY (`id`)
);


-- -----------------------------------------------------
-- Table `mydb`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS user (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(16) NOT NULL,
  `name` VARCHAR(16) NOT NULL,
  `email` VARCHAR(255) NULL,
  `password` VARCHAR(32) NOT NULL,
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);


-- -----------------------------------------------------
-- Table `mydb`.`category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS category (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`)
);

