package com.lambdaschool.getorder.services;


import com.lambdaschool.getorder.models.Payment;
import com.lambdaschool.getorder.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "paymentServices")
public class PaymentServicesImpl implements PaymentServices{
    @Autowired
    PaymentRepository paymentrepos;

    @Override
    public Payment save(Payment payment) {
        return paymentrepos.save(payment);
    }
}
