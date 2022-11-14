package ss7.bai_tap.bai1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double percent = Math.random() * 100 + 1;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle1();
        shapes[1] = new Rectangle1();
        shapes[2] = new Square1();

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle1) {
                Circle1 c1 = (Circle1) shapes[i];
                c1.resize(percent);
                System.out.println(c1.getArea());
                System.out.println(c1.howToColor());
            }

            else if (shapes[i] instanceof Rectangle1) {
                Rectangle1 r1 = (Rectangle1) shapes[i];
                r1.resize(percent);
                System.out.println(r1.getArea());
                System.out.println(r1.howToColor());
            }

            else {
                Square1 sq1 = (Square1) shapes[i];
                sq1.resize(percent);
                System.out.println(sq1.getArea());
                System.out.println(sq1.howToColor());
            }
        }
    }
}
