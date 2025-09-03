package com.example.bookingms.dto;
public class FlightDTO {
  private Long id;
  private String airline;
  private String flightNumber;
  private String sourceCode;
  private String destCode;
  private String travelDate;
  private String departTime;
  private String arriveTime;
  private int durationMinutes;
  private double price;

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
  public String getTravelDate() { return travelDate; }
  public void setTravelDate(String travelDate) { this.travelDate = travelDate; }
  public String getDepartTime() { return departTime; }
  public void setDepartTime(String departTime) { this.departTime = departTime; }
  public String getArriveTime() { return arriveTime; }
  public void setArriveTime(String arriveTime) { this.arriveTime = arriveTime; }
  public int getDurationMinutes() { return durationMinutes; }
  public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }
  public double getPrice() { return price; }
  public void setPrice(double price) { this.price = price; }
}
