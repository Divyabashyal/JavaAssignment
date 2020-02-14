-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 14, 2020 at 10:39 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quiz`
--

-- --------------------------------------------------------

--
-- Table structure for table `examine`
--

CREATE TABLE `examine` (
  `TokenID` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Date` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `examine`
--

INSERT INTO `examine` (`TokenID`, `Password`, `Date`) VALUES
('', '', '2020/02/14 14:25:35'),
('12345', '12345', '2020/02/07 13:59:00'),
('AAA', 'AAA', ''),
('divya', 'divya', '2020/02/14 15:06:19'),
('test', 'test', '2020/02/14 15:05:26');

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `QuesId` int(11) NOT NULL,
  `Question` varchar(255) NOT NULL,
  `Option1` varchar(255) NOT NULL,
  `Option2` varchar(255) NOT NULL,
  `Option3` varchar(255) NOT NULL,
  `Option4` varchar(255) NOT NULL,
  `Correct` varchar(255) NOT NULL,
  `Subject` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`QuesId`, `Question`, `Option1`, `Option2`, `Option3`, `Option4`, `Correct`, `Subject`) VALUES
(6, 'Which of these is the third element of communication?\n', 'Sender ', ' Channel', 'Message ', 'Receiver', 'Channel', 'Effective Communication'),
(7, 'Which of these is the most important tool of communication?\n\n', 'Body language', 'Gestures', 'Language', 'Posture', 'Language', 'Effective Communication'),
(8, ' Which of these is the best way to establish a proper rapport with audience?\n', 'Pointing a finger', 'Making eye contact', ' Waving your hands', 'Standing erect', 'Making eye contact', 'Effective Communication'),
(9, ')When writing a formal letter, what do you need to begin with?\n', 'Date', 'Greeting', ' Address', ' Signature', 'Greeting', 'Effective Communication'),
(10, 'What is listening well called?\n', 'Correct listening', 'Passive listening', 'Active listening', 'Total listening', 'Active listening', 'Effective Communication'),
(11, 'The environmental analysis includes?\n\n\n', 'Political conditions', 'Social factors', ' Economic conditions', 'All of the above', 'All of the above', 'Ethics'),
(12, '\"We wish to be good citizens of every community in which we operate.\" This is \n\n\n', 'Ethical Code', ' Political and Social Code', 'Legal Rule', 'Legal Act', 'Ethical Code', 'Ethics'),
(13, 'Use of hacking to promote a political cause\n\n', 'social engineering.', ' hacktivism', '. Denial of Service attack.', 'brute force attack.', ' hacktivism', 'Ethics'),
(14, 'Definition of free speech to includes:\n', 'Nonverbal forms of expression', 'Visual and symbolic forms of expression', 'Right to speak anonymously ', 'All of the above mentioned', 'Right to speak anonymously ', 'Ethics'),
(15, 'A branch of computer science that makes computers perform tasks normally requiring human intelligence.\n', 'Artificial Intelligence', ' Internet of Thing', 'Machine Learning', 'Deep Learning', 'Artificial Intelligence', 'Ethics'),
(16, 'The complexity of Bubble sort algorithm is\n', 'O(n)', ' O(log n)', '  O(n2)', 'O(n log n)', ' O(log n)', 'Java'),
(17, 'In linear search algorithm the Worst case occurs when\n', ' The item is somewhere in the middle of the array', 'The item is not in the array at all', '  The item is the last element in the array', 'The item is the last element in the array or is not there at all', 'The item is the last element in the array or is not there at all', 'Java'),
(18, 'Which of the following data structure is linear data structure?\n', 'Trees', '  Graphs', 'Arrays', 'None of above', 'Arrays', 'Java'),
(19, 'Finding the location of the element with a given value is:\na.    Traversal\nb.    Search\nc.    Sort\nd.    None of above', 'Traversal', '  Search', ' Sort', 'None of above', '  Search', 'Java'),
(20, 'Two main measures for the efficiency of an algorithm are\n', ' Processor and memory', ' Complexity and capacity', 'Time and space', ' Data and space', ' Data and space', 'Java'),
(21, ' A webpage displays a picture. What﻿﻿﻿ ﻿﻿tag ﻿﻿﻿﻿﻿was used to display that picture?\n', 'picture', 'image', 'img', 'src', 'img', 'Web'),
(22, ' Choose the correct HTML tag for the largest heading?\na. <H1>\nb. <H6>\nc. <H10>\nd. <HEAD>', ' <H1>', '<H6>', '<H10>', '<HEAD>', '<H1>', 'Web'),
(23, 'Which of the following is valid IP address?\na. 984.12.787.76\nb. 192.168.321.10\nc. 1.888.234.3456\nd. 192.168.56.115', '984.12.787.76', '192.168.321.10', '1.888.234.3456', '192.168.56.115', '192.168.56.115', 'Web'),
(24, 'Which of the following is used to explore the Internet?\n', 'Browser', 'Spreadsheet', 'Clipboard', 'Draw', 'Browser', 'Web'),
(25, 'Which attribute is used to name an element uniquely?\n', 'class', ' id', 'dot', 'all of above', ' id', 'Web'),
(26, '', '', '', '', '', '', ''),
(27, '', '', '', '', '', '', ''),
(28, '', '', '', '', '', '', ''),
(29, '', '', '', '', '', '', ''),
(30, 'Test Question 1', '1', '2', '3', '4', '1', 'Java'),
(31, 'Test Question 1', '1', '2', '3', '4', '1', 'Java');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `ResultID` int(11) NOT NULL,
  `TokenID` varchar(255) NOT NULL,
  `Result` int(11) NOT NULL,
  `Subject` varchar(255) NOT NULL,
  `Date` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`ResultID`, `TokenID`, `Result`, `Subject`, `Date`) VALUES
