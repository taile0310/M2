//package CaseStudy.view;
//
//import CaseStudy.controller.facilityController.VillaController;
//
//import CaseStudy.model.facility.Villa;
//
//import java.util.Scanner;
//
//public class VillaView {
//    private final VillaController villaController = new VillaController();
//    private final Scanner scanner = new Scanner(System.in);
//    private Villa villa = new Villa();
//
//
//
//    public void menuVilla() {
//        do {
//            System.out.println("Menu: ");
//            System.out.println("1.Add new villa");
//            System.out.println("2.Return main menu");
//            System.out.println("3.Exit");
//            System.out.println("Please enter your selection");
//            int choose = Integer.parseInt(scanner.nextLine());
//
//            switch (choose) {
//                case 1:
//                    System.out.println("input service name");
//                    String name = scanner.nextLine();
//                    System.out.println("input usable Area");
//                    Double area = Double.parseDouble(scanner.nextLine());
//                    System.out.println("input rent cost");
//                    Double cost = Double.parseDouble(scanner.nextLine());
//                    System.out.println("input number of people");
//                    int numOfPeople = Integer.parseInt(scanner.nextLine());
//                    System.out.println("input rental type");
//                    String rental = scanner.nextLine();
//                    System.out.println("input room standard");
//                    String standard = scanner.nextLine();
//                    System.out.println("input pool area");
//                    Double poolArea = Double.parseDouble(scanner.nextLine());
//                    System.out.println("input num of floor");
//                    int numOfFloor = Integer.parseInt(scanner.nextLine());
//                    villa = new Villa(name, area, cost, numOfPeople, rental, standard, poolArea, numOfFloor);
//                    villaController.addVilla(villa);
//                    break;
//                case 2:
//                    menuVilla();
//                    return;
//                case 3:
//                    System.exit(1);
//                default:
//                    System.out.println("Invalid choose");
//            }
//        } while (true);
//    }
//
//}
