#docker build -t itsa:latest .
FROM openjdk:8-jdk-alpine

WORKDIR /opt/app

COPY target/hellojenkins.jar hellojenkins.jar

EXPOSE 8090

ENTRYPOINT ["java","-jar","hellojenkins.jar"]
