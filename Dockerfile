FROM amazoncorretto:11-alpine-jdk
COPY target/spring-webservice-k8s-0.0.1-SNAPSHOT.jar spring-webservice-k8s.jar
ENTRYPOINT ["java","-jar", "spring-webservice-k8s.jar"]