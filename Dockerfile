FROM openjdk:17-jdk-alpine
MAINTAINER mahesh
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
