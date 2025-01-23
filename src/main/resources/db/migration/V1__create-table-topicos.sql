CREATE TABLE topicos (
    id SERIAL PRIMARY KEY,

    titulo VARCHAR(255) NOT NULL,
    mensaje TEXT NOT NULL,
    nombreCurso VARCHAR(255) NOT NULL,
    status VARCHAR(255) NOT NULL,
    fecha_creacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    id_usuario BIGINT NOT NULL,
    
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
);