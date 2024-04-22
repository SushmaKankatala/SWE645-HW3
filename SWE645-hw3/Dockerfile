FROM openjdk:17
EXPOSE 8080
ADD /target/surveyJar.jar surveyJar.jar
ENTRYPOINT ["java","-jar","/surveyJar.jar"]