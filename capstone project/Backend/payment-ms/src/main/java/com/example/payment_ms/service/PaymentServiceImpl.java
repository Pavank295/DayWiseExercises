package com.example.payment_ms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.payment_ms.model.Payment;
import com.example.payment_ms.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository repo;

    @Override
    public List<Payment> findAll() {
        return repo.findAll();
    }

    @Override
    public Payment findById(long id) {
        Optional<Payment> paymentOpt = repo.findById(id);
        return paymentOpt.orElse(null);
    }

    @Override
    public Payment save(Payment payment) {
        return repo.save(payment);
    }

    @Override
    public void deleteById(long id) {
        repo.deleteById(id);
    }
}
