FROM openjdk:8-jdk-alpine
ADD target/spring-boot-microservice-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
CMD ["-jar", "/app.jar"]
VOLUME /var/lib/java-todo-list
EXPOSE 8080