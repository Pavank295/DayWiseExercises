package com.example.bookingms.dto;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

 
@Data 
public class Payment {

	int id;
	String bookingId;
	double amount;
	String paymentStatus;
	String modeOfPayment; 
	String accountNumber;
	int cvv;
}