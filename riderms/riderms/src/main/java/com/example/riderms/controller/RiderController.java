package com.example.riderms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.riderms.entity.Rider;
import com.example.riderms.producer.RiderProducer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class RiderController {
    @Autowired
    private RiderProducer producer;

    @PostMapping("/ride")
    public String bookRide(@RequestBody Rider rider) throws JsonProcessingException {
        String bookingJson = new ObjectMapper().writeValueAsString(rider);
        producer.sendBooking(bookingJson);
        return "Ride booking request sent to Uber!";
    }
}
