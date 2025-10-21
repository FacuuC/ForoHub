# 🧠 Forohub

**Forohub** es una aplicación backend desarrollada en **Java con Spring Boot**, que permite gestionar publicaciones en un foro.  
Los usuarios pueden registrarse, autenticarse y crear publicaciones asociadas a diferentes tópicos.

---

## 🚀 Tecnologías utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Security (JWT)**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **Postman**
- **Git / GitHub**

---

## ⚙️ Estructura y funcionalidades principales

🔐 Autenticación:
-Endpoint /login para validar credenciales.
-Generación de tokens JWT para acceso autenticado.
-Manejo de errores y respuestas personalizadas.

👤 Usuarios:
-Registro de nuevos usuarios mediante /usuarios.
-Cifrado de contraseñas con PasswordEncoder.
-Validación de duplicados por email.

💬 Tópicos:
-Creación, listado, actualización y eliminación (CRUD) de tópicos.
-Asociación de cada tópico con un usuario existente.
-Validación de integridad y uso de DTOs (DatosRegistroTopico, DatosRespuestaTopico, etc.).

---

## 🧩 Endpoints principales

| Método | Endpoint                | Descripción                            | Autenticación |
|:-------:|:------------------------|:---------------------------------------|:--------------|
| `POST` | `/auth/register`        | Registra un nuevo usuario              | No            |
| `POST` | `/auth/login`           | Inicia sesión y genera un token JWT    | No            |
| `GET`  | `/topics`               | Lista los tópicos disponibles          | Sí            |
| `POST` | `/posts`                | Crea una nueva publicación             | Sí            |
| `GET`  | `/posts/{id}`           | Obtiene una publicación específica     | Sí            |
| `PUT`  | `/posts/{id}`           | Actualiza una publicación existente    | Sí            |
| `DELETE` | `/posts/{id}`         | Elimina una publicación                | Sí            |

---

## 🧠 Aprendizajes y objetivos

-Implementación de autenticación JWT con Spring Security.
-Uso de JPA/Hibernate para persistencia de datos.
-Manejo de relaciones entre entidades (Usuario–Tópico).
-Práctica de principios REST y estructura modular en Spring Boot.
-Validaciones, excepciones personalizadas y pruebas con Postman.

## 🧑‍💻 Autor

**Facundo Costamagna**  
[Gmail] costamagnafacundo@gmail.com
[LinkedIn](https://www.linkedin.com/in/facucostamagna)

