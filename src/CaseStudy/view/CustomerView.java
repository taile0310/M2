package CaseStudy.view;

import CaseStudy.cotroller.CustomerController;
import CaseStudy.model.Customer;


import java.util.Scanner;

public class CustomerView {
    private final CustomerController customerController = new CustomerController();

    private final Scanner scanner = new Scanner(System.in);

    public void menuCustomer() {
        do {
            System.out.println("Menu: ");
            System.out.println("1.Display list customer");
            System.out.println("2.Add new customer");
            System.out.println("3.Delete customer");
            System.out.println("4.Edit customer");
            System.out.println("5.Return main menu");
            System.out.println("6.Exit");
            System.out.println("Please enter your selection");
            int choose = Integer.parseInt(scanner.nextLine());
            Customer customer = new Customer();
            switch (choose) {
                case 1:
                    customerController.displayCustomer(customer);
                    break;
                case 2:
                    customerController.addCustomer(customer);
                    break;
                case 3:
                    customerController.deleteCustomer(customer);
                    break;
                case 4:
                    customerController.editCustomer(customer);
                    break;
                case 5:
                    menuCustomer();
                    return;
                case 6:
                    System.exit(1);
                default:
                    System.out.println("Invalid choose");
            }

        } while (true);
    }
}
