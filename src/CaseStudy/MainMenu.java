package CaseStudy;

import CaseStudy.model.Facility;
import CaseStudy.view.*;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        EmployeeView employeeView = new EmployeeView();
        CustomerView customerView = new CustomerView();
        FacilityView facilityView = new FacilityView();
        BookingView bookingView = new BookingView();
        PromotionView promotionView = new PromotionView();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---Management Menu---");
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
                    facilityView.menuFacility();
                    break;
                case 4:
                    bookingView.menuBooking();
                    break;
                case 5:
                    promotionView.menuPromotion();
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid choose");
            }
        } while (true);
    }
}
