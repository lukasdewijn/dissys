package hotel;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Room {

	private Integer roomNumber;
	private List<BookingDetail> bookings;

	public Room(Integer roomNumber) {
		this.roomNumber = roomNumber;
		bookings = new ArrayList<BookingDetail>();
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public List<BookingDetail> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingDetail> bookings) {
		this.bookings = bookings;
	}

	public boolean isAvailableOn(LocalDate date){
		for (BookingDetail booking : bookings){
			if (booking.getDate().equals(date)){
				return false; // Room is booked on this date
			}
		}
		return true; // Room is available on this date
	}

	public void addBooking(BookingDetail bookingDetail){
		bookings.add(bookingDetail);
	}
}