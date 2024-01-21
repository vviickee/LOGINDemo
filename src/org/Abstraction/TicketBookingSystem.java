package org.Abstraction;
	import java.util.ArrayList;
	import java.util.List;

	public class TicketBookingSystem {
	    private List<String> bookedSeats = new ArrayList<>();

	    public TicketBookingSystem bookSeat(String seat) {
	        if (!isSeatBooked(seat)) {
	            bookedSeats.add(seat);
	            System.out.println("Seat " + seat + " booked.");
	        } else {
	            System.out.println("Seat " + seat + " is already booked.");
	        }
	        return this;  
	    }

	    public boolean isSeatBooked(String seat) {
	        return bookedSeats.contains(seat);
	    }

	    public void displayBookedSeats() {
	        System.out.println("Booked Seats: " + bookedSeats);
	    }

	    public static void main(String[] args) {
	        TicketBookingSystem bookingSystem = new TicketBookingSystem();

	        bookingSystem
	            .bookSeat("A1")
	            .bookSeat("B2")
	            .bookSeat("A1")
	            .bookSeat("C3");

	        bookingSystem.displayBookedSeats();
	    }
	}




