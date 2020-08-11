package com.lambdaschool.getorder.services;


import com.lambdaschool.getorder.models.Customer;
import com.lambdaschool.getorder.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerServices")
public class CustomerServicesImpl implements CustomerServices {
    @Autowired
    CustomerRepository custrepos;

    @Override
    public Customer save(Customer customer) {
        return custrepos.save(customer);
    }
}
