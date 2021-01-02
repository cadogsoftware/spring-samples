# Sample Spring REST service project

## To run
Using the Spring Boot built in maven wrapper:
```text
./mvnw spring-boot:run 
```

Using your own installed version of maven:
```text
mvn clean spring-boot:run
```

## Testing
curl -X GET localhost:8080/employees/1 | json_pp
curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'




