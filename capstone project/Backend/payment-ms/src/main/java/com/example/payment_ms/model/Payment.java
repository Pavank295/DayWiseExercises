package com.example.payment_ms.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@Column(name="booking_id")
	String bookingId;
	
	 	 
	@Column(name="payment_price")
	double amount;
	
	@Column(name="payment_status")
	String paymentStatus;
	
	@Column(name="payment_mode")
	String modeOfPayment; 
	
	@Column(name="account_number")
	String accountNumber;
	
	@Column(name="cvv")
	int cvv;
}