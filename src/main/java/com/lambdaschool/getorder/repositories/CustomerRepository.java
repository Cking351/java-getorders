package com.lambdaschool.getorder.repositories;


import com.lambdaschool.getorder.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
