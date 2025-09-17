package com.example.bookingms.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name="P_N_R")
    String pnr;  

    @Column(name="Name")
    String passengerName;

    @Column(name="Age")
    int passengerAge;

    @Column(name="Gender")
    String gender;

    @Column(name="Email")
    String email;

    @Column(name="Phone")
    String phone;

    @Column(name="booking_status")
    String status;

    @Column(name="Total_Price")
    double totalPrice;

    @Column(name="num_tickets")
    int numberOfTicket;
    
    @Column(name="Flight_ID")
    int flightId;

}
