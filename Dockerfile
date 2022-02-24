FROM openjdk:11

COPY target/bamcoreport.jar /bamcoreport.jar
EXPOSE 8080
#ADD target/bamcoreport.jar /bamcoreport.jar
ENTRYPOINT ["java", "-jar", "/bamcoreport.jar"]
