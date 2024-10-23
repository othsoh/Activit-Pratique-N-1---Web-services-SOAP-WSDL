FROM maven:3.8.4-openjdk-11 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn -X dependency:go-offline

COPY src ./src
RUN mvn -X package

FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/*.jar ./app.jar
COPY --from=build /app/target/libs ./libs
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]