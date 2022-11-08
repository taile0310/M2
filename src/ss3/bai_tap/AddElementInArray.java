package ss3.bai_tap;

import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to arrray");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Input integer " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
    }
}
