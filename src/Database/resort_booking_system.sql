-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 31, 2025 at 07:19 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `resort_booking_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `booking_id` int(11) NOT NULL,
  `room_id` int(11) DEFAULT NULL,
  `cottage_id` int(11) DEFAULT NULL,
  `full_name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `contact_number` varchar(20) DEFAULT NULL,
  `number_of_guests` int(11) DEFAULT NULL,
  `special_request` text DEFAULT NULL,
  `check_in` date NOT NULL,
  `check_out` date NOT NULL,
  `total_nights` int(11) DEFAULT NULL,
  `total_payment` double NOT NULL,
  `status` enum('Pending','Approved','Rejected') DEFAULT 'Pending'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`booking_id`, `room_id`, `cottage_id`, `full_name`, `email`, `contact_number`, `number_of_guests`, `special_request`, `check_in`, `check_out`, `total_nights`, `total_payment`, `status`) VALUES
(5, 1, 1004, 'Ako patotoya', 'patotoya@gmail.com', '0989765657', 5, 'tubig usa ka galon', '2025-05-08', '2025-05-10', 2, 2130, 'Approved'),
(10, NULL, 1003, 'ash', 'ash', 'ash', 1, 'None', '2025-05-09', '2025-05-10', 1, 140, 'Pending'),
(11, 2, 1004, 'Ashley', 'Ash@gmail.com', '0989789654', 5, 'reservation', '2025-05-10', '2025-05-12', 2, 3130, 'Pending'),
(12, 4, 1005, 'John Phil Esconde', 'john@gamil.com', '09198996251', 14, 'None', '2025-05-09', '2025-05-10', 1, 2700, 'Approved'),
(13, 5, 1008, 'Julierie Balbs', 'julerie@gmail.com', '0916143014', 30, 'si jampil', '2025-05-09', '2025-05-16', 7, 7110, 'Approved');

-- --------------------------------------------------------

--
-- Table structure for table `cottage`
--

