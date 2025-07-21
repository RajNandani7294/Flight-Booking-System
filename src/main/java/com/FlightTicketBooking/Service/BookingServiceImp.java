package com.FlightTicketBooking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlightTicketBooking.DTO.BookingRequest;
import com.FlightTicketBooking.Entity.Booking;
import com.FlightTicketBooking.Entity.Flight;
import com.FlightTicketBooking.Entity.User;
import com.FlightTicketBooking.Exception.BadRequestException;
import com.FlightTicketBooking.Exception.ResourceNotFoundException;
import com.FlightTicketBooking.Repository.BookingRepository;
import com.FlightTicketBooking.Repository.FlightRepository;
import com.FlightTicketBooking.Repository.UserRepository;

@Service
public class BookingServiceImp implements BookingService {
	
	@Autowired
	BookingRepository  bookingRepository;
	
	  @Autowired
	    private UserRepository userRepository;

	    @Autowired
	    private FlightRepository flightRepository;

	@Override
	public Booking bookFlight(Long userId, Long flightId, BookingRequest request) {
		 User user = userRepository.findById(userId)
	                .orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + userId));
	        Flight flight = flightRepository.findById(flightId)
	                .orElseThrow(() -> new ResourceNotFoundException("Flight not found with ID: " + flightId));

	        if (flight.getAvailableSeats() < request.getSeatsBooked()) {
	            throw new BadRequestException("Not enough available seats.");
	        }

	        Booking booking = new Booking();
	        booking.setUser(user);
	        booking.setFlight(flight);
	        booking.setSeatsBooked(request.getSeatsBooked());
	        booking.setBookingDate(request.getBookingDate());

	        flight.setAvailableSeats(flight.getAvailableSeats() - request.getSeatsBooked());
	        flightRepository.save(flight);

	        return bookingRepository.save(booking);
	}

	@Override
	public List<Booking> getBookingsByUser(Long userId) {
		 return bookingRepository.findByUserId(userId);
	}

}
