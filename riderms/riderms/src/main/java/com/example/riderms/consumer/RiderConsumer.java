package com.example.riderms.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class RiderConsumer {
    @KafkaListener(topics = "U2R", groupId = "rider-group")
    public void consumeResponse(String message) {
        System.out.println("📥 Received update from Uber: " + message);
    }
}
