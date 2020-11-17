-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 11, 2020 at 12:08 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`username`, `password`) VALUES
('meto', '1');

-- --------------------------------------------------------

--
-- Table structure for table `cashiers`
--

CREATE TABLE `cashiers` (
  `cashier_id` int(11) NOT NULL,
  `cashier_name` varchar(100) NOT NULL,
  `cashier_phone` varchar(50) NOT NULL,
  `cashier_address` varchar(200) NOT NULL,
  `cashier_email` varchar(100) NOT NULL,
  `cashier_password` varchar(100) NOT NULL,
  `cashier_state` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cashiers`
--

INSERT INTO `cashiers` (`cashier_id`, `cashier_name`, `cashier_phone`, `cashier_address`, `cashier_email`, `cashier_password`, `cashier_state`) VALUES
(1, 'ميتو', '01282106151', 'كريب هات', 'meto', '01282106151', 1),
(2, 'حسن', '923231ذ', 'كريب هات', 'hassan', 'hassan', 1);

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

CREATE TABLE `clients` (
  `client_id` int(11) NOT NULL,
  `client_name` varchar(100) NOT NULL,
  `client_phone` varchar(50) NOT NULL,
  `client_address` varchar(200) NOT NULL,
  `client_notes` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`client_id`, `client_name`, `client_phone`, `client_address`, `client_notes`) VALUES
(22, 'سيد مختار النجار', '01271784980', 'بجوار مخزن الانابيب', ''),
(23, 'تامر باشا', '01211924673', 'ماركت باشا بجوار بنزينه رجب', ''),
(24, 'احمد فيصل', '01201913634', '', ''),
(25, 'ايه عيد', '01283364977', 'بجوار معهد الفتيات عند مصنع جمال خفاحي', ''),
(26, 'احمد الشاعر', '', '', ''),
(27, 'عبعزيز', '', '', ''),
(28, 'ابراهيم سمير', '01274251255', 'طريق الكتان', ''),
(29, 'محمد محسن', '01284769595', 'صيدليه الدكتور محمد محسن', ''),
(30, 'لوئ عبعزيز', '01227039441', 'صيدليه صلاح دياب', ''),
(31, '', '01286218624', 'محمد السباخي', ''),
(32, '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `dates`
--

CREATE TABLE `dates` (
  `order_id` int(11) NOT NULL,
  `order_date` varchar(100) NOT NULL,
  `client_id` int(11) DEFAULT NULL,
  `cashier_id` int(11) NOT NULL,
  `order_egmaly` float NOT NULL DEFAULT 0,
  `order_service` int(11) NOT NULL DEFAULT 0,
  `order_total` float DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dates`
--

INSERT INTO `dates` (`order_id`, `order_date`, `client_id`, `cashier_id`, `order_egmaly`, `order_service`, `order_total`) VALUES
(1, '10 نوفمبر 2020', NULL, 1, 48, 0, 48),
(2, '10 نوفمبر 2020', NULL, 1, 92, 0, 92),
(3, '10 نوفمبر 2020', NULL, 1, 143, 0, 143),
(4, '10 نوفمبر 2020', NULL, 1, 25, 0, 25),
(5, '11 نوفمبر 2020', NULL, 1, 48, 0, 48);

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `item_id` int(11) NOT NULL,
  `item_name` varchar(100) NOT NULL,
  `item_size` varchar(50) NOT NULL DEFAULT '',
  `item_cost` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`item_id`, `item_name`, `item_size`, `item_cost`) VALUES
