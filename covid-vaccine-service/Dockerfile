#stage 1
FROM maven:3.8.1-jdk-8 AS builder
RUN mkdir -p /app
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install

#stage 2
FROM openjdk:8-alpine
COPY --from=builder /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]