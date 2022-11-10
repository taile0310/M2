package ss5.bai_tap;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {


       Circle circle = new Circle();
        System.out.println("The original area is: " + circle.getArea() + "\n");

//        cho người dùng nhập vào bán kính
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int r = Integer.parseInt(scanner.nextLine());
        Circle circle1 = new Circle(r);
        System.out.println("\n" + "Area circle: " + circle1.getArea());
    }
}
