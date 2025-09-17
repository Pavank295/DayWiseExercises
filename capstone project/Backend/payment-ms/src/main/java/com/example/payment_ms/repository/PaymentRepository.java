package com.example.payment_ms.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.payment_ms.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}