package com.example.producerms.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.producerms.model.Subject;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "learn-subject";
    @Autowired
    private KafkaTemplate<String, Subject> kafkaTemplate;

    public String sendSubject(Subject subject) {
        kafkaTemplate.send(TOPIC, subject);
        return "Subject sent: " + subject;
    }
}


