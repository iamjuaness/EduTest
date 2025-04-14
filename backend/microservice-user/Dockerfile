# Usa una imagen base de Java
FROM openjdk:17-jdk-slim

# Crea el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el jar del microservicio al contenedor
COPY target/microservice-user-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto del microservicio
EXPOSE 8890

# Comando para ejecutar el microservicio
ENTRYPOINT ["java", "-jar", "app.jar"]
