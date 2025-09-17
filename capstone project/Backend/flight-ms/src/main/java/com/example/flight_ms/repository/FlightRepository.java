package com.example.flight_ms.repository;

import com.example.flight_ms.model.Flight;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findBySourceAndDestinationAndDate(String source, String destination, String date);
    Optional<Flight> findById(int Id);
}