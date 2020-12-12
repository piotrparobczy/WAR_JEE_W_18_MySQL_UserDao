CREATE DATABASE workshop2 CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
use workshop2;


CREATE TABLE users (
                         id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY ,
                         username varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                         email varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL UNIQUE KEY,
                         password varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