(1, 'aaa', 4, 'Effective Communication', '2020/02/13 15:32:18'),
(2, 'AAA', 2, 'Ethics', '2020/02/13 17:04:11'),
(3, 'AAA', 1, 'Java', '2020/02/13 20:45:24'),
(4, 'AAA', 3, 'Web', '2020/02/13 20:47:56'),
(5, 'AAA', 5, 'Ethics', '2020/02/13 20:56:30'),
(6, 'divya', 3, 'Effective Communication', '2020/02/14 15:08:28');

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `SubjectID` int(11) NOT NULL,
  `SubjectName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`SubjectID`, `SubjectName`) VALUES
(4, 'Effective Communication'),
(1, 'Ethics'),
(2, 'Java'),
(3, 'Web');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `Username` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`Username`, `Password`) VALUES
('admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `examine`
--
ALTER TABLE `examine`
  ADD PRIMARY KEY (`TokenID`);

--
-- Indexes for table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`QuesId`);

--
-- Indexes for table `result`
--
ALTER TABLE `result`
  ADD PRIMARY KEY (`ResultID`),
  ADD KEY `TokenID` (`TokenID`),
  ADD KEY `Subject` (`Subject`);

--
-- Indexes for table `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`SubjectID`),
  ADD UNIQUE KEY `Subject Name` (`SubjectName`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`Username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `question`
--
ALTER TABLE `question`
  MODIFY `QuesId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `result`
--
ALTER TABLE `result`
  MODIFY `ResultID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `subjects`
--
ALTER TABLE `subjects`
  MODIFY `SubjectID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `result`
--
ALTER TABLE `result`
  ADD CONSTRAINT `result_ibfk_1` FOREIGN KEY (`TokenID`) REFERENCES `examine` (`TokenID`),
  ADD CONSTRAINT `result_ibfk_2` FOREIGN KEY (`Subject`) REFERENCES `subjects` (`SubjectName`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
