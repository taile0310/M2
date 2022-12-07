package case_study.service;

import case_study.model.Booking;

public interface IBooking {
    void display(Booking booking);

    void add(Booking booking);

    void delete(Booking booking);

    void edit(Booking booking);
}
