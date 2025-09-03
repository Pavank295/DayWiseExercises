package com.example.bookingms.service;

import com.example.bookingms.dto.FlightDTO;
import com.example.bookingms.feign.FlightClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class FlightSearchService {

  private final FlightClient client;

  public FlightSearchService(FlightClient client) { this.client = client; }

  @CircuitBreaker(name = "flightSearch", fallbackMethod = "fallback")
  public List<FlightDTO> search(String from, String to, String date) {
    return client.search(from, to, date);
  }

  public FlightDTO get(Long id) { return client.getById(id); }

  // fallback signature must match + Throwable
  List<FlightDTO> fallback(String from, String to, String date, Throwable t) {
    return Collections.emptyList();
  }
}
