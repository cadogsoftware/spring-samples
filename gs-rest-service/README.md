# Sample Spring REST service
Taken from here https://spring.io/guides/gs/rest-service/#scratch

## Run like this:
./mvnw spring-boot:run

Alternatively, you can build the JAR file with ./mvnw clean package and then run the JAR file, as follows:

java -jar target/gs-rest-service-0.1.0.jar

## Test like this:
GET http://localhost:8080/greeting

or

GET http://localhost:8080/greeting?name=Rich

## Notes 1


