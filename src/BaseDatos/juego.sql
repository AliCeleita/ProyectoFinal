-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-11-2017 a las 03:57:32
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
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE `registro` (
  `id` int(50) NOT NULL,
  `doc` int(50) NOT NULL,
  `nom` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `ape` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `edad` int(5) NOT NULL,
  `fecNac` date NOT NULL,
  `fecReg` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `registro`
--

INSERT INTO `registro` (`id`, `doc`, `nom`, `ape`, `edad`, `fecNac`, `fecReg`) VALUES
(3, 23, 'b', 'd', 17, '2017-11-18', '2017-11-16 02:21:25'),
(4, 98, 'bra', 'gar', 20, '2017-11-19', '2017-11-16 02:29:45');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registroc`
--

CREATE TABLE `registroc` (
  `id` int(50) NOT NULL,
  `doc` int(50) NOT NULL,
  `nom` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `ape` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `edad` int(5) NOT NULL,
  `fecNac` date NOT NULL,
  `fecReg` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registrom`
--

CREATE TABLE `registrom` (
  `id` int(50) NOT NULL,
  `doc` int(50) NOT NULL,
  `nom` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `ape` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `edad` int(5) NOT NULL,
  `fecNac` date NOT NULL,
  `fecReg` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `registrom`
--

INSERT INTO `registrom` (`id`, `doc`, `nom`, `ape`, `edad`, `fecNac`, `fecReg`) VALUES
(2, 98, 'bra', 'gar', 6, '2017-11-19', '2017-11-16 02:29:11');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `registroc`
--
ALTER TABLE `registroc`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `registrom`
--
ALTER TABLE `registrom`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `registro`
--
ALTER TABLE `registro`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `registroc`
--
ALTER TABLE `registroc`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `registrom`
--
ALTER TABLE `registrom`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
