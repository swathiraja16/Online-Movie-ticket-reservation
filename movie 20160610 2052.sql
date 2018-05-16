-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.34-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema movie_ticket
--

CREATE DATABASE IF NOT EXISTS movie_ticket;
USE movie_ticket;

--
-- Definition of table `booking`
--

DROP TABLE IF EXISTS `booking`;
CREATE TABLE `booking` (
  `booking_id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_id` int(11) DEFAULT NULL,
  `theater_id` int(11) DEFAULT NULL,
  `booking_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `booking_status` varchar(10) DEFAULT NULL,
  `show_date` date NOT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `shows` int(11) DEFAULT '1',
  PRIMARY KEY (`booking_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` (`booking_id`,`movie_id`,`theater_id`,`booking_date`,`booking_status`,`show_date`,`customer_id`,`shows`) VALUES 
 (1,1,1,'2016-05-01 10:29:20','Done','2016-05-05',NULL,1),
 (2,1,1,'2016-05-06 06:17:00','Done','2016-05-06',2,1),
 (3,1,1,'2016-05-06 14:53:34','Done','2016-05-06',2,1),
 (4,1,1,'2016-05-07 15:40:03','Done','2016-05-12',3,1),
 (5,1,1,'2016-05-07 16:31:29','Done','2016-05-12',4,2),
 (6,1,1,'2016-05-08 20:13:48','Done','2016-05-12',6,1),
 (7,1,1,'2016-05-13 14:08:39','Done','2016-05-14',4,2),
 (8,1,1,'2016-05-13 21:52:53','Done','2016-05-20',6,1),
 (9,1,1,'2016-05-13 21:53:40','Done','2016-05-20',6,1),
 (10,1,1,'2016-05-13 21:55:16','Done','2016-05-19',6,1),
 (11,1,1,'2016-05-13 22:06:40','Done','2016-05-19',7,3),
 (12,1,1,'2016-05-13 22:13:23','Done','2016-05-18',6,1),
 (13,2,2,'2016-05-16 09:49:38','Done','2016-05-16',4,1),
 (14,3,3,'2016-05-16 11:49:54','Done','2016-05-17',4,1),
 (15,3,3,'2016-05-16 11:51:23','Done','2016-05-17',7,1);
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;


--
-- Definition of table `booking_seats`
--

DROP TABLE IF EXISTS `booking_seats`;
CREATE TABLE `booking_seats` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `booking_id` int(11) DEFAULT NULL,
  `movie_id` int(11) DEFAULT NULL,
  `theater_id` int(11) DEFAULT NULL,
  `show_date` date DEFAULT NULL,
  `seat_no` int(11) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `shows` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking_seats`
--

/*!40000 ALTER TABLE `booking_seats` DISABLE KEYS */;
INSERT INTO `booking_seats` (`id`,`booking_id`,`movie_id`,`theater_id`,`show_date`,`seat_no`,`customer_id`,`shows`) VALUES 
 (5,1,1,1,'2016-05-05',2,NULL,1),
 (6,1,1,1,'2016-05-05',3,NULL,1),
 (7,2,1,1,'2016-05-06',4,2,1),
 (8,2,1,1,'2016-05-06',5,2,1),
 (9,3,1,1,'2016-05-06',6,2,1),
 (10,3,1,1,'2016-05-06',7,2,1),
 (11,4,1,1,'2016-05-12',48,3,1),
 (12,4,1,1,'2016-05-12',49,3,1),
 (13,5,1,1,'2016-05-12',34,4,2),
 (14,5,1,1,'2016-05-12',35,4,2),
 (15,6,1,1,'2016-05-12',19,6,1),
 (16,6,1,1,'2016-05-12',20,6,1),
 (17,7,1,1,'2016-05-14',55,4,2),
 (18,8,1,1,'2016-05-20',35,6,1),
 (19,8,1,1,'2016-05-20',36,6,1),
 (20,9,1,1,'2016-05-20',49,6,1),
 (21,9,1,1,'2016-05-20',50,6,1),
 (22,10,1,1,'2016-05-19',49,6,1),
 (23,10,1,1,'2016-05-19',50,6,1),
 (24,11,1,1,'2016-05-19',34,7,3),
 (25,11,1,1,'2016-05-19',35,7,3),
 (26,12,1,1,'2016-05-18',50,6,1),
 (27,12,1,1,'2016-05-18',51,6,1),
 (28,13,2,2,'2016-05-16',34,4,1),
 (29,13,2,2,'2016-05-16',35,4,1),
 (30,14,3,3,'2016-05-17',33,4,1),
 (31,14,3,3,'2016-05-17',34,4,1),
 (32,14,3,3,'2016-05-17',68,4,1),
 (33,14,3,3,'2016-05-17',69,4,1),
 (34,14,3,3,'2016-05-17',70,4,1),
 (35,15,3,3,'2016-05-17',50,7,1),
 (36,15,3,3,'2016-05-17',51,7,1);
/*!40000 ALTER TABLE `booking_seats` ENABLE KEYS */;


--
-- Definition of table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `pwd` varchar(50) DEFAULT NULL,
  `customer_type` varchar(50) DEFAULT 'customer',
  `customer_status` varchar(10) DEFAULT NULL,
  `mobile` varchar(45) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `qua` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`customer_id`,`name`,`email`,`pwd`,`customer_type`,`customer_status`,`mobile`,`dob`,`qua`,`gender`) VALUES 
 (1,'Admin','admin@gmail.com','admin','Admin','active',NULL,NULL,NULL,NULL),
 (2,'manoj','manojreddy.mkr@gmail.com','manoj','Customer','active','9538114779',NULL,NULL,NULL),
 (3,'Susmitha','v.susmitha68@gmail.com','123','Customer','active','9060627144','1995-03-17','Student','FeMale'),
 (4,'vaishnavi','vaish.bly@gmail.com','vaish','Customer','active','8151990319','1995-01-14','Student','FeMale'),
 (5,'msisdh','dsfdf','manoj','Customer','active','9538114779','2019-05-02','hh','Male'),
 (6,'Swathi','rajaswathi16@gmail.com','swathi','Customer','active','8277593606','1994-04-16','Student','FeMale'),
 (7,'Susmitha','v.susmitha68@gmail.com','sush','Customer','active','9060627144','1995-03-17','Student','FeMale'),
 (8,'dfret','vaish.bly@gmail.com','123','Customer','active','rtweg','2016-05-11','gw','Male');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;


