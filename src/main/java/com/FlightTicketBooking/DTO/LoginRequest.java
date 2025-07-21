package com.FlightTicketBooking.DTO;

public class LoginRequest {
   
	private String 	EmailId;
	
	private String password;

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
  
	
	
}