CREATE TABLE `cottage` (
  `cottage_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `capacity` int(11) NOT NULL,
  `location` varchar(100) NOT NULL,
  `price` double NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cottage`
--

INSERT INTO `cottage` (`cottage_id`, `name`, `capacity`, `location`, `price`, `status`) VALUES
(1003, 'Riverbend Cabin', 5, 'Valley Stream', 140, 'Booked'),
(1004, 'Maple Hollow', 4, 'Autumn Grove', 130, 'Booked'),
(1005, 'Whispering Pines', 7, 'Northern Woods', 200, 'Booked'),
(1006, 'Lakeside Haven', 6, 'Crystal Lake', 170, 'Available'),
(1007, 'Hidden Creek Lodge', 8, 'Whisper Creek', 250, 'Available'),
(1008, 'The Lookout', 2, 'Cliffside', 110, 'Booked'),
(1009, 'Birchwood Retreat', 3, 'Meadowlands', 95, 'Available'),
(1010, 'Golden Oak Chalet', 5, 'Sunny Ridge', 160, 'Available'),
(1011, 'Silver Birch Bungalow', 4, 'Silver Valley', 145, 'Available'),
(1012, 'The Alpine Nest', 6, 'Snowcap Village', 210, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `log_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `action` text NOT NULL,
  `date_time` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logs`
--

INSERT INTO `logs` (`log_id`, `user_id`, `action`, `date_time`) VALUES
(1, 101, 'Added new user with no0', '2025-03-30 23:07:39'),
(3, 101, 'Update user with ID 0', '2025-03-30 23:25:53'),
(4, 101, 'Update user with ID 132', '2025-03-30 23:30:03'),
(5, 101, 'Added new user with ID 133', '2025-03-30 23:40:37'),
(6, 101, 'Added new user with ID 134', '2025-03-31 00:00:44'),
(7, 101, 'Update user with ID 134', '2025-03-31 00:01:18'),
(8, 101, 'Delete user with ID 0', '2025-03-31 00:01:29'),
(9, 101, 'Added new user with ID 135', '2025-03-31 00:09:10'),
(10, 101, 'Delete user with ID 135', '2025-03-31 00:09:49'),
(11, 101, 'Added new user with ID 136', '2025-03-31 00:20:46'),
(12, 101, 'Update user with ID 136', '2025-03-31 00:21:00'),
(13, 101, 'Delete user with ID 136', '2025-03-31 00:21:07'),
(14, 101, 'Approved user with ID 127', '2025-03-31 00:28:36'),
(15, 101, 'Account login for user ID: 1', '2025-04-13 15:04:34'),
(16, 102, 'Account login for user ID: 102', '2025-04-17 09:46:51'),
(17, 102, 'Account login for user ID: 102', '2025-04-17 09:51:53'),
(18, 102, 'Account login for user ID: 102', '2025-04-17 09:52:46'),
(19, 102, 'Account login for user ID: 102', '2025-04-17 09:56:19'),
(20, 102, 'Account login for user ID: 102', '2025-04-17 13:28:36'),
(21, 102, 'Account login for user ID: 102', '2025-04-17 13:28:52'),
(22, 105, 'Account login for user ID: 105', '2025-04-17 14:30:48'),
(23, 102, 'Account login for user ID: 102', '2025-04-17 14:31:21'),
(24, 102, 'Account login for user ID: 102', '2025-04-17 17:47:24'),
(25, 102, 'Account login for user ID: 102', '2025-04-17 21:43:46'),
(26, 102, 'Account login for user ID: 102', '2025-04-17 21:49:17'),
(27, 102, 'Account login for user ID: 102', '2025-04-17 22:04:21'),
(28, 102, 'Account login for user ID: 102', '2025-04-17 22:12:46'),
(29, 102, 'Account login for user ID: 102', '2025-04-17 22:17:44'),
(30, 102, 'Account login for user ID: 102', '2025-04-17 22:30:47'),
(31, 102, 'Account login for user ID: 102', '2025-04-17 22:35:35'),
(32, 102, 'Account login for user ID: 102', '2025-04-17 22:42:14'),
(33, 102, 'Account login for user ID: 102', '2025-04-17 22:44:52'),
(34, 102, 'Account login for user ID: 102', '2025-04-17 22:50:37'),
(35, 102, 'Account login for user ID: 102', '2025-04-17 22:53:06'),
(36, 102, 'Account login for user ID: 102', '2025-04-18 08:01:28'),
(37, 102, 'Update user with ID 105', '2025-04-18 08:01:58'),
(38, 102, 'Added new user with ID 106', '2025-04-18 08:03:06'),
(39, 102, 'Delete user with ID 106', '2025-04-18 08:03:20'),
(40, 102, 'Account login for user ID: 102', '2025-04-18 08:09:17'),
(41, 102, 'Account login for user ID: 102', '2025-04-18 08:12:41'),
(42, 102, 'Account login for user ID: 102', '2025-04-18 08:13:14'),
(43, 102, 'Account login for user ID: 102', '2025-04-18 11:41:52'),
(44, 102, 'Account login for user ID: 102', '2025-04-18 11:53:21'),
(45, 102, 'Account login for user ID: 102', '2025-04-18 12:05:28'),
(46, 102, 'Account login for user ID: 102', '2025-04-18 12:06:27'),
(47, 102, 'Account login for user ID: 102', '2025-04-18 16:23:02'),
(48, 102, 'Account login for user ID: 102', '2025-04-19 21:03:26'),
(49, 102, 'Account login for user ID: 102', '2025-04-19 21:16:55'),
(50, 102, 'Account login for user ID: 102', '2025-04-19 21:18:55'),
(51, 102, 'Account login for user ID: 102', '2025-04-19 21:24:09'),
(52, 102, 'Account login for user ID: 102', '2025-04-19 21:25:47'),
(53, 102, 'Account login for user ID: 102', '2025-04-19 21:29:08'),
(54, 102, 'Account login for user ID: 102', '2025-04-19 21:30:13'),
(55, 102, 'Account login for user ID: 102', '2025-04-19 21:31:23'),
(56, 102, 'Account login for user ID: 102', '2025-04-19 21:37:28'),
(57, 102, 'Account login for user ID: 102', '2025-04-20 11:02:58'),
(58, 102, 'Account login for user ID: 102', '2025-04-20 11:05:55'),
(59, 102, 'Added new user with ID 107', '2025-04-20 11:07:39'),
(60, 102, 'Account login for user ID: 102', '2025-04-20 11:10:21'),
(61, 102, 'Account login for user ID: 102', '2025-04-20 11:11:03'),
(62, 102, 'Account login for user ID: 102', '2025-04-20 11:20:56'),
(63, 102, 'Account login for user ID: 102', '2025-04-20 11:22:20'),
(64, 102, 'Account login for user ID: 102', '2025-04-20 11:25:17'),
(65, 102, 'Account login for user ID: 102', '2025-04-20 11:29:10'),
(66, 102, 'Account login for user ID: 102', '2025-04-20 11:30:29'),
(67, 102, 'Account login for user ID: 102', '2025-04-20 11:36:15'),
(68, 102, 'Account login for user ID: 102', '2025-04-20 11:43:59'),
(69, 102, 'Account login for user ID: 102', '2025-04-20 21:24:11'),
(70, 102, 'Added new user with ID 108', '2025-04-20 21:25:04'),
(71, 102, 'Account login for user ID: 102', '2025-04-20 21:30:56'),
(72, 102, 'Account login for user ID: 102', '2025-04-21 20:44:18'),
(73, 102, 'Account login for user ID: 102', '2025-04-21 21:02:00'),
(74, 102, 'Account login for user ID: 102', '2025-04-21 21:04:01'),
(75, 102, 'Account login for user ID: 102', '2025-04-21 21:05:08'),
(76, 102, 'Account login for user ID: 102', '2025-04-21 21:26:36'),
(77, 102, 'Approved user with ID 108', '2025-04-21 21:27:13'),
(78, 102, 'Account login for user ID: 102', '2025-04-21 21:34:25'),
(79, 102, 'Account login for user ID: 102', '2025-04-21 21:35:08'),
(80, 102, 'Account login for user ID: 102', '2025-04-21 21:37:28'),
(81, 102, 'Account login for user ID: 102', '2025-04-21 21:41:24'),
(82, 102, 'Account login for user ID: 102', '2025-04-21 21:42:39'),
(83, 102, 'Account login for user ID: 102', '2025-04-21 21:47:50'),
(84, 102, 'Account login for user ID: 102', '2025-04-21 21:49:14'),
(85, 102, 'Account login for user ID: 102', '2025-04-21 21:50:11'),
(86, 102, 'Account login for user ID: 102', '2025-04-21 21:52:04'),
(87, 102, 'Account login for user ID: 102', '2025-04-24 18:39:23'),
(88, 102, 'Account login for user ID: 102', '2025-04-25 21:08:33'),
(89, 102, 'Added new user with ID 109', '2025-04-25 21:10:26'),
(90, 102, 'Update user with ID 109', '2025-04-25 21:10:37'),
(91, 102, 'Approved user with ID 109', '2025-04-25 21:10:50'),
(92, 102, 'Account login for user ID: 102', '2025-04-25 21:40:40'),
(93, 102, 'Account login for user ID: 102', '2025-04-25 21:42:32'),
(94, 102, 'Update user with ID 109', '2025-04-25 21:42:57'),
(95, 102, 'Approved user with ID 109', '2025-04-25 21:45:28'),
(96, 102, 'Account login for user ID: 102', '2025-04-25 21:51:37'),
(97, 102, 'Account login for user ID: 102', '2025-04-25 21:52:54'),
(98, 102, 'Account login for user ID: 102', '2025-04-27 19:25:49'),
(99, 102, 'Account login for user ID: 102', '2025-04-27 19:44:46'),
(100, 102, 'Account login for user ID: 102', '2025-04-27 20:01:22'),
(101, 102, 'Account login for user ID: 102', '2025-04-27 20:02:00'),
(102, 102, 'Account login for user ID: 102', '2025-04-27 20:09:02'),
(103, 102, 'Account login for user ID: 102', '2025-04-27 20:28:04'),
(104, 102, 'Account login for user ID: 102', '2025-04-27 21:59:36'),
(105, 102, 'Account login for user ID: 102', '2025-04-27 22:10:42'),
(106, 102, 'Account login for user ID: 102', '2025-04-27 22:37:20'),
(107, 102, 'Account login for user ID: 102', '2025-04-27 22:45:08'),
(108, 102, 'Account login for user ID: 102', '2025-04-27 22:56:16'),
(109, 102, 'Account login for user ID: 102', '2025-04-27 23:00:55'),
(110, 102, 'Added new cottage with ID 1', '2025-04-27 23:01:25'),
(111, 102, 'Account login for user ID: 102', '2025-04-27 23:05:00'),
(112, 102, 'Account login for user ID: 102', '2025-04-27 23:06:26'),
(113, 102, 'Account login for user ID: 102', '2025-04-27 23:07:27'),
(114, 102, 'Account login for user ID: 102', '2025-04-27 23:08:37'),
(115, 102, 'Account login for user ID: 102', '2025-04-27 23:09:07'),
(116, 102, 'Account login for user ID: 102', '2025-04-27 23:10:02'),
(117, 102, 'Account login for user ID: 102', '2025-04-27 23:12:01'),
(118, 102, 'Account login for user ID: 102', '2025-04-27 23:14:40'),
(119, 102, 'Added new cottage with ID 1002', '2025-04-27 23:15:13'),
(120, 102, 'Account login for user ID: 102', '2025-04-28 20:11:27'),
(121, 102, 'Account login for user ID: 102', '2025-04-28 20:13:22'),
(122, 102, 'Account login for user ID: 102', '2025-04-28 21:40:29'),
(123, 102, 'Account login for user ID: 102', '2025-04-28 22:00:34'),
(124, 102, 'Update user with ID 107', '2025-04-28 22:00:47'),
(125, 102, 'Account login for user ID: 102', '2025-04-29 17:58:25'),
(126, 102, 'Account login for user ID: 102', '2025-04-29 22:42:34'),
(127, 102, 'Account login for user ID: 102', '2025-05-01 19:08:59'),
(128, 102, 'Account login for user ID: 102', '2025-05-02 09:07:24'),
(129, 102, 'Account login for user ID: 102', '2025-05-02 09:07:55'),
(130, 102, 'Account login for user ID: 102', '2025-05-02 09:09:32'),
(131, 102, 'User logged in with ID 102', '2025-05-02 14:04:14'),
(132, 102, 'User logged in with ID 102', '2025-05-02 14:13:40'),
(133, 102, 'User logged in with ID 102', '2025-05-02 14:16:22'),
(134, 102, 'User logged in with ID 102', '2025-05-02 14:22:10'),
(135, 112, 'User logged in with ID 112', '2025-05-02 15:26:48'),
(136, 102, 'User logged in with ID 102', '2025-05-03 22:32:02'),
(137, 102, 'User logged in with ID 102', '2025-05-03 22:49:39'),
(138, 102, 'User logged in with ID 102', '2025-05-03 23:33:54'),
(139, 102, 'User logged in with ID 102', '2025-05-04 10:30:33'),
(140, 102, 'User logged in with ID 102', '2025-05-04 11:04:33'),
(141, 102, 'User logged in with ID 102', '2025-05-04 11:05:50'),
(142, 102, 'User logged in with ID 102', '2025-05-04 11:07:39'),
(143, 102, 'User logged in with ID 102', '2025-05-04 11:40:54'),
(144, 102, 'User logged in with ID 102', '2025-05-04 12:10:35'),
(145, 102, 'User logged in with ID 102', '2025-05-04 12:21:07'),
(146, 102, 'User logged in with ID 102', '2025-05-04 12:23:40'),
(147, 102, 'User logged in with ID 102', '2025-05-04 12:27:36'),
(148, 102, 'User logged in with ID 102', '2025-05-04 12:30:28'),
(149, 102, 'User logged in with ID 102', '2025-05-04 12:33:06'),
(150, 102, 'User logged in with ID 102', '2025-05-04 18:16:46'),
(151, 102, 'User logged in with ID 102', '2025-05-04 18:25:35'),
(152, 102, 'User logged in with ID 102', '2025-05-04 18:28:35'),
(153, 102, 'User logged in with ID 102', '2025-05-04 18:56:27'),
(154, 102, 'User logged in with ID 102', '2025-05-04 18:57:37'),
(155, 102, 'User logged in with ID 102', '2025-05-04 19:16:47'),
(156, 102, 'User logged in with ID 102', '2025-05-04 19:17:54'),
(157, 102, 'User logged in with ID 102', '2025-05-04 19:19:04'),
(158, 102, 'User logged in with ID 102', '2025-05-04 21:12:57'),
(159, 102, 'User logged in with ID 102', '2025-05-04 22:32:35'),
(160, 102, 'User logged in with ID 102', '2025-05-04 23:13:44'),
(161, 102, 'User logged in with ID 102', '2025-05-04 23:17:38'),
(162, 102, 'User logged in with ID 102', '2025-05-04 23:27:25'),
(163, 102, 'User logged in with ID 102', '2025-05-05 09:35:08'),
(164, 102, 'User logged in with ID 102', '2025-05-05 09:51:56'),
(165, 102, 'User logged in with ID 102', '2025-05-05 09:57:49'),
(166, 102, 'User logged in with ID 102', '2025-05-05 10:06:53'),
(167, 102, 'User logged in with ID 102', '2025-05-05 10:09:51'),
(168, 102, 'User logged in with ID 102', '2025-05-05 10:31:21'),
(169, 102, 'User logged in with ID 102', '2025-05-05 11:07:14'),
(170, 102, 'User logged in with ID 102', '2025-05-05 11:22:59'),
(171, 102, 'User logged in with ID 102', '2025-05-05 11:52:53'),
(172, 102, 'User logged in with ID 102', '2025-05-05 12:16:44'),
(173, 102, 'User logged in with ID 102', '2025-05-05 12:26:48'),
(174, 102, 'User logged in with ID 102', '2025-05-05 13:07:56'),
(175, 102, 'User logged in with ID 102', '2025-05-05 13:43:37'),
(176, 102, 'User logged in with ID 102', '2025-05-05 13:49:35'),
(177, 102, 'User logged in with ID 102', '2025-05-05 14:05:53'),
(178, 102, 'User logged in with ID 102', '2025-05-05 14:15:22'),
(179, 102, 'User logged in with ID 102', '2025-05-05 14:33:19'),
(180, 102, 'User logged in with ID 102', '2025-05-05 14:59:52'),
(181, 102, 'User logged in with ID 102', '2025-05-05 15:03:05'),
(182, 102, 'User logged in with ID 102', '2025-05-05 16:02:11'),
(183, 102, 'User logged in with ID 102', '2025-05-05 16:07:48'),
(184, 102, 'User logged in with ID 102', '2025-05-05 18:00:06'),
(185, 102, 'User logged in with ID 102', '2025-05-05 18:16:53'),
(186, 102, 'User logged in with ID 102', '2025-05-05 18:19:35'),
(187, 102, 'User logged in with ID 102', '2025-05-05 18:37:12'),
(188, 102, 'User logged in with ID 102', '2025-05-05 18:39:16'),
(189, 102, 'User logged in with ID 102', '2025-05-05 20:44:48'),
(190, 102, 'User logged in with ID 102', '2025-05-05 20:58:10'),
(191, 102, 'User logged in with ID 102', '2025-05-05 21:10:22'),
(192, 102, 'User logged in with ID 102', '2025-05-05 21:14:44'),
(193, 102, 'User logged in with ID 102', '2025-05-05 21:26:06'),
(194, 102, 'User logged in with ID 102', '2025-05-05 21:29:06'),
(195, 102, 'User logged in with ID 102', '2025-05-05 21:39:53'),
(196, 102, 'User logged in with ID 102', '2025-05-05 21:46:21'),
(197, 102, 'User logged in with ID 102', '2025-05-05 22:26:36'),
(198, 102, 'User logged in with ID 102', '2025-05-05 22:37:24'),
(199, 102, 'User logged in with ID 102', '2025-05-05 22:41:26'),
(200, 102, 'User logged in with ID 102', '2025-05-05 22:47:52'),
(201, 102, 'User logged in with ID 102', '2025-05-05 22:51:48'),
(202, 102, 'User logged in with ID 102', '2025-05-05 22:54:19'),
(203, 102, 'User logged in with ID 102', '2025-05-05 22:57:50'),
(204, 102, 'User logged in with ID 102', '2025-05-06 10:32:32'),
(205, 102, 'User logged in with ID 102', '2025-05-08 09:51:01'),
(206, 102, 'User logged in with ID 102', '2025-05-08 10:10:22'),
(207, 102, 'User logged in with ID 102', '2025-05-08 10:13:25'),
(208, 102, 'User logged in with ID 102', '2025-05-08 10:17:19'),
(209, 102, 'User logged in with ID 102', '2025-05-08 10:31:08'),
(210, 102, 'User logged in with ID 102', '2025-05-08 10:44:46'),
(211, 102, 'User logged in with ID 102', '2025-05-08 11:05:52'),
(212, 102, 'User logged in with ID 102', '2025-05-08 15:04:30'),
(213, 102, 'User logged in with ID 102', '2025-05-08 15:24:08'),
(214, 102, 'User logged in with ID 102', '2025-05-08 15:52:55'),
(215, 102, 'User logged in with ID 102', '2025-05-08 23:41:54'),
(216, 102, 'User logged in with ID 102', '2025-05-09 00:02:38'),
(217, 102, 'User logged in with ID 102', '2025-05-09 01:15:42'),
(218, 102, 'User logged in with ID 102', '2025-05-09 01:33:52'),
(219, 102, 'User logged in with ID 102', '2025-05-09 01:46:43'),
(220, 102, 'Approved booking with ID 12', '2025-05-09 01:52:34'),
(221, 102, 'User logged in with ID 102', '2025-05-09 02:13:40'),
(222, 102, 'Approved booking with ID 5', '2025-05-09 02:13:50'),
(223, 102, 'Reject booking with ID 6', '2025-05-09 02:14:01'),
(224, 102, 'User logged in with ID 102', '2025-05-09 02:18:23'),
(225, 102, 'User logged in with ID 102', '2025-05-09 02:22:39'),
(226, 102, 'Approved booking with ID 12', '2025-05-09 02:23:50'),
(227, 102, 'User logged in with ID 102', '2025-05-09 02:28:56'),
(228, 102, 'User logged in with ID 102', '2025-05-09 02:30:54'),
(229, 102, 'Delete booking with ID 6', '2025-05-09 02:31:03'),
(230, 102, 'Delete booking with ID 7', '2025-05-09 02:31:09'),
(231, 102, 'Delete booking with ID 8', '2025-05-09 02:31:17'),
(232, 102, 'Delete booking with ID 9', '2025-05-09 02:31:21'),
(233, 102, 'Approved booking with ID 13', '2025-05-09 02:36:59'),
(234, 102, 'User logged in with ID 102', '2025-05-31 13:15:50'),
(235, 102, 'User logged in with ID 102', '2025-05-31 13:18:15');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `room_id` int(11) NOT NULL,
  `room_number` int(11) NOT NULL,
  `room_type` varchar(55) NOT NULL,
  `bed_type` varchar(55) NOT NULL,
  `capacity` int(11) NOT NULL,
  `price_per_night` double NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`room_id`, `room_number`, `room_type`, `bed_type`, `capacity`, `price_per_night`, `status`) VALUES
(1, 101, 'family', '2 single', 5, 1000, 'Available'),
(2, 101, 'Single', 'Twin', 1, 1500, 'Booked'),
(3, 102, 'Double', 'Queen', 2, 2000, 'Available'),
(4, 103, 'Suite', 'King', 3, 2500, 'Booked'),
(5, 104, 'Single', 'Twin', 1, 1000, 'Booked'),
(6, 105, 'Double', 'Queen', 2, 2300, 'Available'),
(7, 106, 'Suite', 'King', 4, 3000, 'Available'),
(8, 107, 'Single', 'Single', 1, 2000, 'Available'),
(9, 108, 'Double', 'Double', 2500, 1150, 'Available'),
(10, 109, 'Suite', 'King', 3, 2750, 'Available'),
(11, 110, 'Double', 'Queen', 2, 1250, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `securityquestion`
--

CREATE TABLE `securityquestion` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `question` text NOT NULL,
  `answer` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `securityquestion`
--

INSERT INTO `securityquestion` (`id`, `user_id`, `question`, `answer`) VALUES
(2, 102, 'What is the name of your favorite teacher?', 'ashley'),
(3, 102, 'What was the name of your first pet?', 'nala');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(10) NOT NULL,
  `f_name` varchar(50) NOT NULL,
  `l_name` varchar(50) NOT NULL,
  `username` varchar(100) NOT NULL,
  `email` varchar(200) NOT NULL,
  `role` varchar(10) NOT NULL,
  `password` varchar(100) NOT NULL,
  `status` varchar(10) NOT NULL,
  `profile_pic` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `f_name`, `l_name`, `username`, `email`, `role`, `password`, `status`, `profile_pic`) VALUES
(101, 'Ashley', 'Balbon', 'staff', 'ash@gmail.com', 'Staff', 'A6xnQhbz4Vx2HuGl4lXwZ5U2I8iziLRFnhP5eNfIRvQ=', 'Approved', NULL),
(102, 'John Phil', 'Esconde', 'Admin', 'johnescondephil15@gmail.com', 'Admin', 'WZRHGrsBESr8wYFZ9sx0tPURuZgG2lmzyvWpwXPKz8U=', 'Approved', 'me.png'),
(105, 'Jessa Mae', 'Gomez', 'jes123', 'jessa@gmail.com', 'Staff', 'D1zgLxcJIgevRBTdC65VLnaKmsSeTN/d+d39PQv0BPs=', 'Approved', NULL),
(107, 'John', 'Phil', 'john123', 'john@gmail.com', 'Admin', '5wPm//HumB8JgO4mWO3+Sure94GxWEoddBQ71U55elw=', 'Approved', NULL),
(108, 'James', 'Esconde', 'james123', 'james@gmail.com', 'Admin', 'zoaWWCZY/9wyCFqQtzu6Br7QVT+hL9m5nujBnYp/j+I=', 'Approved', NULL),
(109, 'test', 'test', 'test1', 'test1@gmail.com', 'Staff', 'JLQRDH7A0K+fryitny3dTiAud7xOhrx/ssx2EdMQf4o=', 'Approved', NULL),
(110, 'test', 'sds', 'sdsd', 'test@gmail.com', 'Staff', 'CCp6KoHCcz/QNWfkfgttnwnTLsgAZb2pxc003RxPnt8=', 'Pending', NULL),
(112, 'Ashess', 'Balbz', 'Ashuri', 'ashuri@gmail.com', 'Admin', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Pending', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`booking_id`),
  ADD KEY `cottage_id` (`cottage_id`),
  ADD KEY `room_id` (`room_id`);

--
-- Indexes for table `cottage`
--
ALTER TABLE `cottage`
  ADD PRIMARY KEY (`cottage_id`);

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`room_id`);

--
-- Indexes for table `securityquestion`
--
ALTER TABLE `securityquestion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `booking_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `cottage`
--
ALTER TABLE `cottage`
  MODIFY `cottage_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1013;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=236;

--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
  MODIFY `room_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `securityquestion`
--
ALTER TABLE `securityquestion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=113;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `booking_ibfk_1` FOREIGN KEY (`cottage_id`) REFERENCES `cottage` (`cottage_id`),
  ADD CONSTRAINT `booking_ibfk_2` FOREIGN KEY (`room_id`) REFERENCES `room` (`room_id`);

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `logs_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);

--
-- Constraints for table `securityquestion`
--
ALTER TABLE `securityquestion`
  ADD CONSTRAINT `securityquestion_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
