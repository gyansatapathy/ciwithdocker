FROM adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.0.1.13

MAINTAINER gyan.satapathy@yahoo.com

ARG JAR_FILE=build/libs/\*.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]