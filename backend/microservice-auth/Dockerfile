FROM openjdk:17
WORKDIR /app
COPY target/microservice-auth.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]