//package CaseStudy.view;
//
//import CaseStudy.controller.RoomController;
//import CaseStudy.model.Room;
//
//import java.util.Scanner;
//
//public class RoomView {
//    private final RoomController roomController = new RoomController();
//    private final Scanner scanner = new Scanner(System.in);
//    private Room room = new Room();
//    public void menuRoom() {
//        do {
//            System.out.println("Menu: ");
//            System.out.println("1.Display list room");
//            System.out.println("2.Add new room");
//            System.out.println("3.Delete room");
//            System.out.println("4.Edit room");
//            System.out.println("5.Return main menu");
//            System.out.println("6.Exit");
//            System.out.println("Please enter your selection");
//            int choose = Integer.parseInt(scanner.nextLine());
//
//
//            switch (choose) {
//                case 1:
//                    roomController.displayRoom(room);
//                    break;
//                case 2:
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
//                    System.out.println("input free service");
//                    String freeService = scanner.nextLine();
//                    room = new Room(name, area, cost, numOfPeople, rental, freeService);
//                    roomController.addRoom(room);
//                    break;
//                case 3:
//                    roomController.deleteRoom(room);
//                    break;
//                case 4:
//                    roomController.editRoom(room);
//                    break;
//                case 5:
//                    menuRoom();
//                    return;
//                case 6:
//                    System.exit(1);
//                default:
//                    System.out.println("Invalid choose");
//            }
//
//        } while (true);
//    }
//}
