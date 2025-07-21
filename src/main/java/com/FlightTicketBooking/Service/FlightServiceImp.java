package com.FlightTicketBooking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlightTicketBooking.DTO.FlightRequest;
import com.FlightTicketBooking.Entity.Flight;
import com.FlightTicketBooking.Repository.FlightRepository;

@Service
public class FlightServiceImp implements FlightService {
	
	@Autowired
	FlightRepository flightRepository;

	@Override
	public Flight addFlight(FlightRequest request) {
		 Flight flight = new Flight();
	        flight.setAirline(request.getAirline());
	        flight.setSource(request.getSource());
	        flight.setDestination(request.getDestination());
	        flight.setDepartureDate(request.getDepartureDate());
	        flight.setTotalSeats(request.getTotalSeats());
	        flight.setAvailableSeats(request.getAvailableSeats());
	        flight.setPrice(request.getPrice());
	        return flightRepository.save(flight);
	}

	@Override
	public List<Flight> getAllFlights() {
		 return flightRepository.findAll();
	}
    

}
