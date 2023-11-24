# Use an official OpenJDK runtime as a base image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file into the container at the working directory
COPY target/request-handler-0.0.1-SNAPSHOT.jar /app/request-handler-0.0.1-SNAPSHOT.jar

# Expose the port that your application will run on
EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "request-handler-0.0.1-SNAPSHOT.jar"]
