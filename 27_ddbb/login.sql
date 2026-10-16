/*DROP DATABASE IF EXISTS login;

CREATE DATABASE login;

USE login;

DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios(
	ID VARCHAR(6) PRIMARY KEY NOT NULL,
    NOMBRE VARCHAR (255) NOT NULL,
    PASS VARCHAR (255) NOT NULL
    );
INSERT INTO login.usuarios (ID, NOMBRE, PASS) 
VALUES 
    ('10005', 'german', 'germen'),
    ('20015', 'Naranjas', 'germen'),
    ('30478', 'Aceite', 'germen'),
    ('25550', 'Leche', 'germen'),
    ('36001', 'Jamón', 'germen'),
	('10201', 'Agua', 'germen');
*/

SELECT NOMBRE FROM login.usuarios;
