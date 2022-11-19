package ss11.bai_tap;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class NumReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("input str num: ");
        String strNum = scanner.nextLine();
        System.out.println("str num is: " + strNum);

        String[] arr = strNum.split(" ");
        System.out.println("The array of numbers just created is: " + Arrays.toString(arr));

        Stack<String> reserveNum = new Stack<>();
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            reserveNum.push(arr[i]);
        }
        Collections.reverse(reserveNum);
        System.out.println("Array num reserve is: " + reserveNum);
    }
}
