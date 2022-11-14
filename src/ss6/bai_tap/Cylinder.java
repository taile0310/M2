package ss6.bai_tap;

public class Cylinder extends Circle {
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
        double radius = 1.0;
        return (Math.PI * (radius * radius) * heigth);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + heigth +
                '}';
    }
}
