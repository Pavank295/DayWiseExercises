package com.example.riderms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RiderProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendBooking(String bookingJson) {
        kafkaTemplate.send("R2U", bookingJson);
        System.out.println("📤 Sent booking to Uber: " + bookingJson);
    }
}
