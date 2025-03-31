-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 31, 2025 at 06:23 AM
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
(14, 101, 'Approved user with ID 127', '2025-03-31 00:28:36');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `user_id` (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `logs_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
