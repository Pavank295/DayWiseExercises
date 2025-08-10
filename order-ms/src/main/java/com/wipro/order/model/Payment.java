package com.wipro.order.model;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private Long orderId;
    private boolean paymentStatus;
    private double paymentAmount;
}