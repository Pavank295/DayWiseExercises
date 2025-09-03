package com.example.payment_ms.service;

import com.example.payment_ms.dto.PaymentRequest;
import com.example.payment_ms.dto.PaymentResponse;
import com.example.payment_ms.model.Payment;
import com.example.payment_ms.model.PaymentStatus;
import com.example.payment_ms.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository repo;

    @Override
    public PaymentResponse processPayment(PaymentRequest request) {
        Payment payment = Payment.builder()
                .bookingId(request.getBookingId())
                .amount(request.getAmount())
                .method(request.getMethod())
                .status(PaymentStatus.SUCCESS) 
                .build();

        Payment saved = repo.save(payment);

        return new PaymentResponse(
                saved.getId(),
                saved.getBookingId(),
                saved.getAmount(),
                saved.getMethod(),
                saved.getStatus()
        );
    }
}
