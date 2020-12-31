# Running a Spring Boot app as a Docker container

1. Build the app (so that a jar file is created in the target directory): ./mvnw clean package
2. Run this to build the docker image: docker build -t richtest/gs-spring-boot-docker . (you need the dot on the end here)
3. Run this to run the app: docker run -p 8080:8080 richtest/gs-spring-boot-docker 
4. Go to http://localhost:8080

## TODO:
