package ss6.bai_tap;

import java.util.Scanner;

public class Circle {
    private static double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius) {
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
}



