package com.example.flight_ms.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="Flight_Number")
    private String flightNumber;
    @Column(name="AirLine_Name")
    private String airline;
    @Column(name="Source")
    private String source;
    @Column(name="Destination")
    private String destination;
    @Column(name="DATE")
    private String date;
    @Column(name="Time_Of_Departure")
    private String departureTime;
    @Column(name="Time_Of_Arival")
    private String arrivalTime;
    @Column(name="Price")
    private double price;
}