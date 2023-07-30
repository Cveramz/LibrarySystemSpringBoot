
INSERT INTO categoria (id_categoria,tipo) VALUES
    (1,'Ficción'),
    (2,'No ficción'),
    (3,'Ciencia ficción'),
    (4,'Misterio'),
    (5,'Romance'),
    (6,'Fantasía'),
    (7,'Aventura'),
    (8,'Misterio');

INSERT INTO medio_pago (id_mediopago, medio_pago) VALUES
    (1,'Tarjeta de crédito'),
    (2,'PayPal'),
    (3,'Transferencia'),
    (4,'Tarjeta de débito'),
    (5,'Tarjeta pregago'),
    (6,'Tarjetas de comercio');

INSERT INTO privilegio (id_privilegio, nombre_privilegio) VALUES
    (1, 'publicar_libro'),
    (2, 'eliminar_usuario'),
    (3, 'eliminar_libro'),
    (4, 'valorizar_libro'),
    (5, 'agregar_usuario'),
    (6, 'eliminar_comentario'),
    (7, 'eliminar_valoracion'),
    (8, 'editar_comentario'),
    (9, 'editar_valoracion'),
    (10, 'cancelar_compra'),
    (11, 'realizar_compra');

INSERT INTO usuario (id_usuario,fecha_nacimiento, nombre, apellido, contraseña, email) VALUES
    (1, '1990-01-15', 'Juan', 'Pérez', 'contraseña1', 'juan.perez@gmail.com'),
    (2, '1985-04-23', 'María', 'González', 'contraseña2', 'maria.gonzalez@hotmail.com'),
    (3, '1993-11-08', 'Carlos', 'Sánchez', 'contraseña3', 'carlos.sanchez@outlook.com'),
    (4, '1988-07-02', 'Ana', 'Martínez', 'contraseña4', 'ana.martinez@gmail.com'),
    (5, '1979-12-30', 'Pedro', 'López', 'contraseña5', 'pedro.lopez@hotmail.com'),
    (6, '1996-09-18', 'Laura', 'Ramírez', 'contraseña6', 'laura.ramirez@outlook.com'),
    (7, '1983-03-25', 'Miguel', 'Torres', 'contraseña7', 'miguel.torres@gmail.com'),
    (8, '1992-06-10', 'Sofía', 'Hernández', 'contraseña8', 'sofia.hernandez@hotmail.com'),
    (9, '1975-08-12', 'Jorge', 'Díaz', 'contraseña9', 'jorge.diaz@outlook.com'),
    (10, '1998-02-28', 'Isabel', 'Gómez', 'contraseña10', 'isabel.gomez@gmail.com');

INSERT INTO libro (isbn, id_usuario, nombre, visualizaciones, valoracion_prom, link_referencia, precio, int_stock) VALUES
    (9788498389364, 2, 'Cien años de soledad', 2000, 4, 'https://ejemplo.com/libro1', 53990, 10),
    (9788408164518, 3, 'El código Da Vinci', 1500, 4, 'https://ejemplo.com/libro2', 9990, 20),
    (9788466343159, 2, 'Harry Potter y la piedra filosofal', 3000, 5, 'https://ejemplo.com/libro3', 479990, 3),
    (9788467328573, 2, 'El principito', 1000, 5, 'https://ejemplo.com/libro4', 40000, 4),
    (9789876124382, 2, 'Historia del tiempo', 800, 4, 'https://ejemplo.com/libro5', 19990, 5),
    (9789870424595, 3, 'Orgullo y prejuicio', 2500, 5, 'https://ejemplo.com/libro6', 40990, 6),
    (9788401337933, 2, 'El señor de los anillos', 3500, 5, 'https://ejemplo.com/libro7', 70000, 10),
    (9789505562589, 3, 'Cien años de soledad', 1800, 3, 'https://ejemplo.com/libro8', 100000, 1),
    (9789875802643, 3, 'La sombra del viento', 2200, 5, 'https://ejemplo.com/libro9', 10000, 10),
    (9789505470656, 2, '1984', 1200, 4, 'https://ejemplo.com/libro10', 20000, 12);

INSERT INTO valoracion (valor, id_usuario, isbn) VALUES
    (5, 6, 9788498389364),
    (4, 7, 9788498389364),
    (4, 4, 9788408164518),
    (5, 7, 9788408164518),
    (5, 5, 9788466343159),
    (3, 9, 9788466343159),
    (4, 7, 9788467328573),
    (5, 8, 9788467328573),
    (3, 5, 9789876124382),
    (4, 8, 9789876124382);

