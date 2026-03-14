# Base image with JDK
FROM eclipse-temurin:21-jdk

# Working directory inside container
WORKDIR /app

# Copy the correct jar file built by Maven
COPY target/springboot-transaction-transient-0.0.1-SNAPSHOT.jar app.jar

# Expose port (same as your Spring Boot app)
EXPOSE 8089

# Command to run app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]