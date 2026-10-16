DROP DATABASE IF EXISTS ReservaVuelos;

CREATE DATABASE ReservaVuelos;

USE ReservaVuelos;

CREATE TABLE IF NOT EXISTS ReservaVuelos.Vuelos (
 Id_Vuelo   VARCHAR(10) NOT NULL UNIQUE,
 origen     VARCHAR(50),
 destino    VARCHAR(50),
 fecha      VARCHAR(10),
 capacidad  INT UNSIGNED,
 PRIMARY KEY (Id_Vuelo) );


INSERT INTO ReservaVuelos.Vuelos VALUES ('IB7650', 'VALENCIA', 'SEVILLA','2024-03-18',130);
INSERT INTO ReservaVuelos.Vuelos VALUES ('IB657', 'BARCELONA', 'VALENCIA','2024-03-18',245);
INSERT INTO ReservaVuelos.Vuelos VALUES ('JET321', 'PARIS', 'VALENCIA','2024-03-19',25);
INSERT INTO ReservaVuelos.Vuelos VALUES ('SWWK19G', 'GINEBRA', 'LISBOA','2024-03-20',197);



CREATE TABLE IF NOT EXISTS ReservaVuelos.Pasajeros (
 Id_Pasajero       SMALLINT UNSIGNED NOT NULL,
 Pasaporte         VARCHAR (10),
 Nombre_Pasajero   VARCHAR (50),
 PRIMARY KEY (Id_Pasajero) );


INSERT INTO ReservaVuelos.Pasajeros VALUES (9566,'12345678X','Alejandro Varela');
INSERT INTO ReservaVuelos.Pasajeros VALUES (9654,'11223344H','Ana Ortega');
INSERT INTO ReservaVuelos.Pasajeros VALUES (9598,'X230032Y','Alicia Montes');
INSERT INTO ReservaVuelos.Pasajeros VALUES (9742,'99887766A','Aitor Abadia');


CREATE TABLE IF NOT EXISTS ReservaVuelos.VueloPasajero  (
 Id_Vuelo          VARCHAR(10),
 Id_Pasajero       SMALLINT UNSIGNED,
 Num_Asiento       SMALLINT UNSIGNED,
 PRIMARY KEY (Id_Vuelo,Id_Pasajero),
 FOREIGN KEY (Id_Vuelo) REFERENCES ReservaVuelos.Vuelos(Id_Vuelo),
 FOREIGN KEY (Id_Pasajero) REFERENCES ReservaVuelos.Pasajeros(Id_Pasajero) );


INSERT INTO ReservaVuelos.VueloPasajero (Id_Vuelo, Id_Pasajero, Num_Asiento)
VALUES ('IB7650',9598,5);
