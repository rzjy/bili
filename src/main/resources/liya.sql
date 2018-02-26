/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50626
Source Host           : 127.0.0.1:3306
Source Database       : liya

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2018-02-26 23:18:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `user_id` bigint(32) NOT NULL COMMENT '用户ID',
  `nick_name` varchar(100) DEFAULT NULL COMMENT '昵称',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `avatar_url` varchar(1024) DEFAULT NULL COMMENT '头像URL',
  `birthday` varchar(64) DEFAULT NULL COMMENT '生日',
  `gender` varchar(16) DEFAULT NULL COMMENT '性别',
  `introduction` varchar(1024) DEFAULT NULL COMMENT '简介',
  `phone_no` varchar(16) DEFAULT NULL COMMENT '手机号',
  `email` varchar(32) DEFAULT NULL,
  `works_num` int(11) DEFAULT NULL,
  `fans_num` int(11) DEFAULT NULL,
  `attention_num` int(11) DEFAULT NULL,
  `coin_purse` int(11) DEFAULT NULL COMMENT 'lingqianbao',
  `regdate` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------

-- ----------------------------
-- Table structure for feed
-- ----------------------------
DROP TABLE IF EXISTS `feed`;
CREATE TABLE `feed` (
  `feed_id` bigint(32) NOT NULL,
  `user_id` bigint(32) NOT NULL,
  `purchase_num` int(11) DEFAULT NULL,
  `coin_num` int(11) DEFAULT NULL,
  `publish_time` varchar(64) DEFAULT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `browse_num` int(11) DEFAULT NULL,
  `has_audio` int(11) DEFAULT NULL,
  `audio_url` varchar(1024) DEFAULT NULL,
  `audio_duration` varchar(64) DEFAULT NULL,
  `media_file_num` int(11) DEFAULT NULL,
  `like_num` int(11) DEFAULT NULL,
  `tags` varchar(1024) DEFAULT NULL,
  `download_support` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`feed_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of feed
-- ----------------------------

-- ----------------------------
-- Table structure for learn_resource
-- ----------------------------
DROP TABLE IF EXISTS `learn_resource`;
CREATE TABLE `learn_resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `author` varchar(20) DEFAULT NULL COMMENT '作者',
  `title` varchar(100) DEFAULT NULL COMMENT '描述',
  `url` varchar(100) DEFAULT NULL COMMENT '地址链接',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1030 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of learn_resource
-- ----------------------------
INSERT INTO `learn_resource` VALUES ('999', '官方SpriongBoot例子', '官方SpriongBoot例子', 'https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples');
INSERT INTO `learn_resource` VALUES ('1000', '龙果学院', 'Spring Boot 教程系列学习', 'http://www.roncoo.com/article/detail/124661');
INSERT INTO `learn_resource` VALUES ('1001', '嘟嘟MD独立博客', 'Spring Boot干货系列', 'http://tengj.top/');
INSERT INTO `learn_resource` VALUES ('1002', '后端编程嘟', 'Spring Boot视频教程', 'http://www.toutiao.com/m1559096720023553/');
INSERT INTO `learn_resource` VALUES ('1003', '程序猿DD', 'Spring Boot系列', 'http://www.roncoo.com/article/detail/125488');
INSERT INTO `learn_resource` VALUES ('1004', '纯洁的微笑', 'Sping Boot系列文章', 'http://www.ityouknow.com/spring-boot');
INSERT INTO `learn_resource` VALUES ('1005', 'CSDN——小当博客专栏', 'Sping Boot学习', 'http://blog.csdn.net/column/details/spring-boot.html');
INSERT INTO `learn_resource` VALUES ('1006', '梁桂钊的博客', 'Spring Boot 揭秘与实战', 'http://blog.csdn.net/column/details/spring-boot.html');
INSERT INTO `learn_resource` VALUES ('1007', '林祥纤博客系列', '从零开始学Spring Boot', 'http://412887952-qq-com.iteye.com/category/356333');
INSERT INTO `learn_resource` VALUES ('1028', '杜琪', '关于Spring Boot的博客集合', 'http://www.jianshu.com/p/7e2e5e7b32ab');
INSERT INTO `learn_resource` VALUES ('1029', 'liya', 'liya', '22222');

-- ----------------------------
-- Table structure for media_file
-- ----------------------------
DROP TABLE IF EXISTS `media_file`;
CREATE TABLE `media_file` (
  `file_id` bigint(32) NOT NULL,
  `feed_id` bigint(32) DEFAULT NULL,
  `type` varchar(32) DEFAULT NULL,
  `size` bigint(32) DEFAULT NULL,
  `blurred` int(11) DEFAULT NULL COMMENT '是否模糊',
  `updateTime` varchar(64) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `thumb_origin_url` varchar(1024) DEFAULT NULL,
  `origin_url` varchar(1024) DEFAULT NULL,
  `thumb_blur_url` varchar(1024) DEFAULT NULL,
  `blur_url` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of media_file
-- ----------------------------
