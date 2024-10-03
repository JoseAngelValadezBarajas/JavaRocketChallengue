Documentación del Proyecto<br>
Mi Examen<br>
Este proyecto es una aplicación web desarrollada en Java utilizando Spring Boot y Thymeleaf, que permite gestionar tareas. Los usuarios pueden registrar nuevas tareas y ver una lista de todas las tareas registradas.<br>
<br>
Requisitos<br>
JDK 8 o superior<br>
Maven<br>
MariaDB o MySQL<br>
<br>
Instalación<br>
Clona el repositorio:<br>
git clone <URL_DEL_REPOSITORIO><br>
cd mi_examen<br>
<br>
Configura la base de datos:<br>
Asegúrate de tener MariaDB o MySQL instalado. Crea una base de datos llamada java.<br>
CREATE DATABASE java;<br>
Luego, crea la tabla tareas en la base de datos java con la siguiente consulta SQL:<br>
CREATE TABLE tareas (<br>
    id INT AUTO_INCREMENT PRIMARY KEY,<br>
    nombre VARCHAR(255) NOT NULL,<br>
    descripcion TEXT NOT NULL,<br>
    fechainicio VARCHAR(10) NOT NULL<br>
);<br>
<br>
Configura el archivo application.properties:<br>
Abre src/main/resources/application.properties y configura la conexión a tu base de datos:<br>
<br>
spring.datasource.url=<br>
spring.datasource.username=<br>
spring.datasource.password=<br>
spring.jpa.hibernate.ddl-auto=update<br>
spring.jpa.show-sql=true<br>
<br>
Compila y ejecuta la aplicación:<br>
Usa Maven para compilar y ejecutar la aplicación:<br>
mvn clean install<br>
mvn spring-boot:run<br>
La aplicación se ejecutará en http://localhost:8081.<br>
<br>
Uso<br>
Accede a la aplicación a través de tu navegador en http://localhost:8081.<br>
Para registrar una nueva tarea, haz clic en "Registrar Tarea".<br>
Para ver el listado de tareas, haz clic en "Ver Listado de Tareas".<br>
<br>
<br>
Contribuciones<br>
Si deseas contribuir, por favor realiza un fork del repositorio, crea una nueva rama para tu característica y abre un pull request.<br>
<br>
Licencia<br>
Este proyecto está bajo la Licencia MIT.<br>
<br>
Notas Adicionales<br>
Asegúrate de tener los controladores de MariaDB para Java en tu archivo pom.xml. Puedes agregar la siguiente dependencia:<br>
<dependency><br>
    <groupId>org.mariadb.jdbc</groupId><br>
    <artifactId>mariadb-java-client</artifactId><br>
    <version>3.1.0</version><br>
</dependency><br>
