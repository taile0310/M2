package CaseStudy.view;

import CaseStudy.cotroller.EmployeeController;
import CaseStudy.model.Employee;


import java.util.Scanner;

public class EmployeeView {
    private final EmployeeController employeeController = new EmployeeController();

    private Scanner scanner = new Scanner(System.in);
    private Employee employee = new Employee();

    public  void menuEmployee(){
        do {
            System.out.println("Menu: ");
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Delete employee");
            System.out.println("4.Edit employee");
            System.out.println("5.Return main menu");
            System.out.println("6.Exit");
            System.out.println("Please enter your selection");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
//                    for (Employee emp : employee) {
//                        System.out.println(emp);
//                    }
                    employeeController.displayEmployee(employee);
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
                    System.out.print("input level: ");
                    String level = scanner.nextLine();
                    System.out.print("input location: ");
                    String location = scanner.nextLine();
                    System.out.print("input wage: ");
                    Double wage = Double.parseDouble(scanner.nextLine());
                    employee = new Employee(id, name, date, gender, identity, phone, mail, level, location, wage);
                    employeeController.addEmployee(employee);
                    break;
                case 3:
                    employeeController.deleteEmployee(employee);

                    break;
                case 4:
                    employeeController.editEmployee(employee);
                    break;
                case 5:
                    menuEmployee();
                    return;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid choose");
            }
        }while (true);
    }
}
