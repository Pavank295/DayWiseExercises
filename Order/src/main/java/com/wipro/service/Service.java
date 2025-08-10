package com.wipro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.wipro.entity.Order;
import com.wipro.payment.Payment;
import com.wipro.repository.Repository;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repository orderRepo;

    private final RestTemplate restTemplate = new RestTemplate();
    private final String paymentUrl = "http://localhost:9011/payment";

    public Order placeOrder(Order order) {
        order.setOrderStatus("I"); 
        order = ((Object) orderRepo).save(order);

        Payment payment = new Payment(order.getId(), true);

        try {
            ResponseEntity<String> response = restTemplate.postForEntity(paymentUrl, payment, String.class);

            if (response.getStatusCode() == HttpStatus.OK) {
                order.setOrderStatus("P"); 
            } else {
                order.setOrderStatus("C"); 
            }
        } catch (Exception e) {
            order.setOrderStatus("C"); 
        }

        return orderRepo.save(order);
    }
}
