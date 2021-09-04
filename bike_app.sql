-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Sep 04, 2021 at 06:33 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bike_app`
--

-- --------------------------------------------------------

--
-- Table structure for table `novelty`
--

CREATE TABLE `novelty` (
  `id` int(11) NOT NULL,
  `title` varchar(30) NOT NULL,
  `route` int(11) NOT NULL,
  `type` varchar(30) NOT NULL,
  `description` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `novelty`
--

INSERT INTO `novelty` (`id`, `title`, `route`, `type`, `description`) VALUES
(4, 'Perdida de tiempo', 22, 'Cierre vial', 'Derrumbe'),
(5, 'Amigo', 23, 'Otro', 'Me encontré con un amigo'),
(6, 'Llanta', 23, 'Falla mecánica', 'Pinché la llanta delantera');

-- --------------------------------------------------------

--
-- Table structure for table `route`
--

CREATE TABLE `route` (
  `id` int(11) NOT NULL,
  `user` varchar(60) NOT NULL,
  `start` timestamp NULL DEFAULT current_timestamp(),
  `end` timestamp NULL DEFAULT NULL,
  `starting_location` varchar(60) NOT NULL,
  `final_location` varchar(60) DEFAULT NULL,
  `distance` double DEFAULT NULL
) ;

--
-- Dumping data for table `route`
--

INSERT INTO `route` (`id`, `user`, `start`, `end`, `starting_location`, `final_location`, `distance`) VALUES
(1, 'steven@gmail.com', '2021-09-01 16:09:34', '2021-09-02 19:13:33', 'Manizales', 'Pereira', 134.5),
(2, 'steven@gmail.com', '2021-09-01 16:12:59', '2021-09-01 17:54:59', 'Pereira', 'Manizales', 95.7),
(4, 'steven@gmail.com', '2021-09-01 17:43:01', '2021-09-01 17:54:31', 'Monteria', 'Bquilla', 269.4),
(5, 'steven@gmail.com', '2021-09-02 02:29:38', '2021-09-02 03:33:49', 'Madrid', 'Barcelona', 200.9),
(7, 'jois@gmail.com', '2021-09-02 02:38:53', '2021-09-03 04:22:11', 'armenia', 'pereira', 250),
(8, 'jois@gmail.com', '2021-09-02 02:43:20', '2021-09-02 20:02:19', 'cucuta', 'bquilla', 123),
(9, 'jois@gmail.com', '2021-09-02 02:45:20', '2021-09-02 20:02:01', 'la plata', 'buenos aires', 569),
(10, 'angela@gmail.com', '2021-09-02 04:47:12', '2021-09-03 04:34:36', 'manizales', 'cali', 45),
(11, 'angela@gmail.com', '2021-09-02 04:48:03', '2021-09-03 04:35:08', 'cartagena', 'monteria', 36.7),
(12, 'steven@gmail.com', '2021-09-02 19:12:14', '2021-09-02 19:57:27', 'everton', 'liverpool', 2.1),
(13, 'steven@gmail.com', '2021-09-02 19:55:25', '2021-09-02 19:59:50', 'cali', 'pereira', 52),
(15, 'steven@gmail.com', '2021-09-03 03:33:15', '2021-09-03 04:16:47', 'Boyaca', 'Popayan', 124.6),
(16, 'steven@gmail.com', '2021-09-03 03:35:03', '2021-09-03 03:59:14', 'San sebastian', 'UAM', 21.46),
(17, 'jois@gmail.com', '2021-09-03 04:18:42', '2021-09-03 04:21:28', 'galan', 'chipre', 10.5),
(18, 'chelita@gmail.com', '2021-09-03 04:37:48', '2021-09-03 04:38:33', 'enea', 'bosques', 16.89),
(19, 'steven@gmail.com', '2021-09-04 03:10:44', '2021-09-04 03:12:56', 'UAM', 'Centro', 5.9),
(20, 'jois@gmail.com', '2021-09-04 03:14:39', '2021-09-04 03:15:34', 'universitario', 'san jorge', 10.7),
(21, 'jois@gmail.com', '2021-09-04 03:16:17', '2021-09-04 03:18:14', 'bengala', 'peralonso', 25.7),
(22, 'jois@gmail.com', '2021-09-04 04:08:02', '2021-09-04 04:11:04', 'bosques del norte', 'san jose', 14.6),
(23, 'jois@gmail.com', '2021-09-04 04:20:50', '2021-09-04 04:23:10', 'UAM', 'Estadio', 15.7);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `email` varchar(60) NOT NULL,
  `name` varchar(60) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`email`, `name`, `phone`, `password`) VALUES
('angela@gmail.com', 'angela', '3148000289', '789'),
('chelita@gmail.com', 'gracieladd', '123456789', '456'),
('jois@gmail.com', 'jois', '3207284056', 'admin'),
('michael@gmail.com', 'MICHAEL', '147852369', '147'),
('steven@gmail.com', 'steven', '3148000279', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `novelty`
--
ALTER TABLE `novelty`
  ADD PRIMARY KEY (`id`),
  ADD KEY `route` (`route`);

--
-- Indexes for table `route`
--
ALTER TABLE `route`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user` (`user`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `novelty`
--
ALTER TABLE `novelty`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `route`
--
ALTER TABLE `route`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `novelty`
--
ALTER TABLE `novelty`
  ADD CONSTRAINT `novelty_ibfk_1` FOREIGN KEY (`route`) REFERENCES `route` (`id`);

--
-- Constraints for table `route`
--
ALTER TABLE `route`
  ADD CONSTRAINT `route_ibfk_1` FOREIGN KEY (`user`) REFERENCES `user` (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
