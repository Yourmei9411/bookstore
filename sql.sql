CREATE TABLE `vip_tbl` (
  `v_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `vipName` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `date` datetime NOT NULL,
  `balance` int(11) NOT NULL,
  PRIMARY KEY (`v_id`),
  UNIQUE KEY `vipName_UNIQUE` (`vipName`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `vip_tbl` (
  `v_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `vipName` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `date` datetime NOT NULL,
  `balance` int(11) NOT NULL,
  PRIMARY KEY (`v_id`),
  UNIQUE KEY `vipName_UNIQUE` (`vipName`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `vip_tbl` (
  `v_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `vipName` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `date` datetime NOT NULL,
  `balance` int(11) NOT NULL,
  PRIMARY KEY (`v_id`),
  UNIQUE KEY `vipName_UNIQUE` (`vipName`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;