
#  API REST de Gestión de Productos - Spring Boot

##  Descripción del Proyecto
Este proyecto es una **API REST** desarrollada con **Spring Boot** que permite gestionar productos dentro de una base de datos.  
Incluye operaciones CRUD (crear, listar, actualizar y eliminar), y está documentada con **Swagger UI** para facilitar las pruebas.  

La aplicación implementa **validaciones**, manejo de errores personalizados y permite probar diferentes **profiles** (`dev`, `prod`) con configuraciones separadas.

---

##  Tecnologías Utilizadas
-  **Java 17**
-  **Spring Boot** (Web, Data JPA, Validation)
-  **H2 Database** (modo memoria)
-  **Maven** como gestor de dependencias
-  **Swagger / Springdoc OpenAPI** para documentación interactiva
-  **Lombok** (opcional, si se usa)
-  **Profiles** `dev` y `prod`

---

##  Instrucciones para Clonar y Ejecutar

```bash
# Clonar el repositorio
git clone https://github.com/usuario/nombre-del-repo.git

# Entrar al directorio del proyecto
cd nombre-del-repo

# Ejecutar en modo desarrollo
mvn spring-boot:run -Dspring-boot.run.profiles=dev

# O ejecutar en modo producción
mvn spring-boot:run -Dspring-boot.run.profiles=prod
⚠️ Si mvn no se reconoce, asegurate de tener configurada la variable de entorno MAVEN_HOME y agregado el bin al PATH.
```
🌐 Endpoints Principales
Método	Ruta	Descripción
GET	/productos	Lista todos los productos
GET	/productos/{id}	Busca un producto por su ID
GET	/productos/categoria/{categoria}	Lista productos por categoría
POST	/productos	Crea un nuevo producto
PUT	/productos/{id}	Actualiza un producto existente
DELETE	/productos/{id}	Elimina un producto

🧠 Acceso a Swagger UI
Una vez ejecutado el proyecto, abrir en el navegador:
👉 http://localhost:8080/swagger-ui/index.html

Si estás usando un perfil distinto, asegurate de revisar el puerto configurado en application-{profile}.properties.

💾 Acceso a la Consola H2
La base de datos H2 está disponible en:
👉 http://localhost:8080/h2-console

Datos de conexión por defecto:

yaml
Copiar código
Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password:


Capturas de Pantalla

producto exitoso:
<img width="1304" height="590" alt="image" src="https://github.com/user-attachments/assets/1bac752b-376f-4827-a0c3-035314d8abf7" />
<img width="1220" height="593" alt="image" src="https://github.com/user-attachments/assets/7e1cc843-ed8d-47d5-a9ae-369a9ce03e38" />
producto sin nombre:
<img width="1318" height="606" alt="image" src="https://github.com/user-attachments/assets/644a8c6a-6a8c-4698-8ce9-12af2b09ce5d" />
producto con precio negativo:
<img width="1299" height="553" alt="image" src="https://github.com/user-attachments/assets/bb6dd367-9acc-455f-b151-a8048bfa34e8" />
listado de productos:

<img width="1100" height="624" alt="image" src="https://github.com/user-attachments/assets/705af2b0-193d-4f6a-a174-e84d404fc500" />

listado de productos por categoria:
<img width="1066" height="494" alt="image" src="https://github.com/user-attachments/assets/ea80ea96-d3c3-41fc-80ff-291fa8ad1c52" />
busqueda por id exitoso:
<img width="1069" height="449" alt="image" src="https://github.com/user-attachments/assets/226947ed-e0f3-408d-8f95-16b4820d866a" />
busqueda por id erroneo:
<img width="1104" height="457" alt="image" src="https://github.com/user-attachments/assets/6543e984-3f2a-45c3-bfe9-4b264303cdf5" />

producto actualizado completo:
<img width="1113" height="566" alt="image" src="https://github.com/user-attachments/assets/eca085e5-6554-4f49-9ff1-12db837f2a9b" />
stock actualizado:
<img width="1064" height="477" alt="image" src="https://github.com/user-attachments/assets/c4bd61f9-9c3f-45c1-8a6e-ab4e41ce74c1" />
producto eliminado:
<img width="1078" height="348" alt="image" src="https://github.com/user-attachments/assets/2274b6d2-def6-443e-8ca8-1b74265b998a" />

producto elimnado intentando buscarlo nuevamente:
<img width="1066" height="452" alt="image" src="https://github.com/user-attachments/assets/90e39611-1ebd-4626-9008-d6a7ee0eec57" />

tablas persistidas en h2:
<img width="625" height="258" alt="image" src="https://github.com/user-attachments/assets/36ce71b1-853e-4e94-8156-32ae0bffd512" />


Durante el desarrollo de este proyecto aprendí a:

Configurar y ejecutar un proyecto Spring Boot con diferentes perfiles.

Documentar APIs REST usando Swagger.

Conectar y manipular bases de datos H2 con JPA.

Implementar validaciones y manejo de errores personalizados.

Utilizar herramientas modernas para facilitar pruebas y mantenimiento del backend.

👤 Autor
Nombre: Tomás Mastropietro
Legajo: (completar)




