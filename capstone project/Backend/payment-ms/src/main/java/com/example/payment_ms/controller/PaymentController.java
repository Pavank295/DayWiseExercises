package com.example.payment_ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.payment_ms.model.Payment;
import com.example.payment_ms.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;
    @GetMapping
    public List<Payment> findAll() {
        return paymentService.findAll();
    }
    @GetMapping("/{id}")
    public Payment findById(@PathVariable Long id) {
        return paymentService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        paymentService.deleteById(id);
    }
    @PutMapping("/{id}")
    public Payment update(@PathVariable Long id, @RequestBody Payment payment) {
        payment.setId(id);
        return paymentService.save(payment);
    }
    @PostMapping
    public Payment create(@RequestBody Payment payment) {
        return paymentService.save(payment);
    }
}
