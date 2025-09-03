package com.example.bookingms.controller;

import com.example.bookingms.dto.BookingRequest;
import com.example.bookingms.dto.FlightDTO;
import com.example.bookingms.model.Booking;
import com.example.bookingms.service.BookingService;
import com.example.bookingms.service.FlightSearchService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "Booking", description = "Booking and flight search APIs")
public class BookingController {

  private final BookingService bookingService;
  private final FlightSearchService flightService;

  public BookingController(BookingService bookingService, FlightSearchService flightService) {
    this.bookingService = bookingService;
    this.flightService = flightService;
  }

  @Operation(summary = "Search flights by route & date")
  @GetMapping("/search")
  public ResponseEntity<List<FlightDTO>> search(@RequestParam String from,
                                                @RequestParam String to,
                                                @RequestParam String date) {
    return ResponseEntity.ok(flightService.search(from, to, date));
  }

  @Operation(summary = "Create a booking (publishes PaymentEvent to Kafka)")
  @PostMapping("/bookings")
  public ResponseEntity<Booking> create(@Valid @RequestBody BookingRequest req) {
    return ResponseEntity.ok(bookingService.createBooking(req));
  }

  @Operation(summary = "Get booking by ID")
  @GetMapping("/bookings/{id}")
  public ResponseEntity<Booking> get(@PathVariable Long id) {
    Booking b = bookingService.getBooking(id);
    return (b == null) ? ResponseEntity.notFound().build() : ResponseEntity.ok(b);
  }
}
