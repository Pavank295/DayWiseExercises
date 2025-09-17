package com.example.flight_ms.service;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flight_ms.model.Flight;
import com.example.flight_ms.repository.FlightRepository;
import com.example.flight_ms.service.FlightService;
@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightRepository repo;

	@Override
	public Flight addFlight(Flight flight) {
		return repo.save(flight);
		}

	@Override
	public List<Flight> searchFlights(String source, String destination, String date) {
		return repo.findBySourceAndDestinationAndDate(source, destination, date);	
        }
	@Override
	public Flight getFlightById(int id){
	    return repo.findById(id)
	               .orElseThrow(() -> new RuntimeException("Flight not found: " + id));
	}


}