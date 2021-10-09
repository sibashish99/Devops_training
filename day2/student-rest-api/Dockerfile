FROM java:8

WORKDIR /app
COPY . /app

EXPOSE 8080
ADD ./target/student-service-api.jar app.jar
ENTRYPOINT ["java","-jar","student-service-api.jar"]
