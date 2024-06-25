/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  lucas
 * Created: 24 jun 2024
 */

CREATE DATABASE agenda;

USE agenda;

CREATE TABLE contacto (
    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    direccion VARCHAR(50) NOT NULL,
    telefono VARCHAR(50) NOT NULL
);


INSERT INTO contacto (nombre, apellido, direccion, telefono) VALUES ("Carlos", "García", "123 Calle Principal", "555-1234");
INSERT INTO contacto (nombre, apellido, direccion, telefono) VALUES ("María", "Rodríguez", "456 Calle Secundaria", "555-5678");
INSERT INTO contacto (nombre, apellido, direccion, telefono) VALUES ("Juan", "Martínez", "789 Calle Tercera", "555-8765");
INSERT INTO contacto (nombre, apellido, direccion, telefono) VALUES ("Ana", "López", "101 Avenida Central", "555-4321");
INSERT INTO contacto (nombre, apellido, direccion, telefono) VALUES ("José", "Hernández", "202 Avenida Norte", "555-6789");
INSERT INTO contacto (nombre, apellido, direccion, telefono) VALUES ("Luisa", "Pérez", "303 Avenida Sur", "555-9876");
INSERT INTO contacto (nombre, apellido, direccion, telefono) VALUES ("Miguel", "González", "404 Calle Cuarta", "555-6543");
INSERT INTO contacto (nombre, apellido, direccion, telefono) VALUES ("Sofía", "Sánchez", "505 Calle Quinta", "555-3210");
INSERT INTO contacto (nombre, apellido, direccion, telefono) VALUES ("Diego", "Ramírez", "606 Calle Sexta", "555-0987");
INSERT INTO contacto (nombre, apellido, direccion, telefono) VALUES ("Isabel", "Torres", "707 Calle Séptima", "555-7654");