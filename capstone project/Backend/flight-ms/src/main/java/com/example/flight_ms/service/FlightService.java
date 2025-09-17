package com.example.flight_ms.service;
import java.util.List;

import com.example.flight_ms.model.Flight;

public interface FlightService {
	Flight addFlight(Flight flight);
    List<Flight> searchFlights(String source, String destination, String date);
    Flight getFlightById(int Id);
}