package com.wipro.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.entity.Order;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody Order order) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Order created successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable int id) {
        return ResponseEntity.ok(new Order());
    }
}
