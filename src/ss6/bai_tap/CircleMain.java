package ss6.bai_tap;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int r = Integer.parseInt(scanner.nextLine());
        Circle classCircle = new Circle(r);
        System.out.println("Area circle is: " + classCircle.getArea());

        System.out.println("Enter height: ");
        double h = Double.parseDouble(scanner.nextLine());
        Cylinder cylinder = new Cylinder(h);
        System.out.println("Volume cylinder is: " + cylinder.getVolume());
    }
}

