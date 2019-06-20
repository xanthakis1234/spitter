CREATE DATABASE  IF NOT EXISTS `spitterdb` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `spitterdb`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: spitterdb
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `spitter`
--

DROP TABLE IF EXISTS `spitter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `spitter` (
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `username` varchar(45) NOT NULL,
  `passwrd` varchar(45) DEFAULT NULL,
  `id_spitter` int(11) DEFAULT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `spitter`
--

LOCK TABLES `spitter` WRITE;
/*!40000 ALTER TABLE `spitter` DISABLE KEYS */;
INSERT INTO `spitter` VALUES ('Desmond','Sart','ABC','12345',5),('GEORGE','LUCAS','GeoLucas','GeolucasPass123',1),('John','Doe','JD','JohnsPassword',3),('Jane','Jenkings','JJ','JanesPass',4),('KATE','Barry','KB','12345',6),('NEKTARIOS','Xanthakis','NekX','updatedpass',2);
/*!40000 ALTER TABLE `spitter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `spittle`
--

DROP TABLE IF EXISTS `spittle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `spittle` (
  `post` varchar(100) DEFAULT NULL,
  `id_spittle` varchar(45) NOT NULL DEFAULT '0',
  `username` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_spittle`),
  UNIQUE KEY `id_spittle_UNIQUE` (`id_spittle`),
  KEY `username_idx` (`username`),
  CONSTRAINT `username` FOREIGN KEY (`username`) REFERENCES `spitter` (`username`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `spittle`
--

LOCK TABLES `spittle` WRITE;
/*!40000 ALTER TABLE `spittle` DISABLE KEYS */;
INSERT INTO `spittle` VALUES ('Nektarios First spittle','0','NekX'),('Nektarios second spittle','1','NekX'),('Desmonds First','2','ABC'),('Kate\'s First','3','KB');
/*!40000 ALTER TABLE `spittle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-19 11:07:08
