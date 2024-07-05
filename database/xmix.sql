-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 05, 2024 at 04:05 AM
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
-- Database: `xmix`
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
('fady', '1');

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
(1, 'فادي', '01282106151', 'طنطا', 'a', 'a', 0),
(40, 'احمد محمد', '01001213423', 'طنطا', 'amer', 'amer', 0);

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
(23, 'تامر باشا', '01211924673', 'ماركت باشا بجوار بنزينه رجب', 'لا'),
(24, 'احمد فيصل', '01201913634', '', ''),
(25, 'ايه عيد', '01283364977', 'بجوار معهد الفتيات عند مصنع جمال خفاحي', ''),
(28, 'ابراهيم سمير', '01274251255', 'طريق الكتان', ''),
(29, 'محمد محسن', '01284769595', 'صيدليه الدكتور محمد محسن', ''),
(30, 'لوئ عبعزيز', '01227039441', 'صيدليه صلاح دياب', ''),
(31, 'احمد', '01286218624', 'محمد السباخي', ''),
(33, 'لوئ عبعزيز', '01227039441', 'صيدليه صلاح دياب', ''),
(34, 'خالد زكي', '010043534543', 'شارع البحر', 'الدور التاني'),
(36, 'عامر اسامه', '01121213', 'tanta', ''),
(39, '', '', '', ''),
(40, 'احمد زكي', '', '', ''),
(41, 'احمد', '01286218624', 'محمد السباخي', '');

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
(1, '05 July 2024', NULL, 1, 189, 0, 189),
(2, '05 July 2024', NULL, 1, 87, 0, 87),
(3, '05 July 2024', NULL, 1, 47, 0, 47),
(4, '05 July 2024', NULL, 1, 95, 0, 95),
(5, '05 July 2024', NULL, 1, 95, 0, 95),
(6, '05 July 2024', NULL, 1, 98, 0, 98),
(7, '05 July 2024', 36, 1, 47, 30, 77),
(8, '05 July 2024', NULL, 1, 95, 0, 95),
(9, '05 July 2024', NULL, 1, 47, 0, 47),
(10, '05 July 2024', NULL, 1, 48, 0, 48),
(11, '05 July 2024', 36, 1, 404, 25, 428.571),
(12, '05 July 2024', NULL, 1, 207, 0, 207);

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `item_id` int(11) NOT NULL,
  `item_name` varchar(100) NOT NULL,
  `item_menu` varchar(50) NOT NULL DEFAULT '',
  `item_cost` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`item_id`, `item_name`, `item_menu`, `item_cost`) VALUES
