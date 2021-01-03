# Accessing data REST with Mongo
Here the PersonRepository extends MongoRepository. With this in place, by default, 
Spring Boot tries to connect to a locally hosted instance of MongoDB. 
Read the reference docs for how to point your application to an instance of MongoDB that is hosted elsewhere.

## Running

### Start up mongo
mkdir /Users/rich/Technical/code/spring-samples/gs-spring-data-rest-mongo/mongodata
mongod --dbpath /Users/rich/Technical/code/spring-samples/gs-spring-data-rest-mongo/mongodata
(this dir needs to exist)

### Start the app as normal
./mvnw spring-boot:run

## Testing
curl http://localhost:8080
curl http://localhost:8080/people
curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"Frodo\",  \"lastName\" : \"Baggins\" }" http://localhost:8080/people




