/*
Navicat MySQL Data Transfer

Source Server         : 110.64.69.104_12380
Source Server Version : 50719
Source Host           : 110.64.69.104:12380
Source Database       : IntegralManagementSys

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-08-26 20:32:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for Account
-- ----------------------------
DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account` (
  `userID` char(12) NOT NULL COMMENT '账户ID',
  `userName` varchar(255) NOT NULL COMMENT '用户名',
  `password` varchar(255) NOT NULL COMMENT '登录密码',
  `realName` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `netInDate` date NOT NULL COMMENT '入网日期',
  `birth` date DEFAULT NULL COMMENT '出生年月',
  `telephone` char(11) NOT NULL COMMENT '联系电话',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `level` int(4) unsigned zerofill NOT NULL COMMENT '账户等级',
  `currentIntegral` int(6) unsigned zerofill NOT NULL COMMENT '现有总积分',
  PRIMARY KEY (`userID`),
  UNIQUE KEY `userNameIndex` (`userName`) USING BTREE,
  UNIQUE KEY `telephoneIndex` (`telephone`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Integral
-- ----------------------------
DROP TABLE IF EXISTS `Integral`;
CREATE TABLE `Integral` (
  `integralID` char(12) NOT NULL COMMENT '积分ID',
  `userID` char(12) NOT NULL COMMENT '账户ID',
  `integralType` int(4) NOT NULL COMMENT '积分类型',
  `value` int(6) unsigned zerofill NOT NULL COMMENT '分值',
  `startDate` date NOT NULL COMMENT '获得日期',
  `expDate` date NOT NULL COMMENT '截止日期',
  PRIMARY KEY (`integralID`),
  KEY `userID` (`userID`) USING BTREE,
  CONSTRAINT `userID_for` FOREIGN KEY (`userID`) REFERENCES `Account` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for IntegralChangeRecord
-- ----------------------------
DROP TABLE IF EXISTS `IntegralChangeRecord`;
CREATE TABLE `IntegralChangeRecord` (
  `changeID` char(12) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '积分记录ID',
  `integralID` char(12) NOT NULL COMMENT '积分ID',
  `changeValue` int(6) NOT NULL COMMENT '变化分值',
  `changeTime` datetime NOT NULL COMMENT '变化时间',
  `reason` int(4) NOT NULL COMMENT '变化原因',
  `reasonExtra` char(12) DEFAULT NULL COMMENT '原因补充',
  PRIMARY KEY (`changeID`),
  KEY `integralID` (`integralID`),
  CONSTRAINT `integralID` FOREIGN KEY (`integralID`) REFERENCES `Integral` (`integralID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Present
-- ----------------------------
DROP TABLE IF EXISTS `Present`;
CREATE TABLE `Present` (
  `presentID` char(12) NOT NULL COMMENT '礼品ID',
  `presentType` int(4) NOT NULL COMMENT '礼品类型',
  `presentPrice` double(10,2) unsigned NOT NULL COMMENT '礼品价值',
  `costIntegral` int(6) unsigned zerofill NOT NULL COMMENT '消耗积分',
  `presentNum` int(8) unsigned zerofill NOT NULL COMMENT '礼品数量',
  PRIMARY KEY (`presentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for PresentExchangeRecord
-- ----------------------------
DROP TABLE IF EXISTS `PresentExchangeRecord`;
CREATE TABLE `PresentExchangeRecord` (
  `exchangeID` char(12) NOT NULL COMMENT '兑换记录ID',
  `presentID` char(12) NOT NULL COMMENT '礼品ID',
  `exchangeTime` datetime NOT NULL COMMENT '兑换日期',
  PRIMARY KEY (`exchangeID`),
  KEY `presentID` (`presentID`) USING BTREE,
  CONSTRAINT `presentID` FOREIGN KEY (`presentID`) REFERENCES `Present` (`presentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for Priority
-- ----------------------------
DROP TABLE IF EXISTS `Priority`;
CREATE TABLE `Priority` (
  `priorityID` char(12) NOT NULL,
  PRIMARY KEY (`priorityID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
