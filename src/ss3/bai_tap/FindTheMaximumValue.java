package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMaximumValue {
    public static void main(String[] args) {

        int[][] arr = new int[2][3];
//        [2] là số dòng, [3] là số cột
        double max = arr[0][0];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("enter the element of the array " + i + " index " + j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr));


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("The maximum value is: " + max);
    }
}
