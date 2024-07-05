USE `zcrepe`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: zcrepe
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admins`
--

DROP TABLE IF EXISTS `admins`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admins` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admins`
--

LOCK TABLES `admins` WRITE;
/*!40000 ALTER TABLE `admins` DISABLE KEYS */;
INSERT INTO `admins` VALUES ('fady','1');
/*!40000 ALTER TABLE `admins` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cashiers`
--

DROP TABLE IF EXISTS `cashiers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cashiers` (
  `cashier_id` int NOT NULL AUTO_INCREMENT,
  `cashier_name` varchar(100) NOT NULL,
  `cashier_phone` varchar(50) NOT NULL,
  `cashier_address` varchar(200) NOT NULL,
  `cashier_email` varchar(100) NOT NULL,
  `cashier_password` varchar(100) NOT NULL,
  `cashier_state` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`cashier_id`),
  UNIQUE KEY `cashier_email` (`cashier_email`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cashiers`
--

LOCK TABLES `cashiers` WRITE;
/*!40000 ALTER TABLE `cashiers` DISABLE KEYS */;
INSERT INTO `cashiers` VALUES (1,'فادي','01282106151','طنطا','fady','fady',0),(40,'احمد محمد','01001213423','طنطا','amer','amer',0);
/*!40000 ALTER TABLE `cashiers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clients`
--

DROP TABLE IF EXISTS `clients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clients` (
  `client_id` int NOT NULL AUTO_INCREMENT,
  `client_name` varchar(100) NOT NULL,
  `client_phone` varchar(50) NOT NULL,
  `client_address` varchar(200) NOT NULL,
  `client_notes` varchar(300) NOT NULL,
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clients`
--

LOCK TABLES `clients` WRITE;
/*!40000 ALTER TABLE `clients` DISABLE KEYS */;
INSERT INTO `clients` VALUES (22,'سيد مختار النجار','01271784980','بجوار مخزن الانابيب',''),(23,'تامر باشا','01211924673','ماركت باشا بجوار بنزينه رجب','لا'),(24,'احمد فيصل','01201913634','',''),(25,'ايه عيد','01283364977','بجوار معهد الفتيات عند مصنع جمال خفاحي',''),(28,'ابراهيم سمير','01274251255','طريق الكتان',''),(29,'محمد محسن','01284769595','صيدليه الدكتور محمد محسن',''),(30,'لوئ عبعزيز','01227039441','صيدليه صلاح دياب',''),(31,'احمد','01286218624','محمد السباخي',''),(33,'لوئ عبعزيز','01227039441','صيدليه صلاح دياب',''),(34,'خالد زكي','010043534543','شارع البحر','الدور التاني'),(36,'عامر اسامه','01121213','tanta',''),(39,'','','',''),(41,'احمد','01286218624','محمد السباخي',''),(42,'احمد خالد','10121','النادي','لا'),(43,'سامي','223','43',''),(44,'ابراهيم سمير','01274251255','طريق الكتان','');
/*!40000 ALTER TABLE `clients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dates`
--

DROP TABLE IF EXISTS `dates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dates` (
  `order_id` int NOT NULL,
  `order_date` varchar(100) NOT NULL,
  `client_id` int DEFAULT NULL,
  `cashier_id` int NOT NULL,
  `order_egmaly` float NOT NULL DEFAULT '0',
  `order_service` int NOT NULL DEFAULT '0',
  `order_total` float DEFAULT '0',
  PRIMARY KEY (`order_id`),
  KEY `cashier_id` (`cashier_id`),
  KEY `client_id` (`client_id`),
  CONSTRAINT `dates_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`),
  CONSTRAINT `dates_ibfk_2` FOREIGN KEY (`cashier_id`) REFERENCES `cashiers` (`cashier_id`),
  CONSTRAINT `dates_ibfk_3` FOREIGN KEY (`client_id`) REFERENCES `clients` (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dates`
--

LOCK TABLES `dates` WRITE;
/*!40000 ALTER TABLE `dates` DISABLE KEYS */;
/*!40000 ALTER TABLE `dates` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `items` (
  `item_id` int NOT NULL AUTO_INCREMENT,
  `item_name` varchar(100) NOT NULL,
  `item_menu` varchar(50) NOT NULL DEFAULT '',
  `item_cost` float NOT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=152 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
INSERT INTO `items` VALUES (1,'كريب سوبر كرانشي','عادي',47),(2,'كريب ايطاليانو','عادي',48),(3,'كريب زنجر','عادي',48),(4,'كريب شيش طاووق','عادي',48),(5,'كريب بانيه','عادي',40),(6,'كريب فراي داي','عادي',44),(7,'كريب كرسبي','عادي',40),(8,'كريب فاهيتا فراخ','عادي',44),(9,'كريب كوردن بلو','عادي',48),(10,'كريب شاورما فراخ','عادي',44),(11,'كريب مشوي صدور','عادي',50),(12,'كريب كونو','عادي',48),(13,'كريب كونو بيتزا','عادي',52),(14,'كريب برجر','عادي',40),(15,'كريب شاورما لحمه','عادي',50),(16,'كريب كفته','عادي',40),(17,'كريب سوسيس','عادي',37),(18,'كريب سوبر لينو','عادي',37),(19,'كريب سجق','عادي',37),(20,'كريب جمبري','عادي',50),(21,'كريب ميكس فراخ','عادي',50),(22,'كريب ميكس لحوم','عادي',44),(23,'كريب مزاجنجي','عادي',55),(24,'كريب جوليانو','عادي',44),(25,'كريب ميكس شاورما',' عادي',48),(26,'كريب القنبله','عادي',50),(27,'كريب جحيم','عادي',47),(28,'كريب العالمي','عادي',47),(29,'كريب Z','عادي',55),(30,'كريب اوفر','عادي',50),(41,'كريب ميكس جبن','عادي',37),(42,'كريب جبنه رومي','عادي',35),(43,'كريب شنكاح','عادي',40),(44,'كريب بطاطس','عادي',25),(45,'كريب بطاطس شيدر','عادي',27),(46,'كريب بطاطسينو','عادي',35),(47,'رول بطاطس','عادي',17),(48,'موتزريلا رول بطاطس','عادي',20),(60,'سندوتش تشيكن بيتزا','عاجي',40),(61,'سندوتش تشيكن اسموك','عاجي',37),(62,'سندوتش سوبر كرانشي','عاجي',30),(63,'سندوتش ميكس Z','عادي',48),(64,'سندوتش زنجر','عادي',30),(65,'سندوتش شيش طاووق','عادي',35),(66,'سندوتش بانيه','عادي',30),(67,'سندوتش شاورما فراخ','عادي',30),(68,'سندوتش ايطاليانو','عادي',35),(69,'سندوتش كوردن بلو','عادي',35),(70,'سندوتش كفته','عادي',30),(71,'سندوتش سوسيس','عادي',30),(72,'سندوتش برجر','عادي',30),(73,'سندوتش برجر سوسج','عادي',30),(74,'سندوتش برجر بيتزا','عادي',30),(75,'سندوتش سجق','عادي',30),(76,'سندوتش كبده','عادي',30),(77,'سندوتش حواوشي بانيه','عادي',30),(78,'سندوتش كفته بانيه','عادي',30),(79,'سندوتش حواوشي جبن','عادي',30),(80,'وجبه زنجر','عادي',65),(81,'وجبه بانيه','عادي',60),(82,'وجبه مشوي صدور','عادي',65),(83,'وجبه Z','عادي',70),(84,'وجبه كفته','عادي',50),(85,'وجبه استيك','عادي',90),(86,'وجبه 1','عادي',70),(87,'وجبه 2','عادي',70),(100,'كريب شوكولاته','عادي',27),(101,'كريب شوكولاته موز','عادي',33),(102,'كريب شوكولاته اوريو','عادي',33),(103,'كريب شوكولاته هوهوز','عادي',33),(104,'كريب شوكولاته مارشملو','عادي',33),(105,'كريب نوتيلا','عادي',33),(140,'باكت بطاطس','عادي',15),(141,'باكت بطاطس شيدر','عادي',20),(142,'باكت بطاطس سوسيس','عادي',25),(143,'كومبو (بطاطس+كولوسلو)','عادي',25),(144,'اضافه جبن','عادي',10),(145,'اضافه لحوم','عادي',15),(146,'كلوسلو','عادي',15),(147,'مشروب غازي','عادي',15),(148,'مياه صغيره','عادي',7),(149,'مياه كبيره','عادي',12),(150,'اضافه صوصات','عادي',10),(151,'تشيكن كب','عادي',30);
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `order_quantity` int NOT NULL DEFAULT '1',
  `item_id` int NOT NULL,
  PRIMARY KEY (`order_id`,`item_id`),
  KEY `item_id` (`item_id`),
  CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`item_id`) REFERENCES `items` (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=114 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-05  2:58:05
