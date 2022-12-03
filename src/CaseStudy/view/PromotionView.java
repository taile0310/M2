package CaseStudy.view;

import CaseStudy.cotroller.PromotionController;
import CaseStudy.model.Promotion;

import java.util.Scanner;

public class PromotionView {
    private final PromotionController promotionController = new PromotionController();
    private final Scanner scanner = new Scanner(System.in);

    public void menuPromotion() {
        do {
            System.out.println("Menu: ");
            System.out.println("1.Display list promotion");
            System.out.println("2.Add new promotion");
            System.out.println("3.Return main menu");
            System.out.println("4.Exit");
            System.out.println("Please enter your selection");
            int choose = Integer.parseInt(scanner.nextLine());
            Promotion promotion = new Promotion();
            switch (choose) {
                case 1:
                    promotionController.displayUser(promotion);
                    break;
                case 2:
                    promotionController.displayGetVoucher(promotion);
                    break;
                case 3:
                    menuPromotion();
                    return;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Invalid choose");
            }
        } while (true);
    }
}
