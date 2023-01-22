FROM eclipse-temurin:17-jdk-alpine
ADD target/villa1-0.0.1-SNAPSHOT.jar /usr/share/villa1.jar
ENTRYPOINT ["java", "-jar", "/usr/share/villa1.jar"]

EXPOSE 8080