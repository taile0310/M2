package CaseStudy.view;

import CaseStudy.cotroller.RoomController;
import CaseStudy.model.Room;
import CaseStudy.model.Villa;
import javafx.beans.binding.When;

import java.util.Scanner;
import java.util.WeakHashMap;

public class RoomView {
    private final RoomController roomController = new RoomController();
    private final Scanner scanner = new Scanner(System.in);

    public void menuRoom() {
        do {
            System.out.println("Menu: ");
            System.out.println("1.Display list room");
            System.out.println("2.Add new room");
            System.out.println("3.Delete room");
            System.out.println("4.Edit room");
            System.out.println("5.Return main menu");
            System.out.println("6.Exit");
            System.out.println("Please enter your selection");
            int choose = Integer.parseInt(scanner.nextLine());
            Room room = new Room();

            switch (choose) {
                case 1:
                    roomController.displayRoom(room);
                    break;
                case 2:
                    roomController.addRoom(room);
                    break;
                case 3:
                    roomController.deleteRoom(room);
                    break;
                case 4:
                    roomController.editRoom(room);
                    break;
                case 5:
                    menuRoom();
                    return;
                case 6:
                    System.exit(1);
                default:
                    System.out.println("Invalid choose");
            }

        } while (true);
    }
}
