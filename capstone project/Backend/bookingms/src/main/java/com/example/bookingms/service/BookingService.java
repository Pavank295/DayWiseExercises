package com.example.bookingms.service;
import java.util.Optional;

import com.example.bookingms.dto.Payment;
import com.example.bookingms.model.Booking;


public interface BookingService {
	Booking createBooking(Booking booking);
    Booking getBookingByPnr(String pnr);
    void pay(Payment payment);
    Booking getBookingById(int id);
}