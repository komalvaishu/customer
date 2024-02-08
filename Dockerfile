FROM openjdk:8
EXPOSE 9797
ADD target/spring-boot-docker
ENTRYPOINT["java","jar,"/spring-boot-docker.jar"]