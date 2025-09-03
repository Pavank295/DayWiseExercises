package com.example.payment_ms.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.example.payment_ms.dto.PaymentRequest;
import com.example.payment_ms.service.PaymentService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentEventListener {

    private final PaymentService service;

    @KafkaListener(topics = "T2", groupId = "payment-group")
    public void consumePaymentEvent(PaymentRequest request) {
        System.out.println("Received Payment Event: " + request);
        service.processPayment(request);
    }
}
