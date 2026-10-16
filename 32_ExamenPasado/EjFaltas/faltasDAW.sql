DROP DATABASE IF EXISTS FaltasDAW;

CREATE DATABASE FaltasDAW;

USE FaltasDAW;

CREATE TABLE IF NOT EXISTS Alumnos (
 NumAlumno  int NOT NULL AUTO_INCREMENT,
 NIA         VARCHAR(8),
 Nombre      VARCHAR(50),
 Edad        INT UNSIGNED,
 PRIMARY KEY (NumAlumno) );


INSERT INTO Alumnos (NIA, Nombre, Edad) VALUES ('12341234', 'Andrea García Ruiz', 17);
INSERT INTO Alumnos (NIA, Nombre, Edad) VALUES ('12345678', 'Luisa Bora Lima', 24);
INSERT INTO Alumnos (NIA, Nombre, Edad) VALUES ('11111111', 'Alberto Capelo Tazo', 18);
INSERT INTO Alumnos (NIA, Nombre, Edad) VALUES ('12121212', 'Carmen Tira Grande', 19);


CREATE TABLE IF NOT EXISTS Sesiones (
 IdSesion   VARCHAR(6) NOT NULL, /* MES+DIA+SESION */
 Modulo      VARCHAR (4),
 PRIMARY KEY (IdSesion) );

INSERT INTO Sesiones VALUES ('050710','IPE');
INSERT INTO Sesiones VALUES ('050711','PRG');
INSERT INTO Sesiones VALUES ('050712','PRG');
INSERT INTO Sesiones VALUES ('050713','PRG');
INSERT INTO Sesiones VALUES ('050808','PI');
INSERT INTO Sesiones VALUES ('050809','EDE');
INSERT INTO Sesiones VALUES ('050908','BDA');


CREATE TABLE IF NOT EXISTS Faltas  (
 NumAlumno     INT,
 IdSesion      VARCHAR(6), 
 Tipo           SMALLINT UNSIGNED, /* 1-Falta 2-Retraso */
 Just           BOOLEAN DEFAULT FALSE,
 PRIMARY KEY (NumAlumno,IdSesion),
 FOREIGN KEY (NumAlumno) REFERENCES Alumnos(NumAlumno),
 FOREIGN KEY (IdSesion) REFERENCES Sesiones(IdSesion) );
