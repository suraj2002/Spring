# Stage 1: Build the Spring Boot application using Maven
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Create a lightweight image to run the app
FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=build /app/target/Lowercase-0.0.1-SNAPSHOT.jar Lowercase.jar

# Optional: Set the active Spring profile (e.g., dev or prod)
# ENV SPRING_PROFILES_ACTIVE=dev

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Lowercase.jar"]
