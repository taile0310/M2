package ss4.bai_tap;

import java.util.Scanner;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, "yellow", 10);
        Fan fan2 = new Fan(2, false, "blue", 5);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
