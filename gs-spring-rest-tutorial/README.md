# Sample Spring REST service project
Based on this https://spring.io/guides/tutorials/rest/

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
curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"firstName": "Samwise Gamgee", "role": "gardener"}'

curl -X GET localhost:8080/orders | json_pp 
curl -X GET localhost:8080/orders/4 | json_pp
curl -v -X DELETE http://localhost:8080/orders/4/cancel