(1, 'كريب سوبر كرانشي', 'عادي', 47),
(2, 'كريب ايطاليانو', 'عادي', 48),
(3, 'كريب زنجر', 'عادي', 48),
(4, 'كريب شيش طاووق', 'عادي', 48),
(5, 'كريب بانيه', 'عادي', 40),
(6, 'كريب فراي داي', 'عادي', 44),
(7, 'كريب كرسبي', 'عادي', 40),
(8, 'كريب فاهيتا فراخ', 'عادي', 44),
(9, 'كريب كوردن بلو', 'عادي', 48),
(10, 'كريب شاورما فراخ', 'عادي', 44),
(11, 'كريب مشوي صدور', 'عادي', 50),
(12, 'كريب كونو', 'عادي', 48),
(13, 'كريب كونو بيتزا', 'عادي', 52),
(14, 'كريب برجر', 'عادي', 40),
(15, 'كريب شاورما لحمه', 'عادي', 50),
(16, 'كريب كفته', 'عادي', 40),
(17, 'كريب سوسيس', 'عادي', 37),
(18, 'كريب سوبر لينو', 'عادي', 37),
(19, 'كريب سجق', 'عادي', 37),
(20, 'كريب جمبري', 'عادي', 50),
(21, 'كريب ميكس فراخ', 'عادي', 50),
(22, 'كريب ميكس لحوم', 'عادي', 44),
(23, 'كريب مزاجنجي', 'عادي', 55),
(24, 'كريب جوليانو', 'عادي', 44),
(25, 'كريب ميكس شاورما', ' عادي', 48),
(26, 'كريب القنبله', 'عادي', 50),
(27, 'كريب جحيم', 'عادي', 47),
(28, 'كريب العالمي', 'عادي', 47),
(29, 'كريب Z', 'عادي', 55),
(30, 'كريب اوفر', 'عادي', 50),
(41, 'كريب ميكس جبن', 'عادي', 37),
(42, 'كريب جبنه رومي', 'عادي', 35),
(43, 'كريب شنكاح', 'عادي', 40),
(44, 'كريب بطاطس', 'عادي', 25),
(45, 'كريب بطاطس شيدر', 'عادي', 27),
(46, 'كريب بطاطسينو', 'عادي', 35),
(47, 'رول بطاطس', 'عادي', 17),
(48, 'موتزريلا رول بطاطس', 'عادي', 20),
(60, 'سندوتش تشيكن بيتزا', 'عاجي', 40),
(61, 'سندوتش تشيكن اسموك', 'عاجي', 37),
(62, 'سندوتش سوبر كرانشي', 'عاجي', 30),
(63, 'سندوتش ميكس Z', 'عادي', 48),
(64, 'سندوتش زنجر', 'عادي', 30),
(65, 'سندوتش شيش طاووق', 'عادي', 35),
(66, 'سندوتش بانيه', 'عادي', 30),
(67, 'سندوتش شاورما فراخ', 'عادي', 30),
(68, 'سندوتش ايطاليانو', 'عادي', 35),
(69, 'سندوتش كوردن بلو', 'عادي', 35),
(70, 'سندوتش كفته', 'عادي', 30),
(71, 'سندوتش سوسيس', 'عادي', 30),
(72, 'سندوتش برجر', 'عادي', 30),
(73, 'سندوتش برجر سوسج', 'عادي', 30),
(74, 'سندوتش برجر بيتزا', 'عادي', 30),
(75, 'سندوتش سجق', 'عادي', 30),
(76, 'سندوتش كبده', 'عادي', 30),
(77, 'سندوتش حواوشي بانيه', 'عادي', 30),
(78, 'سندوتش كفته بانيه', 'عادي', 30),
(79, 'سندوتش حواوشي جبن', 'عادي', 30),
(80, 'وجبه زنجر', 'عادي', 65),
(81, 'وجبه بانيه', 'عادي', 60),
(82, 'وجبه مشوي صدور', 'عادي', 65),
(83, 'وجبه Z', 'عادي', 70),
(84, 'وجبه كفته', 'عادي', 50),
(85, 'وجبه استيك', 'عادي', 90),
(86, 'وجبه 1', 'عادي', 70),
(87, 'وجبه 2', 'عادي', 70),
(100, 'كريب شوكولاته', 'عادي', 27),
(101, 'كريب شوكولاته موز', 'عادي', 33),
(102, 'كريب شوكولاته اوريو', 'عادي', 33),
(103, 'كريب شوكولاته هوهوز', 'عادي', 33),
(104, 'كريب شوكولاته مارشملو', 'عادي', 33),
(105, 'كريب نوتيلا', 'عادي', 33),
(140, 'باكت بطاطس', 'عادي', 15),
(141, 'باكت بطاطس شيدر', 'عادي', 20),
(142, 'باكت بطاطس سوسيس', 'عادي', 25),
(143, 'كومبو (بطاطس+كولوسلو)', 'عادي', 25),
(144, 'اضافه جبن', 'عادي', 10),
(145, 'اضافه لحوم', 'عادي', 15),
(146, 'كلوسلو', 'عادي', 15),
(147, 'مشروب غازي', 'عادي', 15),
(148, 'مياه صغيره', 'عادي', 7),
(149, 'مياه كبيره', 'عادي', 12),
(150, 'اضافه صوصات', 'عادي', 10),
(151, 'تشيكن كب', 'عادي', 30);

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
(1, 1, 1),
(1, 1, 6),
(1, 1, 9),
(1, 1, 20),
(2, 1, 1),
(2, 1, 14),
(3, 1, 1),
(4, 1, 1),
(4, 1, 2),
(5, 1, 1),
(5, 1, 2),
(6, 1, 12),
(6, 1, 15),
(7, 1, 1),
(8, 1, 1),
(8, 1, 2),
(9, 1, 1),
(10, 1, 2),
(11, 1, 10),
(11, 4, 85),
(12, 1, 43),
(12, 1, 47),
(12, 1, 60),
(12, 1, 69),
(12, 1, 76),
(12, 1, 141),
(12, 1, 142);

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
  MODIFY `cashier_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT for table `clients`
--
ALTER TABLE `clients`
  MODIFY `client_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `item_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=152;

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
