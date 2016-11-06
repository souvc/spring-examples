/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2016-11-06 10:16:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_actor
-- ----------------------------
DROP TABLE IF EXISTS `t_actor`;
CREATE TABLE `t_actor` (
  `id` int(11) NOT NULL auto_increment,
  `first_name` varchar(50) default NULL,
  `last_name` varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_actor
-- ----------------------------
INSERT INTO `t_actor` VALUES ('1', 'souvc', 'com');
INSERT INTO `t_actor` VALUES ('2', 'www', 'souvc');
