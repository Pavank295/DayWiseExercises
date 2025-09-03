package com.example.bookingms.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long flightId;

  private String passengerName;
  private String passengerEmail;

  private double amount;

  private String paymentMethod; // CARD/UPI/etc.

  @Enumerated(EnumType.STRING)
  private BookingStatus status = BookingStatus.INITIATED;

  private LocalDateTime createdAt = LocalDateTime.now();

  // getters & setters
  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public Long getFlightId() { return flightId; }
  public void setFlightId(Long flightId) { this.flightId = flightId; }
  public String getPassengerName() { return passengerName; }
  public void setPassengerName(String passengerName) { this.passengerName = passengerName; }
  public String getPassengerEmail() { return passengerEmail; }
  public void setPassengerEmail(String passengerEmail) { this.passengerEmail = passengerEmail; }
  public double getAmount() { return amount; }
  public void setAmount(double amount) { this.amount = amount; }
  public String getPaymentMethod() { return paymentMethod; }
  public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
  public BookingStatus getStatus() { return status; }
  public void setStatus(BookingStatus status) { this.status = status; }
  public LocalDateTime getCreatedAt() { return createdAt; }
  public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
