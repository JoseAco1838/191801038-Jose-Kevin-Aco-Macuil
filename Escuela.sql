-- phpMyAdmin SQL Dump
-- version 4.0.10.20
-- https://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 22-09-2020 a las 15:01:25
-- Versión del servidor: 5.5.62
-- Versión de PHP: 5.4.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `escuela`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE IF NOT EXISTS `persona` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `clave` varchar(10) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `domicilio` varchar(200) NOT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `correo_electronico` varchar(45) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `genero` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `clave`, `nombre`, `domicilio`, `telefono`, `correo_electronico`, `fecha_nacimiento`, `genero`) VALUES
(1, '001', 'Joaquin Gomez', 'Avenida conocida', '5531265487', 'mimail@hotmail.com', '2000-01-01', 'Masculino'),
(2, '002', 'Rogelio', 'Benito Juarez', '55654897', 'benito@gmail.com', '2000-01-02', 'Masculino');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
