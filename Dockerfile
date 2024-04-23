FROM openjdk:17
EXPOSE 8080
ADD /SWE645-hw3/target/surveyJar.jar surveyJar.jar
ENTRYPOINT ["java","-jar","/surveyJar.jar"]
