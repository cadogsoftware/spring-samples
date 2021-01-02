package com.rich.test.rest.tutorial.exceptions;

public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
