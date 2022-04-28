/*
MySQL Backup
Database: stest
Backup Time: 2022-04-28 10:54:34
*/

SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `stest`.`test_jpa_classes`;
DROP TABLE IF EXISTS `stest`.`test_jpa_grade`;
DROP TABLE IF EXISTS `stest`.`test_jpa_student`;
CREATE TABLE `test_jpa_classes` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `grade_id` bigint(20) DEFAULT NULL,
  `grade_name` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
CREATE TABLE `test_jpa_grade` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
CREATE TABLE `test_jpa_student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `age` int(11) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `order_num` int(11) NOT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `classes` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;
BEGIN;
LOCK TABLES `stest`.`test_jpa_classes` WRITE;
DELETE FROM `stest`.`test_jpa_classes`;
INSERT INTO `stest`.`test_jpa_classes` (`id`,`code`,`grade_id`,`grade_name`,`name`) VALUES (1, '1_1', 1, '1年级', '1-1班'),(2, '1_2', 1, '1年级', '1-2班'),(3, '2_1', 2, '2年级', '2-1班');
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `stest`.`test_jpa_grade` WRITE;
DELETE FROM `stest`.`test_jpa_grade`;
INSERT INTO `stest`.`test_jpa_grade` (`id`,`code`,`name`) VALUES (1, 'g1', '1年级'),(2, 'g2', '2年级');
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `stest`.`test_jpa_student` WRITE;
DELETE FROM `stest`.`test_jpa_student`;
INSERT INTO `stest`.`test_jpa_student` (`id`,`age`,`code`,`name`,`order_num`,`sex`,`status`,`classes`) VALUES (1, 8, 's1', '张三', 0, '1', NULL, 1),(2, 10, 's2', '李四', 2, '1', '1', 2),(3, 9, 's3', '王五', 3, '1', '2', 3),(4, 8, 's4', '张显影', 1, '2', '1', 1),(5, 11, 's5', '李显', 1, '0', '3', 3),(6, 7, 's6', '王普', 2, '2', '1', 1),(7, 9, 's7', '孙电夺', 1, '1', '1', 2);
UNLOCK TABLES;
COMMIT;
