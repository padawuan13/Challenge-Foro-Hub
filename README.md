🚀 ForoHub API - Challenge Alura
¡Bienvenido a ForoHub! Esta es una API REST desarrollada en Java con Spring Boot para gestionar un foro de discusión. El proyecto permite realizar un CRUD completo de tópicos, con un sistema de seguridad basado en Tokens JWT y documentación interactiva.

🛠️ Tecnologías Utilizadas
Java 17 (o superior).

Spring Boot 3.4+.

Spring Security (Autenticación y Autorización).

JWT (JSON Web Token) para seguridad.

Spring Data JPA con Hibernate.

MySQL como base de datos.

Flyway para migraciones de base de datos.

SpringDoc OpenAPI (Swagger) para documentación.

Maven como gestor de dependencias.

🔐 Seguridad y Autenticación
La API utiliza un sistema de autenticación Stateless.

Login: El usuario se autentica en /login enviando sus credenciales (email y contraseña con hash BCrypt).

Token: El servidor devuelve un Token JWT.

Autorización: Para acceder a los recursos de /topicos, se debe enviar el token en el encabezado de la petición:
Authorization: Bearer <tu_token_aqui>

📖 Documentación de la API
Una vez que el proyecto esté corriendo, puedes acceder a la documentación interactiva y probar los endpoints directamente en el navegador:

📍 Swagger UI: http://localhost:8080/swagger-ui.html

🚀 Funcionalidades (CRUD)
Listado de Tópicos: Con paginación (10 por página) y ordenados por fecha.

Registro: Validación de campos obligatorios.

Detalle: Ver información completa de un tópico específico.

Actualización: Modificar título o mensaje de un tópico existente.

Eliminado: Borrado lógico o físico de la base de datos.

⚙️ Cómo ejecutar el proyecto
Clona este repositorio.

Configura tu base de datos MySQL en el archivo src/main/resources/application.properties.

Ejecuta las migraciones de Flyway o asegúrate de que las tablas estén creadas.

Corre la aplicación desde tu IDE (IntelliJ recomendado) o usando ./mvnw spring-boot:run.

Usa Insomnia o Swagger para realizar las pruebas.

👨‍💻 Autor
Felipe Hernández
Analista Programador - Iplacex
Desarrollador Java en formación - Programa Oracle Next Education (ONE)
