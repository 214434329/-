/*
SQLyog Professional v12.09 (64 bit)
MySQL - 5.7.40 : Database - zsjblog
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`zsjblog` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `zsjblog`;

/*Table structure for table `blog` */

DROP TABLE IF EXISTS `blog`;

CREATE TABLE `blog` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user` varchar(20) NOT NULL,
  `title` varchar(80) NOT NULL,
  `body` varchar(800) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `blog` */

insert  into `blog`(`id`,`user`,`title`,`body`) values (1,'zzz','学习心得','学习心得就是1+1=2，2+2=4， 4+4=8， 8+8=16， 16+16=32， 32+32=64……'),(2,'xxx','大事件','我现在还没有发现'),(3,'ccc','每日小事','今天看到了xxx在这里大放厥词，我决定发表一篇博客');

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `bid` int(10) NOT NULL,
  `user` varchar(20) NOT NULL,
  `comment` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

insert  into `comment`(`id`,`bid`,`user`,`comment`) values (1,1,'ccc','真厉害，我只能算到4+4=8'),(2,2,'zzz','我也是'),(3,2,'xxx','1'),(4,2,'xxx','只会发一是吗孩子'),(5,2,'xxx','2'),(6,2,'xxx','3'),(7,2,'xxx','？'),(8,2,'ccc','？'),(9,2,'ccc','刷屏是吗孩子'),(10,1,'ccc','现在回了8+8=16'),(11,3,'123','支持up'),(12,3,'123','+1'),(13,2,'zhangsan','？'),(14,1,'1','1'),(15,1,'2','12'),(16,1,'zhangsan','123'),(17,1,'1','zhangsan，你个人机'),(18,2,'1','1'),(19,3,'zhangsan','+1');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`) values (1,'zzz','123456'),(2,'ccc','123456'),(3,'xxx','123456'),(4,'1','1'),(5,'123','123'),(6,'zhangsan','123'),(7,'2','12');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
