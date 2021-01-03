package com.rich.test.data.rest.repository;

import com.rich.test.data.rest.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people") // The only reason that this annotation has been added is to change the default path of /persons to /people
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> { // could extend CrudRepository or JpaRepository here.

    List<Person> findByLastName(@Param("name") String name);

}
