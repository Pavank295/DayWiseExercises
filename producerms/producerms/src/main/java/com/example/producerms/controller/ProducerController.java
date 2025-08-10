package com.example.producerms.controller;
import com.example.producerms.model.Subject;
import com.example.producerms.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    private KafkaProducerService producerService;

    @PostMapping("/sendSubject")
    public String sendSubject(@RequestBody Subject subject) {
        return producerService.sendSubject(subject);
    }
}
