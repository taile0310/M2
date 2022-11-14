package ss7.bai_tap.bai1;

public class Circle1 extends Shape implements Resizeable, HowToColor {
    private double radius = 1.0;

    public Circle1() {

    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }

    @Override
    public String toString() {
        String color = "red";
        return "CircleExtends" + " " +
                "radius=" + radius +
                ", color='" + color + '\'' + ", " + super.getColor();
    }

    @Override
    public void resize(double percent) {
        radius=radius*percent;
    }

    @Override
    public String howToColor() {
        return "Circle: red" ;
    }
}
