FROM eclipse-temurin:17-jdk-alpine
COPY main-app/target/hrm.jar /hrm.jar
ENTRYPOINT ["java","-jar","/hrm.jar"]
EXPOSE 8080