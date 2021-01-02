package com.rich.test.rest.tutorial.domain;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import com.rich.test.rest.tutorial.controllers.EmployeeController;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {

    /**
     * Converts Employee objects to EntityModel<Employee> objects. Used in HATEAOS
     * @param employee
     * @return
     */
    @Override
    public EntityModel<Employee> toModel(Employee employee) {

        return EntityModel.of(employee, //
                linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
                linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
    }
}
