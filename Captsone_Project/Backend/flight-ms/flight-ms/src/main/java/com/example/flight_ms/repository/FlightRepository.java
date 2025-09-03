package com.example.flight_ms.repository;

import com.example.flight_ms.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findBySourceCodeIgnoreCaseAndDestCodeIgnoreCaseAndTravelDate(
            String sourceCode,
            String destCode,
            LocalDate travelDate
    );
}
