package ss7.bai_tap.bai1;

public class Square1 extends Shape implements Resizeable{
    public double longs;

    public Square1() {
    }

    public Square1(int longs) {
        this.longs = longs;
    }

    public double getLongs() {
        return longs;
    }

    public void setLongs(int longs) {
        this.longs = longs;
    }

    public double getArea() {
        return (longs * longs);
    }

    public double getPerimeter() {
        return (longs * 4) ;
    }

    @Override
    public String toString() {
        return "SquareExtends" + " " + "longs=" + longs + ", " + super.toString();
    }

    @Override
    public void resize(double percent) {
         longs = longs * percent;
    }

    @Override
    public String howToColor() {
        return "Square: black";
    }
}
