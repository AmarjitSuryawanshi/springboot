FROM openjdk:8
ADD ./target/docker-0.0.1-SNAPSHOT.jar docker-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/docker-0.0.1-SNAPSHOT.jar"]