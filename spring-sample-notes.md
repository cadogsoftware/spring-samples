## TODO
Annotations
How to test
Deploying

## Guides TODO:


https://spring.io/guides/gs/validating-form-input/
https://spring.io/guides/gs/handling-form-submission/
https://spring.io/guides/gs/testing-web/

https://spring.io/guides/gs/messaging-rabbitmq/
https://spring.io/guides/gs/messaging-jms/

https://spring.io/guides/gs/accessing-data-jpa/
https://spring.io/guides/gs/accessing-data-mongodb/

https://spring.io/guides/gs/accessing-data-rest/
https://spring.io/guides/gs/accessing-mongodb-data-rest/

https://spring.io/guides/gs/batch-processing/
https://spring.io/guides/gs/managing-transactions/
https://spring.io/guides/gs/async-method/
https://spring.io/guides/gs/messaging-stomp-websocket/
https://spring.io/guides/gs/circuit-breaker/
https://spring.io/guides/gs/testing-restdocs/

Longer: https://spring.io/guides/topicals/spring-boot-docker/

Spring dev tools




## Notes
This code uses Spring @RestController annotation, which marks the class as a controller where every method returns a domain object instead of a view. It is shorthand for including both @Controller and @ResponseBody.

MockMvc comes from Spring Test and lets you, through a set of convenient builder classes, send HTTP requests into the DispatcherServlet and make assertions about the result. Note the use of @AutoConfigureMockMvc and @SpringBootTest to inject a MockMvc instance. Having used @SpringBootTest, we are asking for the whole application context to be created. An alternative would be to ask Spring Boot to create only the web layers of the context by using @WebMvcTest. In either case, Spring Boot automatically tries to locate the main application class of your application, but you can override it or narrow it down if you want to build something different.
(from https://spring.io/guides/gs/spring-boot/)

