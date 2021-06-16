DROP TABLE IF EXISTS `countries`;
CREATE TABLE `countries` (
    `id` int  PRIMARY KEY,
    `name` varchar(80) NOT NULL,
    `code` varchar(3) DEFAULT NULL
);