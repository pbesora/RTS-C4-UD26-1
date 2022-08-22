DROP TABLE IF EXISTS `pieza`;
SET character_set_client = utf8mb4 ;

CREATE TABLE `pieza` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pieza`
--

--LOCK TABLES `pieza` WRITE;
/*!40000 ALTER TABLE `pieza` DISABLE KEYS */;
INSERT INTO `pieza` VALUES (1,'Pieza 01'),(2,'Pieza 02'),(3,'Pieza 03'),(4,'Pieza 04');
/*!40000 ALTER TABLE `pieza` ENABLE KEYS */;
--UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `proveedor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

--LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (1,'Jose'),(2,'Juan'), (3,'Pedro'), (4,'Pablo');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
--UNLOCK TABLES;

--
-- Table structure for table `piezas_proveedores`
--

DROP TABLE IF EXISTS `piezas_proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `piezas_proveedores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pieza_id` int(11) NOT NULL,
  `proveedor_id` int(11) NOT NULL,
  `precio` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_proveedor` FOREIGN KEY (`proveedor_id`) REFERENCES `proveedor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_pieza` FOREIGN KEY (`pieza_id`) REFERENCES `pieza` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `piezas_proveedores`
--

--LOCK TABLES `piezas_proveedores` WRITE;
/*!40000 ALTER TABLE `piezas_proveedores` DISABLE KEYS */;
INSERT INTO `piezas_proveedores` VALUES (1,1,1,20), (2,2,2,220), (3,3,4,21), (4,4,3,10);
/*!40000 ALTER TABLE `piezas_proveedores` ENABLE KEYS */;
--UNLOCK TABLES;
