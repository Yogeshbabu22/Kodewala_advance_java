#base image with jdk
FROM eclipse-temurin:21-jdk

#working dir inside container
WORKDIR /app

#copy jar file inside container
COPY target/Demo-Docker-Image-0.0.1-SNAPSHOT.jar app.jar

#expose port
EXPOSE 8089

#command to run app.jar
ENTRYPOINT ["java","-jar","app.jar"]

#instruction to create docker image