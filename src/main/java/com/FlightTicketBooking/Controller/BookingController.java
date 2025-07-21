package com.FlightTicketBooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlightTicketBooking.DTO.BookingRequest;
import com.FlightTicketBooking.DTO.FlightRequest;
import com.FlightTicketBooking.Entity.Booking;
import com.FlightTicketBooking.Entity.Flight;
import com.FlightTicketBooking.Service.BookingService;

@RestController
@RequestMapping("/api/flight")
public class BookingController {
	
	 @Autowired
	    private BookingService bookingService;

	    @PostMapping("/user/{userId}/flight/{flightId}")
	    public ResponseEntity<Booking> bookFlight(
	            @PathVariable Long userId,
	            @PathVariable Long flightId,
	            @RequestBody BookingRequest request) {

	        Booking booking = bookingService.bookFlight(userId, flightId, request);
	        return ResponseEntity.ok(booking);
	    }

	    @GetMapping("/user/{userId}")
	    public ResponseEntity<List<Booking>> getBookingsByUser(@PathVariable Long userId) {
	        return ResponseEntity.ok(bookingService.getBookingsByUser(userId));
	    }
}
