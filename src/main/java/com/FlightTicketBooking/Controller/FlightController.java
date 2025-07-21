package com.FlightTicketBooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlightTicketBooking.DTO.FlightRequest;
import com.FlightTicketBooking.Entity.Flight;
import com.FlightTicketBooking.Service.FlightService;

@RestController
@RequestMapping("/api/flight")
public class FlightController {
  
    @Autowired
    private FlightService flightService;

    @PostMapping
    public ResponseEntity<Flight> addFlight(@RequestBody FlightRequest request) {
        Flight flight = flightService.addFlight(request);
        return ResponseEntity.ok(flight);
    }

    @GetMapping
    public ResponseEntity<List<Flight>> getAllFlights() {
        return ResponseEntity.ok(flightService.getAllFlights());
    
}
}
