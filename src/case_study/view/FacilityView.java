package case_study.view;

import case_study.utils.Validate;
import case_study.controller.FacilityController;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;

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
                                String nameV = Validate.validateRegex(Validate.SERVICENAME_REGEX);
                                System.out.println("input usable Area");
                                Double areaV = Double.parseDouble(Validate.validateRegex(Validate.AREA_REGEX));
                                System.out.println("input rent cost");
                                Double costV = Double.parseDouble(Validate.validateRegex(Validate.COST_REGEX));
                                System.out.println("input number of people");
                                int numOfPeopleV = Integer.parseInt(Validate.validateRegex(Validate.NUMPEOPLE_REGEX));
                                System.out.println("input rental type");
                                String rentalV = Validate.validateRegex(Validate.RENTALTYPE_REGEX);
                                System.out.println("input room standard");
                                String standardV = Validate.validateRegex(Validate.TYPEROOM_REGEX);
                                System.out.println("input pool area");
                                Double poolAreaV = Double.parseDouble(Validate.validateRegex(Validate.AREAPOOL_REGEX));
                                System.out.println("input num of floor");
                                int numOfFloorV = Integer.parseInt(Validate.validateRegex(Validate.NUMFLOOR_REGEX));
                                Villa villa = new Villa(nameV, areaV, costV, numOfPeopleV, rentalV, standardV, poolAreaV, numOfFloorV);
                                facilityController.addNewVilla(villa);
                                break;
                            case 2:
                                System.out.println("input service name");
                                String nameR = Validate.validateRegex(Validate.SERVICENAME_REGEX);
                                System.out.println("input usable Area");
                                Double areaR = Double.parseDouble(Validate.validateRegex(Validate.AREA_REGEX));
                                System.out.println("input rent cost");
                                Double costR = Double.parseDouble(Validate.validateRegex(Validate.AREA_REGEX));
                                System.out.println("input number of people");
                                int numOfPeopleR = Integer.parseInt(Validate.validateRegex(Validate.NUMPEOPLE_REGEX));
                                System.out.println("input rental type");
                                String rentalR = Validate.validateRegex(Validate.RENTALTYPE_REGEX);
                                System.out.println("input free service");
                                String freeServiceR = Validate.validateRegex(Validate.FREESERVICE_REGEX);
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
