CREATE DATABASE librarySystem
USE librarySystem

-- Tabla Categoria
CREATE TABLE categoria (
    id_categoria SERIAL PRIMARY KEY,
    tipo VARCHAR(50)
);

-- Tabla Medio_pago
CREATE TABLE medio_pago (
    id_mediopago SERIAL PRIMARY KEY,
    medio_pago VARCHAR(50)
);

-- Tabla Privilegio
CREATE TABLE privilegio (
    id_privilegio SERIAL PRIMARY KEY,
    nombre_privilegio VARCHAR(50)
);

-- Tabla Usuario
CREATE TABLE usuario (
    id_usuario SERIAL PRIMARY KEY,
    fecha_nacimiento DATE,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    contraseña VARCHAR(50),
    email VARCHAR(50)
);

-- Tabla Libro
CREATE TABLE libro (
    isbn BIGINT PRIMARY KEY,
    id_usuario BIGINT REFERENCES usuario (id_usuario),
    nombre VARCHAR(50),
    visualizaciones INT,
    valoracion_prom INT,
    link_referencia VARCHAR(50),
    precio INT,
    int_stock INT
);

-- Tabla Valoracion
CREATE TABLE valoracion (
    id_valoracion SERIAL PRIMARY KEY,
    valor INT,
    id_usuario BIGINT REFERENCES usuario (id_usuario),
    isbn BIGINT REFERENCES libro (isbn)
);

-- Tabla Compra
CREATE TABLE compra (
    n_transaccion SERIAL PRIMARY KEY,
    id_mediopago BIGINT REFERENCES medio_pago (id_mediopago),
    total_pago INT,
    fecha DATE
);

-- Tabla Usuario_libro_favorito
CREATE TABLE usuario_libro_favorito (
    id_libro_fav SERIAL PRIMARY KEY,
    id_usuario BIGINT REFERENCES usuario (id_usuario),
    isbn BIGINT REFERENCES libro (isbn)
);

-- Tabla Restricción
CREATE TABLE restriccion (
    id_restriccion SERIAL PRIMARY KEY,
    edad VARCHAR(50),
    isbn BIGINT REFERENCES libro (isbn)
);

-- Tabla Rol
CREATE TABLE rol (
    id_rol SERIAL PRIMARY KEY,
    id_usuario BIGINT REFERENCES usuario (id_usuario),
    nombre VARCHAR(50)
);

-- Tabla Rol_privilegio
CREATE TABLE rol_privilegio (
    id_rol_privilegio SERIAL PRIMARY KEY,
    id_rol BIGINT REFERENCES rol (id_rol),
    id_privilegio BIGINT REFERENCES privilegio (id_privilegio)
);

-- Tabla Carro
CREATE TABLE carro (
    id_carro SERIAL PRIMARY KEY,
    n_transaccion BIGINT REFERENCES compra (n_transaccion),
    id_usuario BIGINT REFERENCES usuario (id_usuario),
    precio_total INT,
    cantidad INT,
    bool_stock BOOLEAN
);

-- Tabla Carro_libro
CREATE TABLE carro_libro (
    id_carro_libro SERIAL PRIMARY KEY,
    isbn BIGINT REFERENCES libro (isbn),
    id_carro BIGINT REFERENCES carro (id_carro)
);

-- Tabla Libro_categoria
CREATE TABLE libro_categoria (
    id_libro_categoria SERIAL PRIMARY KEY,
    isbn BIGINT REFERENCES libro (isbn),
    id_categoria BIGINT REFERENCES categoria (id_categoria)
);

-- Tabla Ubicación
CREATE TABLE ubicacion (
    id_ubicacion SERIAL PRIMARY KEY,
    isbn BIGINT REFERENCES libro (isbn),
    pais_origen VARCHAR(50)
);

