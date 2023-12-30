FROM openjdk:17-slim-bullseye

ARG VERSION=0.0.1-SNAPSHOT

WORKDIR /app/

COPY target/exam-${VERSION}.jar /app/application.jar

CMD java -jar /app/application.jar
