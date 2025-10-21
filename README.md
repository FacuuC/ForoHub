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

---

## ⚙️ Funcionalidades principales

- Registro y autenticación de usuarios mediante **JWT**.  
- Creación, actualización y eliminación de publicaciones.  
- Asociación de publicaciones a diferentes tópicos.  
- Persistencia en **PostgreSQL** con manejo de migraciones mediante **Flyway**.  
- Validaciones y manejo de excepciones personalizadas.  

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

## 🧑‍💻 Autor

**Facundo Costamagna**  
[LinkedIn](https://www.linkedin.com/in/facucostamagna)

