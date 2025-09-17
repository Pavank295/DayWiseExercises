package com.example.payment_ms.service;

import java.util.List;
import com.example.payment_ms.model.Payment;

public interface PaymentService {
    List<Payment> findAll();
    Payment findById(long id);
    Payment save(Payment payment);
    void deleteById(long id);
}
