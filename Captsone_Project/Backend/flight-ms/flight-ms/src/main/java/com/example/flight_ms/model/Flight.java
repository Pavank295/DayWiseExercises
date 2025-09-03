package com.example.flight_ms.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "flight")   
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String airline;

    @Column(name = "flight_number")
    private String flightNumber;

    @Column(name = "source_code")
    private String sourceCode;

    @Column(name = "dest_code")
    private String destCode;

    @Column(name = "travel_date")
    private LocalDate travelDate;

    @Column(name = "depart_time")
    private LocalTime departTime;

    @Column(name = "arrive_time")
    private LocalTime arriveTime;

    @Column(name = "duration_minutes")
    private Integer durationMinutes;

    private Double price;

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAirline() { return airline; }
    public void setAirline(String airline) { this.airline = airline; }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

    public String getSourceCode() { return sourceCode; }
    public void setSourceCode(String sourceCode) { this.sourceCode = sourceCode; }

    public String getDestCode() { return destCode; }
    public void setDestCode(String destCode) { this.destCode = destCode; }

    public LocalDate getTravelDate() { return travelDate; }
    public void setTravelDate(LocalDate travelDate) { this.travelDate = travelDate; }

    public LocalTime getDepartTime() { return departTime; }
    public void setDepartTime(LocalTime departTime) { this.departTime = departTime; }

    public LocalTime getArriveTime() { return arriveTime; }
    public void setArriveTime(LocalTime arriveTime) { this.arriveTime = arriveTime; }

    public Integer getDurationMinutes() { return durationMinutes; }
    public void setDurationMinutes(Integer durationMinutes) { this.durationMinutes = durationMinutes; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}
