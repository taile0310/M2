package case_study.view;

import case_study.controller.BookingController;
import case_study.model.Booking;

import java.util.Scanner;

public class BookingView {
    private final BookingController bookingController = new BookingController();
    private final Scanner scanner = new Scanner(System.in);

    public void menuBooking() {
        do {
            System.out.println("Menu: ");
            System.out.println("1.Display list booking");
            System.out.println("2.Add new booking");
            System.out.println("3.Delete booking");
            System.out.println("4.Edit booking");
            System.out.println("5.Return main menu");
            System.out.println("6.Exit");
            System.out.println("Please enter your selection");
            int choose = Integer.parseInt(scanner.nextLine());
            Booking booking = new Booking();
            switch (choose) {
                case 1:
                    bookingController.displayBooking(booking);
                    break;
                case 2:
                    bookingController.addBooking(booking);
                    break;
                case 3:
                    bookingController.deleteBooking(booking);
                    break;
                case 4:
                    bookingController.editBooking(booking);
                    break;
                case 5:
                    menuBooking();
                    return;
                case 6:
                    System.exit(1);
                default:
                    System.out.println("Invalid choose");
            }
        } while (true);
    }
}
