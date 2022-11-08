package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array length");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];

        for (int i = 0; i < size ; i++) {
            System.out.println("enter the element: " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        for (int i = 0; i < size ; i++) {
            if ( arr[i] <= min ) {
                min = arr[i] ;
            }
        }

        System.out.println("The smallest value is " + min);
    }
}
