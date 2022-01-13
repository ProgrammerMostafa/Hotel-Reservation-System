-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: golden_hotel
-- ------------------------------------------------------
-- Server version	5.7.16-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `F_Name` varchar(10) DEFAULT NULL,
  `M_Name` varchar(10) DEFAULT NULL,
  `L_Name` varchar(10) DEFAULT NULL,
  `Emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `Address` varchar(20) NOT NULL,
  `Salary` double DEFAULT NULL,
  `Emp_Postion` varchar(15) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  PRIMARY KEY (`Emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('ahmed ','khaled','mohamed',1,'Giza',1200,'House Keeping','male'),('Ali ','Mohamed','ali',2,'cairo',1200,'House Keeping','male'),('amr ','mostafa','ibrahim',3,'alex',1200,'House Keeping','male'),('dina ','naser','mohamed',4,'Giza',1200,'House Keeping','female'),('nada ','khaled','mostafa',5,'suez',1200,'House Keeping','female'),('ahmed ','hassan','maher',6,'cairo',2500,'chef','male'),('mostafa ','ali','salem',7,'benha',2500,'chef','male'),('Amira ','mostafa','reda',8,'cairo',2500,'chef','female'),('mostafa ','ashraf','maamon',9,'benha',2000,'Kitchen worker','male'),('mohi ','ahmed','fathy',10,'benha',2000,'Kitchen worker','male'),('manar ','ehab','mohamed',11,'Giza',2000,'Kitchen worker','female'),('hossam ','yehia','mohamed',12,'alex',1600,'Room Services ','male'),('mona ','ali','gaber',13,'suez',1600,'Room Services ','female'),('hesham ','ayman','mohamed',14,'cairo',1600,'Room Services ','male'),('assela ','joussef','george',15,'taywan',1600,'Room Services ','female'),('hassouna ','gamal','mohamed',16,'sharm',1600,'Room Services ','male'),('mena ','khaled','george',17,'Giza',1300,'Bagger','male'),('adel','amr','tamer',18,'cairo',1300,'Bagger','male'),('weal ','mohamed','hassan',19,'cairo',1300,'Bagger','male'),('mostafa ','mahmoud','mohamed',20,'benha',1750,'Security','male'),('nahed ','mohamed','eladawy',30,'cairo',1750,'Security','male'),('Salah','Gomaa','Tawfiq',31,'cairo',1750,'Security','male');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-22 15:47:57
