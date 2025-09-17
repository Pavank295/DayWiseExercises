package com.example.bookingms.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.bookingms.model.Booking;
import com.example.bookingms.repository.BookingRepository;
import com.example.payment_ms.model.Payment;
@Service
public class Consumer {
	@Autowired
	BookingRepository repo;
	
	@Autowired
	KafkaTemplate kafkaTemplate;
	
	@KafkaListener(topics= "T2",groupId="payment_service")
	public void receiveUpiPayment(Payment payment) {
		System.out.println("---Message Received ---"+payment);
		Optional<Booking> book = repo.findById(Integer.parseInt(payment.getBookingId()));
		if(book.isPresent()) {
			Booking booking = book.get();
			booking.setStatus(payment.getPaymentStatus());
			repo.save(booking);
					
		}
		
			
		
		
		
	}
	

}