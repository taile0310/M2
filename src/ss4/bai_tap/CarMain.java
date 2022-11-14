package ss4.bai_tap;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Car[] arr = new Car[2];
        Car car = new Car("BMW", 50, 1500, 50000 );
        arr[0] = car;

        Car car1 = new Car("Mer", 50, 1400, 55000);
        arr[1] = car1;
        for (Car c : arr) {
            System.out.println(c);
        }
    }
}
