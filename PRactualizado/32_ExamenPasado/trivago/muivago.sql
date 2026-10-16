DROP DATABASE IF EXISTS muivago;

CREATE DATABASE muivago;

USE muivago;

CREATE TABLE IF NOT EXISTS Hotel (
 codhotel   INT NOT NULL AUTO_INCREMENT,
 nhotel     VARCHAR(20),
 ciudad     VARCHAR(100),
 pais       VARCHAR(100),
 estrellas  INT CHECK (estrellas BETWEEN 1 AND 5),
 PRIMARY KEY (codhotel)
);

INSERT INTO Hotel (nhotel) VALUES ('El Pueblin');
INSERT INTO Hotel (nhotel) VALUES ('La Raposera');
INSERT INTO Hotel (nhotel) VALUES ('Brillante');
INSERT INTO Hotel (nhotel) VALUES ('3 Cabos');
INSERT INTO Hotel (nhotel) VALUES ('La Sobreisla');
INSERT INTO Hotel (nhotel) VALUES ('El Rosal');
INSERT INTO Hotel (nhotel) VALUES ('Villa del Marqués');

CREATE TABLE IF NOT EXISTS Agencia (
 codagencia   INT NOT NULL AUTO_INCREMENT,
 nagencia     VARCHAR(50),
 telefono     VARCHAR(20),
 email        VARCHAR(100),
 PRIMARY KEY (codagencia)
);

INSERT INTO Agencia (nagencia) VALUES ('Viajes El Corte Ingles');
INSERT INTO Agencia (nagencia) VALUES ('booking');
INSERT INTO Agencia (nagencia) VALUES ('eDreams');
INSERT INTO Agencia (nagencia) VALUES ('NH Hotels');
INSERT INTO Agencia (nagencia) VALUES ('Trip.com');
INSERT INTO Agencia (nagencia) VALUES ('Prestigia');
INSERT INTO Agencia (nagencia) VALUES ('SkyDreams');

CREATE TABLE IF NOT EXISTS Ofertas (
 codoferta INT AUTO_INCREMENT,
 codhotel    int,
 codagencia  int, 
 precio      int NOT NULL,
 PRIMARY KEY (codoferta),
 FOREIGN KEY (codhotel) REFERENCES Hotel (codhotel),
 FOREIGN KEY (codagencia) REFERENCES Agencia (codagencia)
);

INSERT INTO Ofertas (codhotel, codagencia, precio) VALUES (1, 1, 120);
INSERT INTO Ofertas (codhotel, codagencia, precio) VALUES (1, 2, 108);
INSERT INTO Ofertas (codhotel, codagencia, precio) VALUES (1, 3, 131);
INSERT INTO Ofertas (codhotel, codagencia, precio) VALUES (1, 4, 110);
INSERT INTO Ofertas (codhotel, codagencia, precio) VALUES (2, 3, 100);
INSERT INTO Ofertas (codhotel, codagencia,1 precio) VALUES (2, 4, 99);
INSERT INTO Ofertas (codhotel, codagencia, precio) VALUES (2, 6, 104);
INSERT INTO Ofertas (codhotel, codagencia, precio) VALUES (2, 7, 99);
