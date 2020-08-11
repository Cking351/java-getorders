package com.lambdaschool.getorder.repositories;


import com.lambdaschool.getorder.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
