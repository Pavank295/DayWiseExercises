package com.example.bookingms.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookingms.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
	Booking findByPnr(String pnr);
}
