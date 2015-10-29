CREATE TABLE `TBL_CLASS` (
  `ID` varchar(32) NOT NULL COMMENT '课程ID',
  `title` varchar(256) NOT NULL COMMENT '课程标题',
  `introduce` varchar(2048) NOT NULL COMMENT '课程介绍',
  `vediopath` varchar(2048) NOT NULL COMMENT '视频地址',
  `imgPath` varchar(2048) NOT NULL COMMENT '图片地址',
  `ahthorID` varchar(32) NOT NULL COMMENT '作者ID',
  `fieldID` varchar(32) NOT NULL COMMENT '领域ID',
  `offlineClassId` varchar(64) DEFAULT NULL COMMENT '线下课程ID',
  `tag1` varchar(32) NOT NULL COMMENT '标签1',
  `tag2` varchar(32) DEFAULT NULL COMMENT '标签2',
  `tag3` varchar(32) DEFAULT NULL COMMENT '标签2',
  `type` varchar(8) NOT NULL COMMENT '课程类型',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `deleteTime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`,`ahthorID`,`fieldID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8；


CREATE TABLE `TBL_FIELD` (
  `ID` varchar(32) NOT NULL COMMENT '领域ID',
  `name` varchar(32) NOT NULL COMMENT '领域名',
  `desc` varchar(1024) NOT NULL COMMENT '领域描述',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `deleteTime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `TBL_ACOUNT_FIELD` (
  `fieldID` varchar(32) NOT NULL COMMENT '领域ID',
  `accountID` varchar(32) NOT NULL COMMENT '菁英账号ID',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `deleteTime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`fieldID`,`accountID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `TBL_SLIDE` (
  `ID` varchar(32) NOT NULL COMMENT '滚动广告ID',
  `position` int NOT NULL COMMENT '广告位置',
  `objectID` varchar(32) NOT NULL COMMENT '目标ID',
  `introduce` varchar(64) NOT NULL COMMENT '介绍',
  `slideindex` int COMMENT '索引',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `deleteTime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`,`objectID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `TBL_OFFLINECLASS` (
  `ID` varchar(32) NOT NULL COMMENT '课程ID',
  `title` varchar(256) NOT NULL COMMENT '课程标题',
  `introduce` varchar(2048) NOT NULL COMMENT '课程介绍',
  `startTime` datetime NOT NULL COMMENT '开课时间',
  `imgPath` varchar(2048) NOT NULL COMMENT '图片地址',
  `address` varchar(2048) NOT NULL COMMENT '开课地点',
  `tag1` varchar(32) NOT NULL COMMENT '标签1',
  `tag2` varchar(32) COMMENT '标签2',
  `tag3` varchar(32) COMMENT '标签3',
  `ahthorID` varchar(32) COMMENT '作者ID',
  `maxNumber` int COMMENT '报名人数限制',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `deleteTime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `TBL_OFFLINECLASS_ENROLL` (
  `offlineclassID` varchar(32) NOT NULL COMMENT '线下课程ID',
  `userID` varchar(32) NOT NULL COMMENT '报名用户ID',
  `status` int COMMENT '报名用户ID',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `deleteTime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`offlineclassID`,`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `TBL_APPOINT_INFO` (
  `ID` varchar(32) NOT NULL COMMENT '索引',
  `teacherID` varchar(32) NOT NULL COMMENT '导师ID',
  `price` int COMMENT '预约价格',
  `responseTime` varchar(32) NOT NULL COMMENT '响应时间',
  `topic` varchar(128) NOT NULL COMMENT '话题',
  `status` int COMMENT '状态',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `deleteTime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `TBL_APPOINT_TIME` (
  `appinfoid` varchar(32) NOT NULL COMMENT '索引',
  `segStartTtime` datetime NOT NULL COMMENT '开始时间',
  `segEndTime` datetime NOT NULL COMMENT '结束时间',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `deleteTime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`appinfoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `TBL_APPOINT` (
  `ID` varchar(32) NOT NULL COMMENT '索引',
  `userid` varchar(32) NOT NULL COMMENT '学员ID',
  `appinfoID` varchar(32) NOT NULL COMMENT '预约ID',
  `flowStatus` int COMMENT '流程状态',
  `content` varchar(1024) NOT NULL COMMENT '话题',
  `address` varchar(1024) NOT NULL COMMENT '见面地点',
  `appTime` datetime NOT NULL COMMENT '见面时间',
  `orderid` varchar(32) COMMENT '订单ID',
  `evaluate` varchar(1024) COMMENT '学员评价',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `deleteTime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

CREATE TABLE `TBL_ORDER` (
  `ID` varchar(32) NOT NULL COMMENT '索引',
  `userid` varchar(32) NOT NULL COMMENT '学员ID',
  `appinfoID` varchar(32) NOT NULL COMMENT '预约ID',
  `status` varchar(32) COMMENT '订单状态',
  `purchaseSN` varchar(32) NOT NULL COMMENT '平台订单ID',
  `paytype` varchar(32) NOT NULL COMMENT '支付方式',
  `amount` int NOT NULL COMMENT '支付金额',
  `currency` varchar(8) COMMENT '币种',
  `accountid` varchar(32) COMMENT '支付账户ID',
  `payeeID` varchar(32) COMMENT '收款帐号ID',
  `paytime` datetime NOT NULL COMMENT '支付时间',
  `createTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP,
  `deleteTime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8




