package com.example.consumerms.service;
import com.example.consumerms.model.Subject;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "learn-subject", groupId = "learn-subject-group")
    public void consume(Subject subject) {
        System.out.println("Consumed Subject: " + subject);
    }
}
