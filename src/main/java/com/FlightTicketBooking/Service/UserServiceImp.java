package com.FlightTicketBooking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlightTicketBooking.Entity.User;
import com.FlightTicketBooking.Exception.ResourceNotFoundException;
import com.FlightTicketBooking.Repository.UserRepository;

@Service
public class UserServiceImp  implements UserService{

	@Autowired
	UserRepository userRepository;
	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmailId(email)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with email: " + email));
    }
	}
