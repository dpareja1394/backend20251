-- Insertar en Estados_Contrato
INSERT INTO Estados_Contrato (nombre, descripcion) VALUES 
('Activo', 'Contrato vigente'),
('Finalizado', 'Contrato finalizado'),
('Pendiente', 'Contrato en espera de aprobación');

-- Insertar en Tipos_Propiedad
INSERT INTO Tipos_Propiedad (nombre, descripcion) VALUES 
('Casa', 'Vivienda familiar'),
('Apartamento', 'Unidad residencial en edificio'),
('Oficina', 'Espacio comercial para trabajo');

-- Insertar en Estados_Propiedad
INSERT INTO Estados_Propiedad (nombre, descripcion) VALUES 
('Disponible', 'Propiedad disponible para venta o arrendamiento'),
('Vendido', 'Propiedad ya vendida'),
('Arrendada', 'Propiedad actualmente en arrendamiento');

-- Insertar en Personas (propietarios, clientes, arrendatarios, asesores)
INSERT INTO Personas (nombre, apellido, telefono, email, direccion, ciudad, codigo_postal) VALUES
('Juan', 'Pérez', '3001234567', 'juan.perez@gmail.com', 'Calle 123 #45-67', 'Bogotá', '110111'),
('Ana', 'García', '3117654321', 'ana.garcia@hotmail.com', 'Carrera 8 #23-45', 'Medellín', '050022'),
('Carlos', 'Martínez', '3019876543', 'carlos.martinez@yahoo.com', 'Av. 7 #56-78', 'Cali', '760012');

-- Insertar en Propiedades
INSERT INTO Propiedades (id_propietario, id_asesor, id_tipo_propiedad, id_estado_propiedad, direccion, ciudad, codigo_postal, metros_cuadrados, habitaciones, banos, precio, fecha_creacion) VALUES
(1, 3, 1, 1, 'Calle 45 #12-34', 'Bogotá', '110222', 150, 3, 2, 500000000, '2025-01-01'),
(2, 3, 2, 1, 'Carrera 12 #9-10', 'Medellín', '050033', 80, 2, 1, 300000000, '2025-01-10');

-- Insertar en Ventas_Propiedades
INSERT INTO Ventas_Propiedades (id_propiedad, id_cliente, id_asesor, fecha_venta, precio_venta, comision_asesor) VALUES
(1, 2, 3, '2025-02-01', 480000000, 24000000),
(2, 1, 3, '2025-02-15', 290000000, 14500000);

-- Insertar en Contratos_Arrendamiento
INSERT INTO Contratos_Arrendamiento (id_estado_contrato, id_propiedad, id_arrendatario, id_asesor, fecha_inicio, fecha_fin, renta_mensual, deposito) VALUES
(1, 1, 2, 3, '2025-03-01', '2026-03-01', 2000000, 4000000),
(2, 2, 1, 3, '2025-02-20', '2026-02-20', 1500000, 3000000);
