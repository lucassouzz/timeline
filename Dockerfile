#
# Build stage
#
FROM maven:3.8.4-openjdk-17-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM eclipse-temurin:17-jre-alpine
COPY --from=build /home/app/target/timeline-0.0.1-SNAPSHOT.jar /usr/local/lib/timeline.jar
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.profiles.active=railway","-jar","/usr/local/lib/timeline.jar"]