INSERT INTO compra (n_transaccion,id_mediopago, total_pago, fecha) VALUES
            (0083, 1,10000, '2000-07-28'),
			(0343,2,40000,'2011-06-20'),
			(8976,3,20000,'2020-05-05'),
			(2089,4,19990,'2013-07-16'),
			(3000,2,70000,'2014-10-21'),
			(4780,2,9990,'2016-11-08'),
			(1000,3,100000,'2023-07-15'),
			(1030,2,40990,'2012-01-29'),
			(5483,3,53990,'2017-02-28'),
			(7078,3,479990,'2019,10-30');

INSERT INTO carro (id_carro, n_transaccion, id_usuario, precio_total, cantidad, bool_stock) VALUES
            (7933, 5483, 10, 53990,1, true),
			(5484, 4780, 4, 9990,1, true),
			(3289, 7078, 4, 479990,1, true),
			(0932, 0343, 5,40000,1, true),
			(1238, 2089, 5, 19990,1, true),
			(4028, 3000, 6, 70000,1, true),
			(9370, 1000, 7, 100000,1, true),
			(8932, 1030, 8, 40990,1, true),
			(2840, 0083, 9, 10000,1, true),
			(6830, 8976, 10, 20000,1, true);

INSERT INTO carro_libro (id_carro_libro, isbn, id_carro) VALUES
    (001, 9788498389364, 7933),
    (002, 9788408164518, 5484),
    (003, 9788466343159, 3289),
    (004, 9788467328573, 0932),
    (005, 9789876124382, 1238),
    (006, 9788401337933, 4028),
    (007, 9789505562589, 9370),
    (008, 9789870424595, 8932),
    (009, 9789875802643, 2840),
    (010, 9789505470656, 6830);


INSERT INTO libro_categoria (isbn, id_categoria) VALUES
    (9788498389364, 1), 
    (9788408164518, 2),
    (9788466343159, 6),
    (9788467328573, 1),
    (9789876124382, 3),
    (9788401337933, 6),
    (9789505562589, 1),
    (9789875802643, 4),
    (9789505470656, 3),
    (9789870424595, 5);

INSERT INTO ubicacion (id_ubicacion, isbn, pais_origen) VALUES
    (1, 9788498389364, 'Colombia'),
    (2, 9788408164518, 'Estados Unidos'),
    (3, 9788466343159, 'Reino Unido'),
    (4, 9788467328573, 'Francia'),
    (5, 9789876124382, 'Estados Unidos'),
    (6, 9788401337933, 'Nueva Zelanda'),
    (7, 9789505562589, 'Argentina'),
    (8, 9789875802643, 'España'),
    (9, 9789505470656, 'Reino Unido'),
    (10, 9789870424595, 'Italia');
	
INSERT INTO usuario_libro_favorito (id_libro_fav, id_usuario, isbn) VALUES
    (1, 5, 9788498389364),
    (2, 7, 9788408164518),
    (3, 4, 9788466343159),
    (4, 9, 9788467328573),
    (5, 4, 9789876124382),
    (6, 5, 9788401337933),
    (7, 6, 9789505562589),
    (8, 7, 9789875802643),
    (9, 8, 9789505470656),
    (10, 9, 9789870424595);

INSERT INTO restriccion (id_restriccion, edad, isbn) VALUES
    (1, 'Todo publico', 9788498389364),
    (2, 'Mayor de 14', 9788408164518),
    (3, 'Mayor de 18', 9788466343159),
    (4,'Mayor de 18', 9788467328573),
    (5,'Mayor de 14', 9789876124382),
    (6,'Mayor de 14', 9788401337933),
    (7,'Todo publico', 9789505562589),
    (8,'Todo publico', 9789875802643),
    (9,'Mayor de 14', 9789505470656),
    (10,'Mayor de 14', 9789870424595);

INSERT INTO rol (id_rol, id_usuario, nombre) VALUES
    (1, 1, 'Administrador'),
    (2, 2, 'Autor'),
    (3, 3, 'Autor'),
    (4,4, 'Lector'),
    (5,5, 'Lector'),
    (6,6, 'Lector'),
    (7,7, 'Lector'),
    (8,8, 'Lector'),
    (9,9, 'Lector'),
    (10,10,'Lector');   

INSERT INTO rol_privilegio(id_rol_privilegio, id_rol, id_privilegio) VALUES
    (1, 1, 2),
    (2, 1, 3),
    (3, 1, 5),
    (4, 1, 6),
    (5, 1, 7),
    (6, 2, 1),
    (7, 2, 8),
    (8, 3, 4),
    (9, 3, 6),
    (10, 3, 7),
    (11, 3, 8),
    (12, 3, 9),
    (13, 3, 10),
    (14, 3, 11);