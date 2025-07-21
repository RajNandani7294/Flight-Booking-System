package com.FlightTicketBooking.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlightTicketBooking.DTO.LoginRequest;
import com.FlightTicketBooking.Entity.User;
import com.FlightTicketBooking.Repository.UserRepository;

@RestController
@RequestMapping("/api")
public class AuthController {
	 @Autowired
	    private UserRepository userRepository;

	    @PostMapping("/login")
	    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
	        Optional<User> user = userRepository.findByEmailId(request.getEmailId());

	        if (user.isPresent() && user.get().getPassword().equals(request.getPassword())) {
	            return ResponseEntity.ok("Login successful");
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
	        }
	    }

}
