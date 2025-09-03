package com.example.flight_ms.controller;
import com.example.flight_ms.model.Flight;
import com.example.flight_ms.repository.FlightRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "Flight Data", description = "Master flight details & search APIs")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @Operation(summary = "Add a new flight", description = "Creates a flight record in the system")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Flight created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid input")
    })
    @PostMapping("/flights")
    public Flight addFlight(@RequestBody Flight flight) {
        return flightRepository.save(flight);
    }

    @Operation(summary = "Get flight by ID", description = "Fetch flight details using ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Flight found"),
            @ApiResponse(responseCode = "404", description = "Flight not found")
    })
    @GetMapping("/flights/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flightRepository.findById(id).orElse(null);
    }

    @Operation(summary = "Search flights", description = "Search flights by source, destination and travel date")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Flights retrieved successfully"),
            @ApiResponse(responseCode = "404", description = "No flights found for criteria")
    })
    @GetMapping("/search")
    public List<Flight> searchFlights(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam String date) {
        LocalDate travelDate = LocalDate.parse(date);
        return flightRepository.findBySourceCodeIgnoreCaseAndDestCodeIgnoreCaseAndTravelDate(from, to, travelDate);
    }
}
