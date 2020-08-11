package com.lambdaschool.getorder.services;


import com.lambdaschool.getorder.models.Customer;

import java.util.List;

public interface CustomerServices {

    List<Customer> findAllOrders();

    Customer findOrderById(long id);

    List<Customer> findByNameLike(String name);

    Customer save(Customer customer);
}
