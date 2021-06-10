FROM openjdk:11-jdk-alpine

MAINTAINER gyan.satapathy@yahoo.com

ARG JAR_FILE=build/libs/\*.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8122

ENTRYPOINT ["java","-jar","/app.jar"]