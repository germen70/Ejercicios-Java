/*DROP DATABASE IF EXISTS tienda;

CREATE DATABASE tienda;

USE tienda;

DROP TABLE IF EXISTS productos;

CREATE TABLE productos(
	ID VARCHAR(5) PRIMARY KEY NOT NULL,
    NOMBRE VARCHAR (255) NOT NULL,
    PRECIO DOUBLE
    );

INSERT INTO tienda.productos (ID, NOMBRE, PRECIO) 
VALUES 
    ('10005', 'Platanos', 2.50),
    ('20015', 'Naranjas', 4.50),
    ('30478', 'Aceite', 10.00),
    ('25550', 'Leche', 10.00),
    ('36001', 'Jamón', 12.50),
	('10201', 'Agua', 0.88);
*/
SELECT PRECIO FROM tienda.productos;