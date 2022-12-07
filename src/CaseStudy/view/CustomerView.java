package CaseStudy.view;

import CaseStudy.controller.person_controller.CustomerController;
import CaseStudy.model.person.Customer;


import java.util.Scanner;

public class CustomerView {
    private final CustomerController customerController = new CustomerController();

    private final Scanner scanner = new Scanner(System.in);
    private Customer customer = new Customer();

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
                    System.out.print("input id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("input name: ");
                    String name = scanner.nextLine();
                    System.out.print("input date of birth: ");
                    String date = scanner.nextLine();
                    System.out.print("input gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("input identity card: ");
                    int identity = Integer.parseInt(scanner.nextLine());
                    System.out.print("input phone:");
                    int phone = Integer.parseInt(scanner.nextLine());
                    System.out.print("input mail: ");
                    String mail = scanner.nextLine();
                    System.out.print("input customer code: ");
                    int customerCode = Integer.parseInt(scanner.nextLine());
                    System.out.print("input type of guest: ");
                    String typeOfGuest = scanner.nextLine();
                    System.out.println("input address: ");
                    String add = scanner.nextLine();
                    customer = new Customer(id, name, date, gender, identity, phone, mail, customerCode, typeOfGuest, add);
                    customerController.addCustomer(customer);
                    break;
                case 3:
                    customerController.deleteCustomer(customer);
                    break;
                case 4:
                    System.out.println("input customer code edit:");
                    int cusCodeEdit = Integer.parseInt(scanner.nextLine());
                    System.out.println("input id edit:");
                    int idEdit = Integer.parseInt(scanner.nextLine());
                    System.out.println("input phone edit: ");
                    int phoneEdit = Integer.parseInt(scanner.nextLine());
                    customer.setCustomerCode(cusCodeEdit);
                    customer.setId(idEdit);
                    customer.setPhone(phoneEdit);
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
