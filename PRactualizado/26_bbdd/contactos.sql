DROP DATABASE IF EXISTS contactos;

CREATE DATABASE contactos;

USE contactos;

DROP TABLE IF EXISTS contacto;

CREATE TABLE contacto(
	DNI VARCHAR(9) PRIMARY KEY NOT NULL,
    NOMBRE VARCHAR (255) NOT NULL,
    EDAD INT
    );

INSERT INTO contactos.contacto (DNI, NOMBRE, EDAD)
VALUES
    ('00371569G', 'Beatriz García Martín', 32),

    ('00445760C', 'Sandra Flores Jorge', 17),

    ('00740365H', 'Carlos López Carvajal', 24),

    ('02748375J', 'Vanessa Rodríguez Recio', 37),

    ('03549358K', 'Ismael Pazos Rincón', 53),

    ('07385709H', 'Esther Zamora Castillo', 12);


/*
INSERT INTO contactos.contacto (DNI, NOMBRE, EDAD) VALUES ('07834658F', 'Alberto Velez Rodrigo', 51);

INSERT INTO 'contactos'.'contacto' ('DNI', 'NOMBRE', 'DIRECCION', 'POBLACION', 'CP', 'PROVINCIA', 'TELEFONO', 'MOVIL', 'EMAIL', 'FECHA_NAC', 'TIPO') VALUES ('08785691J', 'Mariano Dorado Serrano', 'C/ Fuencaliente, 1', 'Valencia', 46023, 'Valencia', '963564495', '630838922', 'mardorser@hotmail.com', '1962-12-30', 2);

INSERT INTO 'contactos'.'contacto' ('DNI', 'NOMBRE', 'DIRECCION', 'POBLACION', 'CP', 'PROVINCIA', 'TELEFONO', 'MOVIL', 'EMAIL', 'FECHA_NAC', 'TIPO') VALUES ('09856064N', 'Ana Rodríguez Alonso', 'Avda. Gregrio Gea, 59', 'Mislata', 46920, 'Valencia', '963591236', '640071296', 'anarodalo@hotmail.com', '2001-01-19', 1);
*/
