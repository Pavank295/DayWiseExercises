package com.example.bookingms.kafka;

public class PaymentResult {
  private Long bookingId;
  private String status;   // SUCCESS / FAILED
  private String txnId;
  private String message;

  public PaymentResult() {}

  public PaymentResult(Long bookingId, String status, String txnId, String message) {
    this.bookingId = bookingId;
    this.status = status;
    this.txnId = txnId;
    this.message = message;
  }

  public Long getBookingId() { return bookingId; }
  public void setBookingId(Long bookingId) { this.bookingId = bookingId; }
  public String getStatus() { return status; }
  public void setStatus(String status) { this.status = status; }
  public String getTxnId() { return txnId; }
  public void setTxnId(String txnId) { this.txnId = txnId; }
  public String getMessage() { return message; }
  public void setMessage(String message) { this.message = message; }
}
