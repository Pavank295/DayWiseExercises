package com.wipro.order.controller;

import com.wipro.order.client.PaymentClient;
import com.wipro.order.entity.Order;
import com.wipro.order.model.Payment;
import com.wipro.repository.OrderRepository;
import com.wipro.order.entity.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepository orderRepository;
    private final PaymentClient paymentClient;

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        order.setOrderStatus("INITIATED");
        Order savedOrder = orderRepository.save(order);
        Payment payment = new Payment(null, savedOrder.getId(), true, savedOrder.getOrderValue());
        paymentClient.createPayment(payment);
        savedOrder.setOrderStatus("COMPLETED");
        return orderRepository.save(savedOrder);
    }

    @GetMapping
    public List<Order> getAll() {
        return orderRepository.findAll();
    }
}