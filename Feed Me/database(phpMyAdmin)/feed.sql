-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 25, 2017 at 07:30 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `feed`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `des` varchar(100) NOT NULL,
  `price` varchar(100) NOT NULL,
  `qty` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`des`, `price`, `qty`) VALUES
('Cheesy Garlic Bread ', '365', '3'),
('Chicken Bacon ', '940', '5'),
('Cheese Lovers ', '940', '1');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `fullname` varchar(50) NOT NULL,
  `contactnumber` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`fullname`, `contactnumber`, `username`, `password`) VALUES
('', '', 'malith', 'malith'),
('malith', '', '', ''),
('kalana', 'kalana', 'kalana', 'kalana'),
('malith', '077', 'madhura', 'madhura'),
('buddhi imesha', '0777', 'buddhi', 'buddhi');

-- --------------------------------------------------------

--
-- Table structure for table `kfc`
--

CREATE TABLE `kfc` (
  `product` varchar(100) NOT NULL,
  `des` varchar(100) NOT NULL,
  `price` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kfc`
--

INSERT INTO `kfc` (`product`, `des`, `price`) VALUES
('<img src ="img/kfc1.png" width="150" height="150"', 'Zinger Burger', '380'),
('<img src ="img/kfc2.jpg" width="150" height="150"', 'Chicken Grilled Bucket 8PC', '1900'),
('<img src ="img/kfc3.jpg" width="150" height="150"', 'Shrimp Star', '480'),
('<img src ="img/kfc4.jpeg" width="150" height="150"', 'Chicken Bucket 12 PC', '2400'),
('<img src ="img/kfc5.jpg" width="150" height="150"', 'Spicy Wings 20 PC', '1380');

-- --------------------------------------------------------

--
-- Table structure for table `mc`
--

CREATE TABLE `mc` (
  `product` varchar(100) NOT NULL,
  `des` varchar(100) NOT NULL,
  `price` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mc`
--

INSERT INTO `mc` (`product`, `des`, `price`) VALUES
('<img src ="img/mc1.png" width="150" height="150"', 'Happy Meal Rice-Chicken', '450'),
('<img src ="img/mc2.png" width="150" height="150"', 'Fries', '200'),
('<img src ="img/mc3.png" width="150" height="150"', 'Big Mac', '580'),
('<img src ="img/mc4.png" width="150" height="150"', 'Chicken McNuggets 9PC', '680'),
('<img src ="img/mc5.png" width="150" height="150"', 'McSpicy Chicken Rice', '370');

-- --------------------------------------------------------

--
-- Table structure for table `pizzahut`
--

CREATE TABLE `pizzahut` (
  `product` varchar(100) NOT NULL,
  `des` varchar(100) NOT NULL,
  `price` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pizzahut`
--

INSERT INTO `pizzahut` (`product`, `des`, `price`) VALUES
('<img src ="img/pizza1.png" width="150" height="150"', 'Chocolate Melt Lava Cake', '240'),
('<img src ="img/pizza2.png" width="150" height="150"', 'Cheesy Garlic Bread ', '365'),
('<img src ="img/pizza3.png" width="150" height="150"', 'Chicken Bacon ', '940'),
('<img src ="img/pizza4.png" width="150" height="150"', 'Cheese Lovers ', '940'),
('<img src ="img/pizza5.png" width="150" height="150"', 'Devilled Chicken', '940');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
