package com.FlightTicketBooking.Service;

import java.util.List;

import com.FlightTicketBooking.DTO.BookingRequest;
import com.FlightTicketBooking.Entity.Booking;

public interface BookingService {
  
	 Booking bookFlight(Long userId, Long flightId, BookingRequest request);
	    List<Booking> getBookingsByUser(Long userId);
}
