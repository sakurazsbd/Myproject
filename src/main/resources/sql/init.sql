CREATE TABLE IF NOT EXISTS `SYS_LOG` (
    `ID` integer(20) NOT NULL AUTO_INCREMENT COMMENT '保存用户的操作日志',
    `USERNAME` varchar(50) NULL COMMENT '用户名',
    `OPERATION` varchar(50) NULL COMMENT '用户操作',
    `TIME` integer(11) NULL COMMENT '响应时间',
    `METHOD` varchar(200) NULL COMMENT '请求方法',
    `PARAMS` varchar(200) NULL COMMENT '请求参数',
    `IP` varchar(64) NULL COMMENT 'IP地址',
    `CREATE_TIME` date NULL COMMENT '创建时间',
    PRIMARY KEY (`ID`)
    ) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='日志记录表';