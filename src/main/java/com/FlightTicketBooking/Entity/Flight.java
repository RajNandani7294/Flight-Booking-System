package com.FlightTicketBooking.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String airline;
    private String source;
    private String destination;
    private LocalDate departureDate;
    private int totalSeats;
    private int availableSeats;
    private double price;
	
}
