FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} satelliteAPI.jar
ENTRYPOINT ["java","-jar","/satelliteAPI.jar"]