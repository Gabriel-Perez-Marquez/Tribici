-- Insertar Estaciones
INSERT INTO estacion (capacidad, coordenadas, nombre, numero) VALUES (10, '37.3891,-5.9845', 'Plaza de Cuba', 1);
INSERT INTO estacion (capacidad, coordenadas, nombre, numero) VALUES (15, '37.3826,-6.0058', 'San Jacinto', 2);
INSERT INTO estacion (capacidad, coordenadas, nombre, numero) VALUES (20, '37.4000,-5.9900', 'Alameda de Hércules', 3);
INSERT INTO estacion (capacidad, coordenadas, nombre, numero) VALUES (5, '37.3700,-5.9700', 'Estadio Benito Villamarín', 4);

-- Insertar Usuarios
INSERT INTO usuario (nombre, num_tarjeta, pin, saldo) VALUES ('Juan Pérez', 123456, 1111, 25.50);
INSERT INTO usuario (nombre, num_tarjeta, pin, saldo) VALUES ('Ana López', 654321, 2222, 5.00);
INSERT INTO usuario (nombre, num_tarjeta, pin, saldo) VALUES ('Carlos Ruiz', 987654, 3333, 0.00);

-- Insertar Bicicletas
-- AHORA EL CAMPO ESTADO ES UN VARCHAR CON EL NOMBRE DEL ENUM
INSERT INTO bicicleta (estado, marca, modelo, estacion_id) VALUES ('LIBRE', 'Orbea', 'City 2023', 1);
INSERT INTO bicicleta (estado, marca, modelo, estacion_id) VALUES ('LIBRE', 'BH', 'Urban X', 1);
INSERT INTO bicicleta (estado, marca, modelo, estacion_id) VALUES ('OCUPADA', 'Decathlon', 'Elops', 2);
INSERT INTO bicicleta (estado, marca, modelo, estacion_id) VALUES ('ESTROPEADA', 'Xiaomi', 'Electric', 2);
INSERT INTO bicicleta (estado, marca, modelo, estacion_id) VALUES ('LIBRE', 'Trek', 'Commuter', 3);

-- Insertar Usos
INSERT INTO uso (coste, fecha_fin, fecha_inicio, bicicleta_id, estacion_id, usuario_id) VALUES (2.50, '2023-10-01', '2023-10-01', 1, 1, 1);
INSERT INTO uso (coste, fecha_fin, fecha_inicio, bicicleta_id, estacion_id, usuario_id) VALUES (5.00, '2023-10-02', '2023-10-02', 2, 2, 1);
INSERT INTO uso (coste, fecha_fin, fecha_inicio, bicicleta_id, estacion_id, usuario_id) VALUES (1.20, '2023-10-03', '2023-10-03', 3, 2, 2);