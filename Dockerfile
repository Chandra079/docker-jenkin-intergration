FROM  openjdk:17-jdk-slim
EXPOSE 8089
ADD target/docker-jenkin-intergration.jar docker-jenkin-intergration
ENTRYPOINT ["java", "-jar","docker-jenkin-intergration"]