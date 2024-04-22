
FROM openjdk:11
EXPOSE 8080
ADD target/sb-student-docker.war sb-student-docker.war
ENTRYPOINT ["java", "-jar", "sb-student-docker.war"]