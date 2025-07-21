package com.FlightTicketBooking.Service;

import com.FlightTicketBooking.Entity.User;

public interface UserService {
	
	User findByEmail(String email);
}
