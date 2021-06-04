#stage 1
FROM maven:3.8.1-jdk-11 AS builder
RUN mkdir -p /app
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install -DskipTests=true

#stage 2
FROM adoptopenjdk/openjdk11:alpine
COPY --from=builder /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]