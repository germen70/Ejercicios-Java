DROP DATABASE IF EXISTS Ciudad;

CREATE DATABASE Ciudad;

USE Ciudad;

CREATE TABLE IF NOT EXISTS Provincia (
 cod_provincia  INT,
 nom_provincia  VARCHAR(50),
 PRIMARY KEY (cod_provincia) );

CREATE TABLE IF NOT EXISTS Sesiones (
 dni            VARCHAR (10),
 nombre         VARCHAR (50),
 direccion      VARCHAR (50),
 poblacion      VARCHAR (50),
 cod_provincia  INT NOT NULL , /*PONER NOT NULL EN LAS QUE SEAN FORENKEY, tambien vale poner en vez del foreing key: REFERENCES Provincia*/
 PRIMARY KEY (dni);
 FOREIGN KEY (cod_provincia) REFERENCES Provincia(cod_provincia));
