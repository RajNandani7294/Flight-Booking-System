package com.FlightTicketBooking.Service;

import java.util.List;

import com.FlightTicketBooking.DTO.FlightRequest;
import com.FlightTicketBooking.Entity.Flight;

public interface FlightService {

	  Flight addFlight(FlightRequest request);
	    List<Flight> getAllFlights();
}
