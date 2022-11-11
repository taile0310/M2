package ss6.bai_tap;

import java.util.Scanner;

public class ClassCircle {
    private static double radius;
    private String color;

    public ClassCircle() {
    }

    public ClassCircle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }

    @Override
    public String toString() {
        return "ClassCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    static class Cylinder extends ClassCircle {
        private double heigth;

        public Cylinder() {

        }

        public Cylinder(double heigth) {
            this.heigth = heigth;
        }

        public double getHeigth() {
            return heigth;
        }

        public void setHeigth(double heigth) {
            this.heigth = heigth;
        }

        public double getVolume() {
            return (Math.PI * (radius * radius) * heigth);
        }

        @Override
        public String toString() {
            return "Cylinder{" +
                    "height=" + heigth +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int r = Integer.parseInt(scanner.nextLine());
        ClassCircle classCircle = new ClassCircle(r);
        System.out.println("Area circle is: " + classCircle.getArea());

        System.out.println("Enter height: ");
        double h = Double.parseDouble(scanner.nextLine());
        Cylinder cylinder = new Cylinder(h);
        System.out.println("Volume cylinder is: " + cylinder.getVolume());
    }
}

