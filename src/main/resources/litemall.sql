/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80019
Source Host           : localhost:3306
Source Database       : litemall

Target Server Type    : MYSQL
Target Server Version : 80019
File Encoding         : 65001

Date: 2020-07-21 17:55:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for litemall_ad
-- ----------------------------
DROP TABLE IF EXISTS `litemall_ad`;
CREATE TABLE `litemall_ad` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `link` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `url` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `content` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `startTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  `deleted` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of litemall_ad
-- ----------------------------
INSERT INTO `litemall_ad` VALUES ('1', 'OLED小米电视 ', 'http://baidu.com/sds.html', 'www.ass.clink.com', '21日,有记者在外交部例行记者会上就此事提问称,美国商务部又将11家中国公司列入被制裁的实体清单中,并且称它们是因为实施了中国对新疆少数民族进行镇压、大规模...', '2020-07-21 17:52:59', '2020-07-21 17:53:03', '\0');
