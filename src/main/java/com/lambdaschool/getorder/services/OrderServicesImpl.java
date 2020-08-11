package com.lambdaschool.getorder.services;


import com.lambdaschool.getorder.models.Order;
import com.lambdaschool.getorder.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "orderServices")
public class OrderServicesImpl implements OrderServices{

    @Autowired
    OrderRepository orderrepos;

    @Override
    public Order save(Order order) {
        return orderrepos.save(order);
    }
}
