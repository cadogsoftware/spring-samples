# Accessing data via REST
Taken from here https://spring.io/guides/gs/accessing-data-rest/

Note that code samples on the above page do not display properly, so get the code from here https://github.com/spring-guides/gs-accessing-data-rest

## Testing 

curl http://localhost:8080

curl http://localhost:8080/people

curl -i -H "Content-Type:application/json" -d '{"firstName": "Frodo", "lastName": "Baggins"}' http://localhost:8080/people

curl http://localhost:8080/people/search

curl http://localhost:8080/people/search/findByLastName?name=Baggins

curl -X PUT -H "Content-Type:application/json" -d '{"firstName": "Bilbo", "lastName": "Baggins"}' http://localhost:8080/people/1

curl -X PATCH -H "Content-Type:application/json" -d '{"firstName": "Bilbo Jr."}' http://localhost:8080/people/1

curl -X DELETE http://localhost:8080/people/1