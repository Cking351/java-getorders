package com.lambdaschool.getorder.services;


import com.lambdaschool.getorder.models.Order;


public interface OrderServices {

    Order findOrderNumById(long ordernum);

    Order save(Order order);
}
