FROM adoptopenjdk/openjdk11:jdk-11.0.11_9-alpine
COPY saludo-service.jar saludo-service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/saludo-service.jar"]