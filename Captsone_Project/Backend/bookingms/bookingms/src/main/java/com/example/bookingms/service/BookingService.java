package com.example.bookingms.service;

import com.example.bookingms.dto.BookingRequest;
import com.example.bookingms.model.Booking;

public interface BookingService {
  Booking createBooking(BookingRequest req);
  Booking getBooking(Long id);
}
