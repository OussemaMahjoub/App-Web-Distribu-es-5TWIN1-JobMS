FROM java:8
EXPOSE 8180
ADD /target/Job-0.0.1-SNAPSHOT.jar job.jar
ENTRYPOINT ["java", "-jar", "job.jar"]