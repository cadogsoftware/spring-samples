## TODO

- Annotations
- How to test
- Deploying
- Spring dev tools
- mvnw (do we need to clean first?)

## Guides TODO:

https://spring.io/guides/gs/messaging-rabbitmq/
https://spring.io/guides/gs/messaging-jms/

https://spring.io/guides/gs/batch-processing/
https://spring.io/guides/gs/managing-transactions/
https://spring.io/guides/gs/async-method/
https://spring.io/guides/gs/messaging-stomp-websocket/
https://spring.io/guides/gs/circuit-breaker/
https://spring.io/guides/gs/testing-restdocs/


## General Notes

Autowire or Constructor injection - Constructor is best practice. See here https://github.com/cadogsoftware/JavaSamples/blob/master/src/main/java/architecture/Spring.md

This code uses Spring @RestController annotation, which marks the class as a controller where every method returns a domain object instead of a view. It is shorthand for including both @Controller and @ResponseBody.

MockMvc comes from Spring Test and lets you, through a set of convenient builder classes, send HTTP requests into the DispatcherServlet and make assertions about the result. Note the use of @AutoConfigureMockMvc and @SpringBootTest to inject a MockMvc instance. Having used @SpringBootTest, we are asking for the whole application context to be created. An alternative would be to ask Spring Boot to create only the web layers of the context by using @WebMvcTest. In either case, Spring Boot automatically tries to locate the main application class of your application, but you can override it or narrow it down if you want to build something different.
(from https://spring.io/guides/gs/spring-boot/)

### mvnw
mvnw is a Spring Boot maven wrapper.
This can be used to run the Maven project without having Maven installed on your machine and present in the classpath. It downloads the correct Maven version if it’s not found (in your user home directory usually)

## Spring Boot and Spring versions
Spring Boot 2.0 builds on and requires Spring Framework version 5.
So, if you are using Spring Boot version 2.x then you are using version 5 of the Spring framework.

A Spring Boot project (that is a project using Spring Boot dependencies) does not have to explicitly set the individual Spring dependencies.
These dependencies are pulled by the Spring Boot core artifact that you declared. 
That is generally done via the spring-boot-starter-parent that you declare as the parent pom of your project.
And that is a great advantage of Spring Boot that relieves you from identifying and declaring dependencies that work finely together.
