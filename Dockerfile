FROM openjdk:11
WORKDIR /app

EXPOSE 8080
ADD target/bamcoreport.jar /bamcoreport.jar
ENTRYPOINT ["java", "-jar", "/bamcoreport.jar"]
