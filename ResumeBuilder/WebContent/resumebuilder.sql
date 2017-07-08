-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.13-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.2.0.4947
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for resume
CREATE DATABASE IF NOT EXISTS `resume` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `resume`;


-- Dumping structure for table resume.city
CREATE TABLE IF NOT EXISTS `city` (
  `countryid` varchar(50) NOT NULL,
  `stateid` varchar(50) NOT NULL,
  `cityid` varchar(50) NOT NULL,
  `cityname` varchar(50) NOT NULL,
  PRIMARY KEY (`cityid`),
  KEY `c-c` (`countryid`),
  KEY `s-c` (`stateid`),
  CONSTRAINT `c-c` FOREIGN KEY (`countryid`) REFERENCES `country` (`countryid`),
  CONSTRAINT `s-c` FOREIGN KEY (`stateid`) REFERENCES `state` (`stateid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table resume.city: ~4 rows (approximately)
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` (`countryid`, `stateid`, `cityid`, `cityname`) VALUES
	('1', '1', '1', 'Vijayawada'),
	('1', '1', '2', 'Vizag'),
	('1', '1', '3', 'Srikakulam'),
	('1', '2', '4', 'hyderabad');
/*!40000 ALTER TABLE `city` ENABLE KEYS */;


-- Dumping structure for table resume.country
CREATE TABLE IF NOT EXISTS `country` (
  `countryid` varchar(50) NOT NULL,
  `countryname` varchar(50) NOT NULL,
  PRIMARY KEY (`countryid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table resume.country: ~2 rows (approximately)
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` (`countryid`, `countryname`) VALUES
	('1', 'India'),
	('2', 'USA');
/*!40000 ALTER TABLE `country` ENABLE KEYS */;


-- Dumping structure for table resume.state
CREATE TABLE IF NOT EXISTS `state` (
  `stateid` varchar(50) NOT NULL,
  `statename` varchar(50) DEFAULT NULL,
  `countryid` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`stateid`),
  KEY `c-s` (`countryid`),
  CONSTRAINT `c-s` FOREIGN KEY (`countryid`) REFERENCES `country` (`countryid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table resume.state: ~3 rows (approximately)
/*!40000 ALTER TABLE `state` DISABLE KEYS */;
INSERT INTO `state` (`stateid`, `statename`, `countryid`) VALUES
	('1', 'Andhra Pradesh', '1'),
	('2', 'Telangana', '1'),
	('3', 'Tamilanadu', '1');
/*!40000 ALTER TABLE `state` ENABLE KEYS */;


-- Dumping structure for table resume.users
CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `full_name` varchar(50) NOT NULL DEFAULT '0',
  `email` varchar(50) DEFAULT NULL,
  `mobile_no_pass` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `mobile_no_pass` (`mobile_no_pass`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8 COMMENT='user details will be stored in this table';

-- Dumping data for table resume.users: ~15 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`user_id`, `full_name`, `email`, `mobile_no_pass`, `password`) VALUES
	(10, 'ajay', 'ajayandsfsdil465@gmail.com', '2312312', 'asd'),
	(11, 'asdaslkdj', 'dsf@es.com', '345345', '34'),
	(12, 'sdlfkj', 'sdlkf@sd.com', '2323', '12'),
	(17, 'ksdjk', 'lkdxdfcjsk@ksdfj.com', '324234', '353'),
	(20, 'ajay', 'ajauk0213@gmail.com', '34234324', '2356'),
	(22, 'ajay', 'ajaykusdfsmarkutikuppala@gmail.com', '342343243', '334'),
	(23, 'ajay', 'ajaykumarsdfs3@gmail.com', '789777', '4343'),
	(24, 'ajay', 'ajayaail@gmail.com', '342324', 'asd'),
	(26, 'ajay', 'ajaykumarkutikuppala@gmail.com', '2324', '3453'),
	(28, 'ajay', 'sdf', '23241212', '33'),
	(29, 'ajay', 'ajaykumark0ftfy213@gmail.com', '232445', '343'),
	(30, 'ajay', 'ajayanil465@gmail.com', '23244', 'ssad'),
	(31, 'ajay', 'maheshs642@gmail.com', '2324567', '34'),
	(33, 'ajay', 'ajaykumark0213@gmail.com', '2324454', '23534567'),
	(34, 'ajay', 'kothwalgiri@gmail.com', '232311', '343');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;


-- Dumping structure for table resume.user_details
CREATE TABLE IF NOT EXISTS `user_details` (
  `user_id` int(11) unsigned DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `entry_level` varchar(50) DEFAULT NULL,
  `strengths` varchar(300) DEFAULT NULL,
  `address` varchar(300) DEFAULT NULL,
  `country` varchar(300) DEFAULT NULL,
  `state` varchar(300) DEFAULT NULL,
  `city` varchar(300) DEFAULT NULL,
  `habbits` varchar(100) DEFAULT NULL,
  `profile_pic` varchar(300) DEFAULT NULL,
  `obj` varchar(300) DEFAULT NULL,
  KEY `pd` (`user_id`),
  CONSTRAINT `pd` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table resume.user_details: ~15 rows (approximately)
/*!40000 ALTER TABLE `user_details` DISABLE KEYS */;
INSERT INTO `user_details` (`user_id`, `dob`, `entry_level`, `strengths`, `address`, `country`, `state`, `city`, `habbits`, `profile_pic`, `obj`) VALUES
	(10, '0016-05-08', 'fres', 'pdsfjsdpoio', 'lskdfjaskdfji', 'India', 'Telangana', 'hyderabad', 'ldijjasilj', 'images/a.png', 'oidfjasi'),
	(11, '0009-05-22', 'exp', 'fghl;kdf;o', ' dgsdfplpl\'p', 'select', 'select', 'select', ' ;fhkdfl;\r\n  ', 'images/ajax-processing.gif', 's;rlgdsjD;LF'),
	(12, '0020-06-07', 'exp', 'sdfk', ';sdkf', 'India', 'Andhra Pradesh', 'Vijayawada', ';sldkfj', 'images/a.png', 'sdkfjk'),
	(17, '0013-06-07', 'exp', 'lkfj', 'ldfk;l', 'India', 'Andhra Pradesh', 'Vijayawada', 'lkdfj', 'images/logoo.png', 'xlvkxk'),
	(20, '0018-06-04', 'fresher', 'strr', ' addres', 'India', 'Andhra Pradesh', 'Vijayawada', ' hab\r\n  ', 'images/h.png', 'obj'),
	(22, '0004-06-18', 'fresher', 'jsfhsdjsh', '  addres', 'india', 'telangana', 'hyd', '  laskjdaskldjasldh\r\n  \r\n  ', 'images/h.png', 'asfalsfjalsjfaslkdjaslkdjaslkd'),
	(23, '0009-06-07', 'fresher', 'ajay', 'ajay', 'India', 'Andhra Pradesh', 'Vijayawada', 'ajay', 'images/Database-Design-582x445.jpg', 'ajay'),
	(24, '2012-12-12', 'fresher', 'jsfhsdjsh', 'addres', 'india', 'telangana', 'hyd', 'laskjdaskldjasldh', 'images/Emily-VanCamp-HD-Wallpaper.jpg', 'asfalsfjalsjfaslkdjaslkdjaslkd'),
	(26, '0018-06-04', 'fresher', 'jsfhsdjsh', ' addres', 'india', 'telangana', 'hyd', ' laskjdaskldjasldh\r\n  ', 'images/a.png', 'asfalsfjalsjfaslkdjaslkdjaslkd'),
	(28, '0018-06-04', 'fresher', 'jsfhsdjsh', ' addres', 'india', 'telangana', 'hyd', ' laskjdaskldjasldh\r\n  ', 'images/ajax-processing.gif', 'asfalsfjalsjfaslkdjaslkdjaslkd'),
	(29, '0018-06-01', 'fresher', 'jsfhsdjsh', '   addres', 'india', 'telangana', 'hyd', '   laskjdaskldjasldh\r\n  \r\n  \r\n  ', 'images/h.png', 'asfalsfjalsjfaslkdjaslkdjaslkd'),
	(30, '0018-06-04', 'fresher', 'jsfhsdjsh', ' addres', 'india', 'telangana', 'hyd', ' laskjdaskldjasldh\r\n  ', 'images/ajax-processing.gif', 'asfalsfjalsjfaslkdjaslkdjaslkd'),
	(31, '0018-06-04', 'fresher', 'jsfhsdjsh', ' addres', 'india', 'telangana', 'hyd', ' laskjdaskldjasldh\r\n  ', 'images/ajax-processing.gif', 'asfalsfjalsjfaslkdjaslkdjaslkd'),
	(33, '0018-06-04', 'fresher', 'jsfhsdjsh', ' addres', 'india', 'telangana', 'hyd', ' laskjdaskldjasldh\r\n  ', 'images/ajax-processing.gif', 'asfalsfjalsjfaslkdjaslkdjaslkd'),
	(34, '0018-06-04', 'fresher', 'jsfhsdjsh', ' addres', 'india', 'telangana', 'hyd', ' laskjdaskldjasldh\r\n  ', 'images/a.png', 'asfalsfjalsjfaslkdjaslkdjaslkd');
/*!40000 ALTER TABLE `user_details` ENABLE KEYS */;


-- Dumping structure for table resume.user_education_details
CREATE TABLE IF NOT EXISTS `user_education_details` (
  `user_id` int(10) unsigned DEFAULT NULL,
  `stream` varchar(200) DEFAULT NULL,
  `college_name` varchar(200) DEFAULT NULL,
  `board` varchar(200) DEFAULT NULL,
  `date_of_passing` date DEFAULT NULL,
  `percentage` float DEFAULT NULL,
  KEY `user_ed` (`user_id`),
  CONSTRAINT `user_ed` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table resume.user_education_details: ~45 rows (approximately)
/*!40000 ALTER TABLE `user_education_details` DISABLE KEYS */;
INSERT INTO `user_education_details` (`user_id`, `stream`, `college_name`, `board`, `date_of_passing`, `percentage`) VALUES
	(10, 'schooling', 'lifgujdipu', 'pieuf\'si', '0009-05-08', 345),
	(10, 'Intermediate', 'idfjdij', 'spodfusdou', '0009-05-08', 234),
	(10, NULL, '\'dofsdo;j', 'Graduation', '0008-05-08', 23),
	(11, 'schooling', 'd;fgdkl;', ';dofgikdo;', '0009-05-15', 23),
	(11, 'Intermediate', 'fthdf', 'dfgd', '0009-05-14', 23),
	(11, 'Graduation', 'dfds', 'fgdf', '0009-05-30', 12),
	(12, 'schooling', 'sdskfj', 'skdj', '0019-06-08', 23),
	(12, 'Intermediate', ';sldfk;', ';sdfkj', '0033-06-07', 23),
	(12, 'Graduation', 'skdfj', ';ksdfj', '0028-06-07', 23),
	(17, 'schooling', 'l;fkj', 'lkjsldfk', '0027-06-08', 32),
	(17, 'Intermediate', ';ldfk', ';lsfk', '0013-06-07', 34),
	(17, 'Graduation', ';ldfk', ';ldkgjl', '0021-06-07', 34),
	(20, 'schooling', 'sn', 'board', '0018-06-04', 23),
	(20, 'Intermediate', 'asd', 'sdf', '0018-06-04', 23),
	(20, 'Graduation', 'asd', 'asda', '0018-06-04', 22),
	(22, 'schooling', 'sn', 'board', '0004-06-18', 23),
	(22, 'Intermediate', 'asd', 'sdf', '0004-06-18', 23),
	(22, 'Graduation', 'asd', 'asda', '0004-06-18', 22),
	(23, 'schooling', 'sdij', 'dfijh', '0009-06-07', 23),
	(23, 'Intermediate', 'isdfj', 'sdjf', '0009-06-07', 23),
	(23, 'Graduation', 'sdlkf', 'lksdfj', '0009-06-07', 23),
	(24, 'schooling', 'sn', 'board', '2012-12-12', 23),
	(24, 'college', 'asd', 'sdf', '2012-12-12', 23),
	(24, 'graduation', 'asd', 'asda', '2012-12-12', 22),
	(26, 'schooling', 'sn', 'board', '0018-06-04', 23),
	(26, 'Intermediate', 'asd', 'sdf', '0018-06-04', 23),
	(26, 'Graduation', 'asd', 'asda', '0018-06-04', 22),
	(28, 'schooling', 'sn', 'board', '0018-06-04', 23),
	(28, 'Intermediate', 'asd', 'sdf', '0018-06-04', 23),
	(28, 'Graduation', 'asd', 'asda', '0018-06-04', 22),
	(29, 'schooling', 'sn', 'board', '0018-06-04', 23),
	(29, 'Intermediate', 'asd', 'sdf', '0018-06-04', 23),
	(29, 'Graduation', 'asd', 'asda', '0018-06-04', 22),
	(30, 'schooling', 'sn', 'board', '0018-06-04', 23),
	(30, 'Intermediate', 'asd', 'sdf', '0018-06-04', 23),
	(30, 'Graduation', 'asd', 'asda', '0018-06-04', 22),
	(31, 'schooling', 'sn', 'board', '0018-06-04', 23),
	(31, 'Intermediate', 'asd', 'sdf', '0018-06-04', 23),
	(31, 'Graduation', 'asd', 'asda', '0018-06-04', 22),
	(33, 'schooling', 'sn', 'board', '0018-06-04', 23),
	(33, 'Intermediate', 'asd', 'sdf', '0018-06-04', 23),
	(33, 'Graduation', 'asd', 'asda', '0018-06-04', 22),
	(34, 'schooling', 'sn', 'board', '0018-06-04', 23),
	(34, 'Intermediate', 'asd', 'sdf', '0018-06-04', 23),
	(34, 'Graduation', 'asd', 'asda', '0018-06-04', 22);
/*!40000 ALTER TABLE `user_education_details` ENABLE KEYS */;


-- Dumping structure for table resume.user_project
CREATE TABLE IF NOT EXISTS `user_project` (
  `user_id` int(10) unsigned DEFAULT NULL,
  `proj_title` varchar(300) DEFAULT NULL,
  `domaim` varchar(300) DEFAULT NULL,
  `team_size` int(10) DEFAULT NULL,
  `role` varchar(100) DEFAULT NULL,
  `desc` varchar(300) DEFAULT NULL,
  KEY `user_project` (`user_id`),
  CONSTRAINT `user_project` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table resume.user_project: ~15 rows (approximately)
/*!40000 ALTER TABLE `user_project` DISABLE KEYS */;
INSERT INTO `user_project` (`user_id`, `proj_title`, `domaim`, `team_size`, `role`, `desc`) VALUES
	(10, 'dsfiou', 'sdofo', 23, 'sdoj', 'sodv;ocsdo'),
	(11, 'dghdf', 'FG', 45, 'GNB', 'FGBC'),
	(12, 'sdlfk', 'sldkf', 12, 'ldsfk', 's;dlfk'),
	(17, 'sdl;fkj', 'xflgk', 34, ';ldfk', ';lxkv'),
	(20, 'title', 'domain', 23, 'role', 'desc'),
	(22, 'title', 'domain', 23, 'role', 'desc'),
	(23, 'asdlk', 'sdfk', 2, 'ldkf', 'lkdfjs'),
	(24, 'title', 'domain', 23, 'role', 'desc'),
	(26, 'title', 'domain', 23, 'role', 'desc'),
	(28, 'title', 'domain', 23, 'role', 'desc'),
	(29, 'title', 'domain', 23, 'role', 'desc'),
	(30, 'title', 'domain', 23, 'role', 'desc'),
	(31, 'title', 'domain', 23, 'role', 'desc'),
	(33, 'title', 'domain', 23, 'role', 'desc'),
	(34, 'title', 'domain', 23, 'role', 'desc');
/*!40000 ALTER TABLE `user_project` ENABLE KEYS */;


-- Dumping structure for table resume.user_tech_skills
CREATE TABLE IF NOT EXISTS `user_tech_skills` (
  `user_id` int(10) unsigned DEFAULT NULL,
  `skill` varchar(100) DEFAULT NULL,
  KEY `user_skill` (`user_id`),
  CONSTRAINT `user_skill` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table resume.user_tech_skills: ~15 rows (approximately)
/*!40000 ALTER TABLE `user_tech_skills` DISABLE KEYS */;
INSERT INTO `user_tech_skills` (`user_id`, `skill`) VALUES
	(10, 'sptm epfiw[epif[p'),
	(11, '  fghdfgdf'),
	(12, ';welfk;le'),
	(17, 'lfgkdfl;'),
	(20, '  tech'),
	(22, '    tech'),
	(23, 'dkjflkfj'),
	(24, 'tech'),
	(26, '  tech'),
	(28, '  tech'),
	(29, '      tech'),
	(30, '  tech'),
	(31, '  tech'),
	(33, '  tech'),
	(34, '  tech');
/*!40000 ALTER TABLE `user_tech_skills` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
