FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} satelliteAPI.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","/satelliteAPI.jar"]