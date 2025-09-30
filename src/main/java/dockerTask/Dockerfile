FROM openjdk:21-jdk-slim

WORKDIR /app

COPY ../../../target/otp1-tasks-1.0-SNAPSHOT.jar /app/app.jar

CMD ["java", "-cp", "app.jar", "dockerTask.TemperatureConverter"]