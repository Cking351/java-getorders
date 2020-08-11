package com.lambdaschool.getorder.repositories;


import com.lambdaschool.getorder.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
