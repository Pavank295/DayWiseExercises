package com.example.payment_ms.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.payment_ms.model.Payment;
import com.example.payment_ms.repository.PaymentRepository;

@Service
public class Consumer {
	@Autowired
	PaymentRepository paymentRepo;
	@Autowired
	KafkaTemplate kafkaTemplate;
	
	@KafkaListener(topics="T1",groupId="payment_service")
	public void receiveUpiPayment(Payment payment) {
		System.out.println("---Message Received ---"+payment);
		payment.setPaymentStatus("Confirmed");
		paymentRepo.save(payment);
		kafkaTemplate.send("T1",payment);
	}
}
	