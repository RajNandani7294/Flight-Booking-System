package com.FlightTicketBooking.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	    @ManyToOne
	    private User user;

	    @ManyToOne
	    private Flight flight;

	    private int seatsBooked;
	    private LocalDate bookingDate;
}
