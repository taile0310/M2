package CaseStudy;

import CaseStudy.view.*;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        EmployeeView employeeView = new EmployeeView();
        CustomerView customerView = new CustomerView();
        VillaView villaView = new VillaView();
        RoomView roomView = new RoomView();
        BookingView bookingView = new BookingView();
        PromotionView promotionView = new PromotionView();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("Please enter your selection");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employeeView.menuEmployee();
                    break;
                case 2:
                    customerView.menuCustomer();
                    break;
                case 3:
                    do {
                        System.out.println("1.Villa");
                        System.out.println("2.Room");
                        System.out.println("Please enter Villa or Room");
                        int num = Integer.parseInt(scanner.nextLine());
                        switch (num) {
                            case 1:
                                villaView.menuVilla();
                                break;
                            case 2:
                                roomView.menuRoom();
                                break;
                            default:
                                System.out.println("Invalid choose");
                        }
                    } while (true);
                case 4:
                    bookingView.menuBooking();
                    break;
                case 5:
                    promotionView.menuPromotion();
                    break;
                case 6:
                    System.exit(1);
                default:
                    System.out.println("Invalid choose");
            }
        } while (true);
    }
}
