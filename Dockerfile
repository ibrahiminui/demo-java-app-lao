FROM openjdk:8-jre-alpine
LABEL maintainer="David Lee <theonlydavidlee@gmail.com>"
EXPOSE 8080
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
