package com.example.payment_ms.service;

import com.example.payment_ms.dto.PaymentRequest;
import com.example.payment_ms.dto.PaymentResponse;

public interface PaymentService {
    PaymentResponse processPayment(PaymentRequest request);
}
