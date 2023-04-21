# Use a Maven base image
FROM maven:3.8.4-openjdk-8-slim

# Set the working directory
WORKDIR /app

# Install AWS SDK for Java
RUN apt-get update

# Copy the Maven build script and pom.xml into the container
COPY pom.xml /app
COPY src /app/src

# Use Maven to install dependencies
RUN mvn dependency:resolve