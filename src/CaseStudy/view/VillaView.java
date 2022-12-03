package CaseStudy.view;

import CaseStudy.cotroller.VillaController;
import CaseStudy.model.Employee;
import CaseStudy.model.Villa;

import java.util.Scanner;

public class VillaView {
    private final VillaController villaController = new VillaController();
    private final Scanner scanner = new Scanner(System.in);

    public void menuVilla() {
        do {
            System.out.println("Menu: ");
            System.out.println("1.Display list villa");
            System.out.println("2.Add new villa");
            System.out.println("3.Delete villa");
            System.out.println("4.Edit villa");
            System.out.println("5.Return main menu");
            System.out.println("6.Exit");
            System.out.println("Please enter your selection");
            int choose = Integer.parseInt(scanner.nextLine());
            Villa villa = new Villa();
            switch (choose) {
                case 1:
                    villaController.displayVilla(villa);
                    break;
                case 2:
                    villaController.addVilla(villa);
                    break;
                case 3:
                    villaController.deleteVilla(villa);
                    break;
                case 4:
                    villaController.editVilla(villa);
                    break;
                case 5:
                    menuVilla();
                    return;
                case 6:
                    System.exit(1);
                default:
                    System.out.println("Invalid choose");
            }
        } while (true);
    }

}
