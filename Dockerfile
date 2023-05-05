FROM openjdk:17-jdk-alpine

# Copy your Java application into the container
COPY target/checkdata-0.0.1-SNAPSHOT.jar  /checkdata.jar

# Set up the entry point
ENTRYPOINT ["java", "-jar", "/checkdata.jar"]