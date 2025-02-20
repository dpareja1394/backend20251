-- Tabla id Estado Contrato
CREATE TABLE Estados_Contrato (
    id_estado_contrato SERIAL PRIMARY KEY,
    nombre VARCHAR (30) NOT NULL,
    descripcion VARCHAR (50)
);

-- Tabla id Tipo Propiedad
CREATE TABLE Tipos_Propiedad (
    id_tipo_propiedad SERIAL PRIMARY KEY,         
    nombre VARCHAR(30) NOT NULL,   
    descripcion VARCHAR(50)
);

-- Tabla id Propiedad
CREATE TABLE Estados_Propiedad (
    id_estado_propiedad SERIAL PRIMARY KEY,
    nombre VARCHAR(500) NOT NULL,
    descripcion VARCHAR(50) NOT NULL
);

--Tabla Personas (centralizada para Propietarios, Clientes, Arrendatarios y Asesores)
CREATE TABLE Personas (
    id_persona SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    telefono VARCHAR(15) NOT NULL,
    email VARCHAR(100),
    direccion VARCHAR(200),
    ciudad VARCHAR(100),
    codigo_postal VARCHAR(10)
);

-- Tabla Propiedades
CREATE TABLE Propiedades (
    id_propiedad SERIAL PRIMARY KEY,
    id_propietario INT REFERENCES Personas(id_persona), -- Referencia a Personas
    id_asesor INT REFERENCES Personas(id_persona), -- Referencia a Personas
    id_tipo_propiedad INT REFERENCES Tipos_Propiedad(id_tipo_propiedad),-- Referencia a Personas
    id_estado_propiedad INT REFERENCES Estados_Propiedad(id_estado_propiedad),-- Referencia a EstadoPropiedad
    direccion VARCHAR(200) NOT NULL,
    ciudad VARCHAR(100) NOT NULL,
    codigo_postal VARCHAR(10) NOT NULL,
    metros_cuadrados INT,
    habitaciones INT,
    banos INT,
    precio DECIMAL(12, 2),
    fecha_creacion DATE
);

-- Tabla Ventas Propiedades
CREATE TABLE Ventas_Propiedades (
    id_venta SERIAL PRIMARY KEY,
    id_propiedad INT REFERENCES Propiedades(id_propiedad),
    id_cliente INT REFERENCES Personas(id_persona), -- Referencia a Personas
    id_asesor INT REFERENCES Personas(id_persona), -- Referencia a Personas
    fecha_venta DATE,
    precio_venta DECIMAL(12, 2),
    comision_asesor DECIMAL(10, 2)
);

-- Tabla Contratos de Arrendamiento
CREATE TABLE Contratos_Arrendamiento (
    id_contrato_arrendamiento SERIAL PRIMARY KEY,
    id_estado_contrato INT REFERENCES Estados_Contrato(id_estado_contrato),
    id_propiedad INT REFERENCES Propiedades(id_propiedad),
    id_arrendatario INT REFERENCES Personas(id_persona), -- Referencia a Personas
    id_asesor INT REFERENCES Personas(id_persona), -- Referencia a Personas
    fecha_inicio DATE,
    fecha_fin DATE,
    renta_mensual DECIMAL(10, 2),
    deposito DECIMAL(10, 2)
);
