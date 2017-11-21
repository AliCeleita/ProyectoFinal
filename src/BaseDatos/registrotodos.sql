-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2017 a las 04:53:21
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `juego`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registrotodos`
--

CREATE TABLE `registrotodos` (
  `id` int(50) NOT NULL,
  `doc` int(50) NOT NULL,
  `nom` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `ape` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `edad` int(5) NOT NULL,
  `fecNac` date NOT NULL,
  `fecReg` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `registrotodos`
--

INSERT INTO `registrotodos` (`id`, `doc`, `nom`, `ape`, `edad`, `fecNac`, `fecReg`) VALUES
(1, 57, 'g', 'g', 9, '2017-11-17', '2017-11-21 03:47:09'),
(2, 424, 'g', 'fg', 9, '2017-11-19', '2017-11-21 03:49:08'),
(3, 4024, 'sgd', 'df', 5, '2017-11-19', '2017-11-21 03:51:01');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `registrotodos`
--
ALTER TABLE `registrotodos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `registrotodos`
--
ALTER TABLE `registrotodos`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
