package com.FlightTicketBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlightTicketBooking.Entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{

}
