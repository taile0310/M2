package ss6.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class PointMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter x,y: ");
        float x = Float.parseFloat(scanner.nextLine());
        float y = Float.parseFloat(scanner.nextLine());
        Point2D point2D = new Point2D(x, y);

        System.out.println("Point2D is: " + Arrays.toString(point2D.getXY()));

        System.out.println("enter z: ");
        float z = Float.parseFloat(scanner.nextLine());
        Point3D point3D = new Point3D(x, y, z);
        System.out.println("Point3D is: " + Arrays.toString(point3D.getZXY()));
    }
}
