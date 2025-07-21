package com.FlightTicketBooking.Entity;

import com.FlightTicketBooking.Enum.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	
	private String LastName;
	
	private String Gender;
	
	private int age;
	
	private String emailId;
	
	private Long phoneNo;
	
	private String Password;
	
	@Enumerated(EnumType.STRING)
	private Role role;

}
	

