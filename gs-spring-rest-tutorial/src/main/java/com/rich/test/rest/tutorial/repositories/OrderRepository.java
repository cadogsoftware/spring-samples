package com.rich.test.rest.tutorial.repositories;

import com.rich.test.rest.tutorial.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
