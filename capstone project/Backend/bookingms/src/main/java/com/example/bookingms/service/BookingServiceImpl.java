package com.example.bookingms.service;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.bookingms.dto.Flight;
import com.example.bookingms.model.Booking;
import com.example.bookingms.repository.BookingRepository;
import com.example.bookingms.service.BookingService;
import com.example.bookingms.dto.Payment;
@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	BookingRepository repo;
	

	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	KafkaTemplate kafkaTemplate;
	@Override
	public Booking createBooking(Booking booking) {
		if (booking.getPnr() == null || booking.getPnr().isEmpty()) {
            booking.setPnr(generatePNR());
        }

        // Set default status if not provided
        if (booking.getStatus() == null || booking.getStatus().isEmpty()) {
            booking.setStatus("INCOMPLETE");
        }

        // Always single ticket, remove totalPrice calculation
        booking.setNumberOfTicket(1);
	    return repo.save(booking);
	}

	@Override
	public Booking getBookingByPnr(String pnr) {
		// TODO Auto-generated method stub
		return repo.findByPnr(pnr);
	}

	@Override
	public void pay(com.example.bookingms.dto.Payment payment) {
		kafkaTemplate.send("BToP",payment);
		
	}
	
	private String generatePNR() {
        Random random = new Random();
        int number = 1000 + random.nextInt(9000); // 4-digit random number
        return "PNR-" + number;
    }
	@Override
	public Booking getBookingById(int id) {
	    return repo.findById(id).orElse(null);
	    }


}