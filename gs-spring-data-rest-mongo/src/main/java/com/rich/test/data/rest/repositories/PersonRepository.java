package com.rich.test.data.rest.repositories;

import java.util.List;

import com.rich.test.data.rest.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people") // Only required so that I can change the path from /persons to /people
public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findByLastName(@Param("name") String name);

    //By default, Spring Boot tries to connect to a locally hosted instance of MongoDB. Read the reference docs for how to point your application to an instance of MongoDB that is hosted elsewhere.

}
