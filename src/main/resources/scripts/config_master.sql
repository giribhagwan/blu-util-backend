

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
('VOL','qty1111',1),
('PRN','qty1111',1),
('MEM','qty1111',1),
('LKD','qty1111',1),

('MCU','qty1121',1),
('CSD','qty1121',2),
('VOL','qty1121',1),
('PRN','qty1121',1),
('MEM','qty1121',1),
('LKD','qty1121',1),

('MCU','qty1222',1),
('CSD','qty1222',2),
('VOL','qty1222',2),
('PRN','qty1222',2),
('MEM','qty1222',1),
('LKD','qty1222',2),

('MCU','qty2222',1),
('CSD','qty2222',2),
('VOL','qty2222',2),
('PRN','qty2222',2),
('MEM','qty2222',1),
('LKD','qty2222',2),

('MCU','qty2422',1),
('CSD','qty2422',2),
('VOL','qty2422',4),
('PRN','qty2422',2),
('MEM','qty2422',1),
('LKD','qty2422',2),

('MCU','qty3622',1),
('CSD','qty3622',2),
('VOL','qty3622',6),
('PRN','qty3622',2),
('MEM','qty3622',1),
('LKD','qty3622',2),

('MCU','qty4822',1),
('CSD','qty4822',2),
('VOL','qty4822',8),
('PRN','qty4822',2),
('MEM','qty4822',1),
('LKD','qty4822',2),

('MCU','qty1242',1),
('CSD','qty1242',4),
('VOL','qty1242',2),
('PRN','qty1242',2),
('MEM','qty1242',1),
('LKD','qty1242',2),


('MCU','qty2242',1),
('CSD','qty2242',4),
('VOL','qty2242',2),
('PRN','qty2242',2),
('MEM','qty2242',1),
('LKD','qty2242',2),

('MCU','qty1444',1),
('CSD','qty1444',4),
('VOL','qty1444',4),
('PRN','qty1444',2),
('MEM','qty1444',1),
('LKD','qty1444',4),

('MCU','qty2444',1),
('CSD','qty2444',4),
('VOL','qty2444',4),
('PRN','qty2444',2),
('MEM','qty2444',1),
('LKD','qty2444',4),

('MCU','qty3644',1),
('CSD','qty3644',4),
('VOL','qty3644',6),
('PRN','qty3644',2),
('MEM','qty3644',1),
('LKD','qty3644',4),

('MCU','qty4844',1),
('CSD','qty4844',4),
('VOL','qty4844',8),
('PRN','qty4844',2),
('MEM','qty4844',1),
('LKD','qty4844',4)

;

/*!40000 ALTER TABLE `config_master` ENABLE KEYS */;
UNLOCK TABLES;