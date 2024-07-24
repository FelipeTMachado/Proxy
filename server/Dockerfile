FROM eclipse-temurin:22-jdk-jammy

RUN apt update -y
RUN apt upgrade -y
RUN apt install -y maven


COPY src /app/src
COPY pom.xml /app

WORKDIR /app
RUN mvn clean install

EXPOSE 4000

CMD ["java", "-jar", "target/server-0.0.1-SNAPSHOT.jar"]
