package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMaximumValue {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        int max = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("enter the element of the array " + i + " index " + j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr));


        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }

        System.out.println("The maximum value is: " + max);
    }
}
