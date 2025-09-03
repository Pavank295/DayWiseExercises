package com.example.bookingms.kafka;

public class PaymentEvent {
  private Long bookingId;
  private Long flightId;
  private double amount;
  private String method; // CARD/UPI
  private String action; // e.g., "PAY"

  public PaymentEvent() {}

  public PaymentEvent(Long bookingId, Long flightId, double amount, String method, String action) {
    this.bookingId = bookingId;
    this.flightId = flightId;
    this.amount = amount;
    this.method = method;
    this.action = action;
  }

  public Long getBookingId() { return bookingId; }
  public void setBookingId(Long bookingId) { this.bookingId = bookingId; }
  public Long getFlightId() { return flightId; }
  public void setFlightId(Long flightId) { this.flightId = flightId; }
  public double getAmount() { return amount; }
  public void setAmount(double amount) { this.amount = amount; }
  public String getMethod() { return method; }
  public void setMethod(String method) { this.method = method; }
  public String getAction() { return action; }
  public void setAction(String action) { this.action = action; }
}
