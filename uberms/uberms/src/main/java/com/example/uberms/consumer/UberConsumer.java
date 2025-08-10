package com.example.uberms.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.uberms.producer.UberProducer;

@Service
public class UberConsumer {
    @Autowired
    private UberProducer producer;

    @KafkaListener(topics = "R2U", groupId = "uber-group")
    public void consumeBooking(String bookingJson) {
        System.out.println("📥 Uber received booking: " + bookingJson);
        String confirmation = "Booking confirmed for: " + bookingJson;
        producer.sendConfirmation(confirmation);
    }
}
