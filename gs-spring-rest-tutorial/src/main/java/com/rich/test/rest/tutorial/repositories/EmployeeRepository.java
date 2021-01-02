package com.rich.test.rest.tutorial.repositories;

import com.rich.test.rest.tutorial.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
