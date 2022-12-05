package CaseStudy.view;

import CaseStudy.controller.FacilityController;
import CaseStudy.controller.RoomController;
import CaseStudy.controller.VillaController;
import CaseStudy.model.Facility;
import CaseStudy.model.Room;
import CaseStudy.model.Villa;

import java.util.Scanner;

public class FacilityView {
    private final FacilityController facilityController = new FacilityController();

    private final Scanner scanner = new Scanner(System.in);
    //    private final VillaController villaController = new VillaController();
//    private final RoomController roomController = new RoomController();
    boolean isExit = true;

    public void menuFacility() {
        do {
            System.out.println("---Menu Facility---");
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Display list facility mentenace");
            System.out.println("4.Return main menu");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    facilityController.displayFacility();
                case 2:
                    do {
                        System.out.println("---Menu Villa & Room---");
                        System.out.println("1. Add villa:");
                        System.out.println("2. Add room");
                        System.out.println("3. back to menu");
                        int chooseNum = Integer.parseInt(scanner.nextLine());
                        switch (chooseNum) {
                            case 1:
                                System.out.println("input service name");
                                String nameV = scanner.nextLine();
                                System.out.println("input usable Area");
                                Double areaV = Double.parseDouble(scanner.nextLine());
                                System.out.println("input rent cost");
                                Double costV = Double.parseDouble(scanner.nextLine());
                                System.out.println("input number of people");
                                int numOfPeopleV = Integer.parseInt(scanner.nextLine());
                                System.out.println("input rental type");
                                String rentalV = scanner.nextLine();
                                System.out.println("input room standard");
                                String standardV = scanner.nextLine();
                                System.out.println("input pool area");
                                Double poolAreaV = Double.parseDouble(scanner.nextLine());
                                System.out.println("input num of floor");
                                int numOfFloorV = Integer.parseInt(scanner.nextLine());
                                Villa villa = new Villa(nameV, areaV, costV, numOfPeopleV, rentalV, standardV, poolAreaV, numOfFloorV);
                                facilityController.addNewVilla(villa);
                                break;
                            case 2:
                                System.out.println("input service name");
                                String nameR = scanner.nextLine();
                                System.out.println("input usable Area");
                                Double areaR = Double.parseDouble(scanner.nextLine());
                                System.out.println("input rent cost");
                                Double costR = Double.parseDouble(scanner.nextLine());
                                System.out.println("input number of people");
                                int numOfPeopleR = Integer.parseInt(scanner.nextLine());
                                System.out.println("input rental type");
                                String rentalR = scanner.nextLine();
                                System.out.println("input free service");
                                String freeServiceR = scanner.nextLine();
                                Room room = new Room(nameR, areaR, costR, numOfPeopleR, rentalR, freeServiceR);
                                facilityController.addNewRoom(room);
                                break;
                            case 3:
                                menuFacility();
                                return;
                            default:
                                System.out.println("Invalid choose num");
                        }
                    } while (true);
                case 3:
                    facilityController.mentenance();
                    break;
                case 4:
                    isExit = false;
                    return;
                default:
                    System.out.println("Invalid choose");
            }
        } while (isExit);
    }
}
