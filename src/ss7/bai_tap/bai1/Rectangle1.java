package ss7.bai_tap.bai1;

public class Rectangle1 extends Shape implements Resizeable{
    public double longs;
    public double width;


    public Rectangle1() {
    }

    public Rectangle1(int longs, int width) {
        this.longs = longs;
        this.width = width;
    }

    public double getLongs() {
        return longs;
    }

    public void setLongs(int longs) {
        this.longs = longs;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea() {
        return (longs * width);
    }

    public double getPerimeter() {
        return ((longs + width) * 2);
    }

    @Override
    public String toString() {
        return "RectangleExtends" + " " +
                "longs=" + longs +
                ", width=" + width + ", " +
                super.toString();
    }

    @Override
    public void resize(double percent) {
        longs = longs * percent;
        width = width * percent;
    }

    @Override
    public String howToColor() {
        return "Rectangle: blue";
    }
}
