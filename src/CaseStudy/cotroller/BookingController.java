package CaseStudy.cotroller;

import CaseStudy.model.Booking;
import CaseStudy.service.BookingServiceImpl;
import CaseStudy.service.IBooking;

public class BookingController {
    IBooking iBooking = new BookingServiceImpl();

    public void displayBooking(Booking booking) {
        this.iBooking.display(booking);
    }

    public void addBooking(Booking booking) {
        this.iBooking.add(booking);
    }

    public void deleteBooking(Booking booking) {
        this.iBooking.delete(booking);
    }

    public void editBooking(Booking booking) {
        this.iBooking.edit(booking);
    }
}
