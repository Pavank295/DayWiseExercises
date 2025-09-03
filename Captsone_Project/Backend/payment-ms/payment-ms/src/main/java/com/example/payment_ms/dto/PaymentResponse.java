package com.example.payment_ms.dto;

import com.example.payment_ms.model.PaymentStatus;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponse {
    private Long id;
    private Long bookingId;
    private Double amount;
    private String method;
    private PaymentStatus status;
}
