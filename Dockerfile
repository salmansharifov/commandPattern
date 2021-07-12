FROM openjdk:8-alpine
MAINTAINER salman
COPY out/artifacts/test/test.jar /app.jar
CMD["java", "-jar", "/app.jar"]