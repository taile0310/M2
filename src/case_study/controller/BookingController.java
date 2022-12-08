package case_study.controller;

import case_study.model.Booking;
import case_study.service.Impl.BookingServiceImpl;
import case_study.service.IBooking;

public class BookingController {
    private final IBooking iBooking = new BookingServiceImpl();

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
