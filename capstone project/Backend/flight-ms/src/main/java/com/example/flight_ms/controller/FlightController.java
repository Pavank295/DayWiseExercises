package com.example.flight_ms.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.flight_ms.model.Flight;
import com.example.flight_ms.repository.FlightRepository;
import com.example.flight_ms.service.FlightService;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
	@Autowired
	private FlightService service;
	@Autowired
	private FlightRepository repo;


    @PostMapping("/data")
    public Flight addFlight(@RequestBody Flight flight) {
        return service.addFlight(flight);
    }
    @PostMapping("/bulk")
    public List<Flight> addFlights(@RequestBody List<Flight> flights) {
        return repo.saveAll(flights);
    }

    @GetMapping("/search")
    public List<Flight> searchFlights(@RequestParam String src,
                                      @RequestParam String dst,
                                      @RequestParam String date) {
        return service.searchFlights(src, dst, date);
    }
    @GetMapping("/{Id}")
    public Flight getFlightByNumber(@PathVariable int Id) {
        return service.getFlightById(Id);
    }
}