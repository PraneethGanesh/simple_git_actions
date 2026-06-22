FROM eclipse-temurin:21

WORKDIR /app

ARG JAR_FILE=target/simplegitaction.jar
COPY ${JAR_FILE} simplegitaction.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "simplegitaction.jar"]