package com.FlightTicketBooking.DTO;

import java.time.LocalDate;

public class BookingRequest {
  
	 private int seatsBooked;
	 
	 private LocalDate bookingDate;

	 public int getSeatsBooked() {
		 return seatsBooked;
	 }

	 public void setSeatsBooked(int seatsBooked) {
		 this.seatsBooked = seatsBooked;
	 }

	 public LocalDate getBookingDate() {
		 return bookingDate;
	 }

	 public void setBookingDate(LocalDate bookingDate) {
		 this.bookingDate = bookingDate;
	 }
	 
	 
}
