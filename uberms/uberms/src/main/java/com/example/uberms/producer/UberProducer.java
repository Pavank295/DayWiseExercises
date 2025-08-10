package com.example.uberms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UberProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public void sendConfirmation(String confirmation) {
        kafkaTemplate.send("U2R", confirmation);
        System.out.println("📤 Sent confirmation to Rider: " + confirmation);
    }
}
