

--
-- Table structure for table `config_master`
--

DROP TABLE IF EXISTS `config_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config_master` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `board_name` varchar(255) DEFAULT NULL,
  `config_name` varchar(255) DEFAULT NULL,
  `number_of_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config_master`
--
LOCK TABLES `config_master` WRITE;
/*!40000 ALTER TABLE `config_master` DISABLE KEYS */;
INSERT INTO `config_master` (board_name,config_name,number_of_count) VALUES
('MCU','qty1111',1),
('CSD','qty1111',1),
('MRE','qty1111',1),
('SDL','qty1111',1),
('BOARD-1','qty1111',1),
('BOARD-2','qty1111',1),
('BOARD-3','qty1111',1),
('BOARD-4','qty1111',1),

('MCU','qty1121',1),
('CSD','qty1121',2),
('MRE','qty1121',1),
('SDL','qty1121',1),
('BOARD-1','qty1121',1),
('BOARD-2','qty1121',1),
('BOARD-3','qty1121',1),
('BOARD-4','qty1121',1),

('MCU','qty1222',1),
('CSD','qty1222',2),
('MRE','qty1222',2),
('SDL','qty1222',1),
('BOARD-1','qty1222',1),
('BOARD-2','qty1222',1),
('BOARD-3','qty1222',1),
('BOARD-4','qty1222',1),

('MCU','qty2222',1),
('CSD','qty2222',2),
('MRE','qty2222',2),
('SDL','qty2222',1),
('BOARD-1','qty2222',1),
('BOARD-2','qty2222',1),
('BOARD-3','qty2222',1),
('BOARD-4','qty2222',1),

('MCU','qty2422',1),
('CSD','qty2422',2),
('MRE','qty2422',4),
('SDL','qty2422',1),
('BOARD-1','qty2422',1),
('BOARD-2','qty2422',1),
('BOARD-3','qty2422',1),
('BOARD-4','qty2422',1),

('MCU','qty3622',1),
('CSD','qty3622',2),
('MRE','qty3622',6),
('SDL','qty3622',1),
('BOARD-1','qty3622',1),
('BOARD-2','qty3622',1),
('BOARD-3','qty3622',1),
('BOARD-4','qty3622',1),

('MCU','qty4822',1),
('CSD','qty4822',2),
('MRE','qty4822',8),
('SDL','qty4822',1),
('BOARD-1','qty4822',1),
('BOARD-2','qty4822',1),
('BOARD-3','qty4822',1),
('BOARD-4','qty4822',1),

('MCU','qty1242',1),
('CSD','qty1242',4),
('MRE','qty1242',2),
('SDL','qty1242',1),
('BOARD-1','qty1242',1),
('BOARD-2','qty1242',1),
('BOARD-3','qty1242',1),
('BOARD-4','qty1242',1),

('MCU','qty2242',1),
('CSD','qty2242',4),
('MRE','qty2242',2),
('SDL','qty2242',1),
('BOARD-1','qty2242',1),
('BOARD-2','qty2242',1),
('BOARD-3','qty2242',1),
('BOARD-4','qty2242',1),

('MCU','qty1444',1),
('CSD','qty1444',4),
('MRE','qty1444',4),
('SDL','qty1444',1),
('BOARD-1','qty1444',1),
('BOARD-2','qty1444',1),
('BOARD-3','qty1444',1),
('BOARD-4','qty1444',1),

('MCU','qty2444',1),
('CSD','qty2444',4),
('MRE','qty2444',4),
('SDL','qty2444',1),
('BOARD-1','qty2444',1),
('BOARD-2','qty2444',1),
('BOARD-3','qty2444',1),
('BOARD-4','qty2444',1),

('MCU','qty3614',1),
('CSD','qty3614',4),
('MRE','qty3614',6),
('SDL','qty3614',1),
('BOARD-1','qty3614',1),
('BOARD-2','qty3614',1),
('BOARD-3','qty3614',1),
('BOARD-4','qty3614',1),

('MCU','qty4844',1),
('CSD','qty4844',4),
('MRE','qty4844',8),
('SDL','qty4844',1),
('BOARD-1','qty4844',1),
('BOARD-2','qty4844',1),
('BOARD-3','qty4844',1),
('BOARD-4','qty4844',1)
;

/*!40000 ALTER TABLE `config_master` ENABLE KEYS */;
UNLOCK TABLES;