(1, 'كريب شيش طاووق', 'كبير', 25),
(2, 'كريب شنغهاي', 'كبير', 25),
(3, 'كريب كوردن بلو', 'كبير', 25),
(4, 'كريب فاهيتا فراخ', 'كبير', 25),
(5, 'كريب سوبر كرانشي', 'كبير', 24),
(6, 'كريب مشوي صدور', 'كبير', 25),
(7, 'كريب بانيه', 'كبير', 23),
(8, 'كريب زنجر سوبر سوبريم', 'كبير', 25),
(9, 'كريب كونو بيتزا', 'كبير', 28),
(10, 'كريب كونو', 'كبير', 25),
(11, 'كريب ايطاليانو', 'كبير', 26),
(12, 'كريب كرسبي', 'كبير', 23),
(13, 'كريب شاورما فراخ', 'كبير', 25),
(14, 'كريب فرايداي', 'كبير', 22),
(15, 'كريب العالمي', 'كبير', 25),
(16, 'كريب كوكتيل فراخ', 'كبير', 24),
(17, 'كريب مشكل مكس', 'كبير', 23),
(18, 'كريب جوليانو', 'كبير', 20),
(19, 'كريب فراخ ميكس', 'كبير', 19),
(20, 'كريب الجحيم', 'كبير', 25),
(21, 'كريب توربيني فراخ', 'كبير', 25),
(22, 'كريب سجق', 'كبير', 18),
(23, 'كريب كفته', 'كبير', 15),
(24, 'كريب سوسيس', 'كبير', 15),
(25, 'كريب شاورما لحم', ' ', 25),
(26, 'كريب برجر', 'كبير', 17),
(27, 'كريب ميكسيكانو', 'كبير', 23),
(28, 'كريب كوكتيل لحم', 'كبير', 27),
(29, 'كريب توربيني لحمه ', 'كبير', 25),
(30, 'كريب سوبر دويتو لحوم', 'كبير', 21),
(31, 'كريب ميكس شاورما', 'كبير', 25),
(32, 'كريب سي فود بلاس', 'كبير', 38),
(33, 'كريب جمبري مشوي', 'كبير', 33),
(34, 'كريب جبنه رومي', 'كبير', 15),
(35, 'كريب مشكل جبن', 'كبير', 17),
(36, 'كريب ميكس جبن بالبسطرمه', 'كبير', 20),
(37, 'كريب بطاطس بالجبنه الشيدر', 'كبير', 15),
(38, 'كريب بطاطس', 'كبير', 12),
(39, 'كريب شيكولاته اوريو', 'كبير', 14),
(40, 'كريب شيكولاته هوهوز', 'كبير', 14),
(41, 'كريب شيكولاته موز', 'كبير', 16),
(42, 'كريب شيكولاته جلاكسي', 'كبير', 16),
(43, 'اضافه فراخ', 'كبير', 5),
(44, 'اضافه لحوم', 'كبير', 5),
(45, 'اضافه مشروم', 'كبير', 5),
(46, 'اضافه بوم فريت', 'كبير', 5),
(47, 'كريب شيكولاته', 'كبير', 13),
(48, 'بدون جبن', '', 0),
(49, 'بدون طماطم', '', 0),
(50, 'بدون زيتون', '', 0),
(51, 'بدون مشروم', '', 0),
(52, 'بدون فلفل', '', 0),
(53, 'بدون خس', '', 0),
(54, 'بدون كاتشب', '', 0),
(55, 'بدون مايونيز', '', 0),
(56, 'حار', '', 0),
(57, 'عادي', 'كبير', 0),
(58, 'اضافه بطاطس', 'كبير', 5),
(59, 'باكت بطاطس', 'وسط', 5);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `order_id` int(11) NOT NULL,
  `order_quantity` int(11) NOT NULL DEFAULT 1,
  `item_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`order_id`, `order_quantity`, `item_id`) VALUES
(1, 1, 6),
(1, 1, 7),
(2, 1, 2),
(2, 1, 4),
(2, 1, 7),
(2, 1, 19),
(3, 1, 7),
(3, 1, 11),
(3, 1, 12),
(3, 1, 16),
(3, 1, 17),
(3, 1, 19),
(3, 1, 43),
(4, 1, 15),
(5, 1, 7),
(5, 1, 8);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admins`
--
ALTER TABLE `admins`
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `cashiers`
--
ALTER TABLE `cashiers`
  ADD PRIMARY KEY (`cashier_id`),
  ADD UNIQUE KEY `cashier_email` (`cashier_email`);

--
-- Indexes for table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`client_id`);

--
-- Indexes for table `dates`
--
ALTER TABLE `dates`
  ADD PRIMARY KEY (`order_id`),
  ADD KEY `cashier_id` (`cashier_id`),
  ADD KEY `client_id` (`client_id`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`item_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_id`,`item_id`),
  ADD KEY `item_id` (`item_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cashiers`
--
ALTER TABLE `cashiers`
  MODIFY `cashier_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT for table `clients`
--
ALTER TABLE `clients`
  MODIFY `client_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `item_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=93;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=114;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `dates`
--
ALTER TABLE `dates`
  ADD CONSTRAINT `dates_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`),
  ADD CONSTRAINT `dates_ibfk_2` FOREIGN KEY (`cashier_id`) REFERENCES `cashiers` (`cashier_id`),
  ADD CONSTRAINT `dates_ibfk_3` FOREIGN KEY (`client_id`) REFERENCES `clients` (`client_id`);

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`item_id`) REFERENCES `items` (`item_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
