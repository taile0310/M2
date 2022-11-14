package ss4.bai_tap;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.StringTokenizer;

public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private boolean on = false;
    private   int speed = 1;
    private String color = "blue";
    private double radius = 5;

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Fan(int speed, boolean on, String color, double radius){
        this.speed =speed;
        this.on = on;
        this.color = color;
        this.radius = radius;

    }
    public String toString(){
        if (this.isOn()){
            return ("Fan is on: " + this.speed + "\n" + this.color + "\n" + this.radius);
        }else {
            return ("Fan is off: " + this.speed + "\n" + this.color + "\n" + this.radius);
        }
    }
}

