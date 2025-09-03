package com.example.payment_ms.controller;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import com.example.payment_ms.dto.PaymentRequest;
import com.example.payment_ms.dto.PaymentResponse;
import com.example.payment_ms.service.PaymentService;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService service;

    @PostMapping
    public PaymentResponse makePayment(@RequestBody PaymentRequest request) {
        return service.processPayment(request);
    }
}
