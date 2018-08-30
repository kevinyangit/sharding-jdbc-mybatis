SET FOREIGN_KEY_CHECKS=0;
 
-- ----------------------------
-- Table structure for t_student_00
-- ----------------------------
DROP TABLE IF EXISTS `t_student_00`;
CREATE TABLE `t_student_00` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `student_id` INT(11) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `age` INT(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
 
-- ----------------------------
-- Table structure for t_student_01
-- ----------------------------
DROP TABLE IF EXISTS `t_student_01`;
CREATE TABLE `t_student_01` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `student_id` INT(11) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `age` INT(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
 
-- ----------------------------
-- Table structure for t_user_00
-- ----------------------------
DROP TABLE IF EXISTS `t_user_00`;
CREATE TABLE `t_user_00` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `age` INT(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;
 
-- ----------------------------
-- Table structure for t_user_01
-- ----------------------------
DROP TABLE IF EXISTS `t_user_01`;
CREATE TABLE `t_user_01` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `age` INT(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
 
-- ----------------------------
-- Table structure for t_user_02
-- ----------------------------
DROP TABLE IF EXISTS `t_user_02`;
CREATE TABLE `t_user_02` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `age` INT(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;