--
-- Definition of table `movie_cast`
--

DROP TABLE IF EXISTS `movie_cast`;
CREATE TABLE `movie_cast` (
  `cast_id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_id` int(11) DEFAULT NULL,
  `descs` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`cast_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `movie_cast`
--

/*!40000 ALTER TABLE `movie_cast` DISABLE KEYS */;
INSERT INTO `movie_cast` (`cast_id`,`movie_id`,`descs`) VALUES 
 (3,1,'dsfsddsad'),
 (4,1,'Lead Actors: Allu Arjun, Rakul Preet Singh, Catherine \r\nDirector: Boyapati seenu\r\nMusic Director: Thaman S S '),
 (5,2,'Lead Actors: Suriya, Samantha, Nithya Menen\r\nDirector: Vikram K Kumar\r\nMusic Director: A R Rahman'),
 (6,3,'Lead Cast: Tiger Shroff, Shradda Kapoor\r\nDirector: Sabbir Khan\r\nMusic Director:  Meet Bros, Amaal Mallik, Ankit Tiwari & Manj Musik ');
/*!40000 ALTER TABLE `movie_cast` ENABLE KEYS */;


--
-- Definition of table `movie_theater`
--

DROP TABLE IF EXISTS `movie_theater`;
CREATE TABLE `movie_theater` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_id` int(11) DEFAULT NULL,
  `theater_id` int(11) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `movie_status` varchar(45) DEFAULT 'active',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `movie_theater`
--

/*!40000 ALTER TABLE `movie_theater` DISABLE KEYS */;
INSERT INTO `movie_theater` (`id`,`movie_id`,`theater_id`,`start_date`,`movie_status`) VALUES 
 (1,1,1,'2016-05-02','inactive'),
 (2,1,1,'2016-05-02','inactive'),
 (3,2,2,'2016-05-06','active'),
 (4,3,3,'2016-04-29','active'),
 (5,6,1,'2016-05-11','active'),
 (6,4,4,'2016-04-29','active'),
 (7,5,5,'2016-04-29','active');
/*!40000 ALTER TABLE `movie_theater` ENABLE KEYS */;


--
-- Definition of table `movie_trailer`
--

DROP TABLE IF EXISTS `movie_trailer`;
CREATE TABLE `movie_trailer` (
  `trailer_id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_id` int(11) DEFAULT NULL,
  `trailer` varchar(500) DEFAULT NULL,
  `video_link` varchar(145) NOT NULL,
  PRIMARY KEY (`trailer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `movie_trailer`
--

/*!40000 ALTER TABLE `movie_trailer` DISABLE KEYS */;
INSERT INTO `movie_trailer` (`trailer_id`,`movie_id`,`trailer`,`video_link`) VALUES 
 (10,1,'null','Sarainodu Theatrical Trailer  Allu Arjun, Rakul Preet - Filmyfocus.com.mp4'),
 (11,2,'null','24 Official Trailer- Telugu  Suriya  Samantha  Nithya Menen  AR.Rahman  Vikram K Kumar.mp4'),
 (12,3,'null','Baaghi Official Trailer  Tiger Shroff & Shraddha Kapoor  Releasing April 29.mp4'),
 (13,4,'null','Chakravyuha  Full HD Trailer  Puneeth Rajkumar  Rachita Ram  SS Thaman.mp4'),
 (14,5,'null','Akira Kannada  Official Trailer -HD  New Kannada Movie Trailer 2016 Anish,Aditi,KrishiAvinash.mp4'),
 (15,6,'null','The Jungle Book Official Super Bowl Trailer (2016) - Scarlett Johansson, Bill Murray Movie HD (1).mp4');
/*!40000 ALTER TABLE `movie_trailer` ENABLE KEYS */;


--
-- Definition of table `movies`
--

DROP TABLE IF EXISTS `movies`;
CREATE TABLE `movies` (
  `movie_id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_name` varchar(40) DEFAULT NULL,
  `release_date` date DEFAULT NULL,
  `movie_status` varchar(10) DEFAULT NULL,
  `trailer` varchar(245) DEFAULT NULL,
  PRIMARY KEY (`movie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `movies`
--

/*!40000 ALTER TABLE `movies` DISABLE KEYS */;
INSERT INTO `movies` (`movie_id`,`movie_name`,`release_date`,`movie_status`,`trailer`) VALUES 
 (1,'Sairanudu','2016-05-02','active','<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/_UGMZ9iVGvo\" frameborder=\"0\" allowfullscreen></iframe>'),
 (2,'24','2016-05-06','active',NULL),
 (3,'Baaghi','2016-04-29','active',NULL),
 (4,'Chakravyuha','2016-04-29','active',NULL),
 (5,'Akhira','2016-04-29','active',NULL),
 (6,'Jungle Book','2016-04-15','active',NULL);
/*!40000 ALTER TABLE `movies` ENABLE KEYS */;


--
-- Definition of table `seats`
--

DROP TABLE IF EXISTS `seats`;
CREATE TABLE `seats` (
  `seat_id` int(11) NOT NULL AUTO_INCREMENT,
  `theater_id` int(11) DEFAULT NULL,
  `movie_id` int(11) DEFAULT NULL,
  `seat_no` int(11) DEFAULT NULL,
  `booking_date` date DEFAULT NULL,
  `booking_status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`seat_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `seats`
--

/*!40000 ALTER TABLE `seats` DISABLE KEYS */;
/*!40000 ALTER TABLE `seats` ENABLE KEYS */;


--
-- Definition of table `theater`
--

DROP TABLE IF EXISTS `theater`;
CREATE TABLE `theater` (
  `theater_id` int(11) NOT NULL AUTO_INCREMENT,
  `theater_name` varchar(50) DEFAULT NULL,
  `place` varchar(50) DEFAULT NULL,
  `theater_status` varchar(10) DEFAULT NULL,
  `no_seats` int(11) DEFAULT NULL,
  `cost` double DEFAULT NULL,
  PRIMARY KEY (`theater_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `theater`
--

/*!40000 ALTER TABLE `theater` DISABLE KEYS */;
INSERT INTO `theater` (`theater_id`,`theater_name`,`place`,`theater_status`,`no_seats`,`cost`) VALUES 
 (1,'Shiva','Bellary','active',120,100),
 (2,'Natraj','Bellary','active',80,100),
 (3,'SRR','Bellary','active',80,100),
 (4,'Ganga','Bellary','active',70,100),
 (5,'Uma','Bellary','active',80,100),
 (6,'Radhika','Bellary','active',100,150),
 (7,'Raghavendra','Bellary','active',100,100);
/*!40000 ALTER TABLE `theater` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
