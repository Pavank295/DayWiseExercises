package com.example.flight_ms;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class FlightMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightMsApplication.class, args);
	}

}