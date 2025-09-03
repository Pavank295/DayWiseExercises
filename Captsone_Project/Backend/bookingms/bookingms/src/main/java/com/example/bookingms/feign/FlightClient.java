package com.example.bookingms.feign;

import com.example.bookingms.dto.FlightDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "flight-data-ms", url = "http://localhost:8081")
public interface FlightClient {

  @GetMapping("/api/search")
  List<FlightDTO> search(@RequestParam("from") String from,
                         @RequestParam("to") String to,
                         @RequestParam("date") String date);

  @GetMapping("/api/flights/{id}")
  FlightDTO getById(@PathVariable("id") Long id);
}
