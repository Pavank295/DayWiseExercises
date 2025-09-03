package com.example.bookingms.dto;
import jakarta.validation.constraints.*;

public class BookingRequest {

  @NotNull
  private Long flightId;

  @NotBlank
  private String passengerName;

  @Email @NotBlank
  private String passengerEmail;

  @Positive
  private double amount;

  @NotBlank
  private String method; // CARD/UPI/etc.

  // getters & setters
  public Long getFlightId() { return flightId; }
  public void setFlightId(Long flightId) { this.flightId = flightId; }
  public String getPassengerName() { return passengerName; }
  public void setPassengerName(String passengerName) { this.passengerName = passengerName; }
  public String getPassengerEmail() { return passengerEmail; }
  public void setPassengerEmail(String passengerEmail) { this.passengerEmail = passengerEmail; }
  public double getAmount() { return amount; }
  public void setAmount(double amount) { this.amount = amount; }
  public String getMethod() { return method; }
  public void setMethod(String method) { this.method = method; }
}
