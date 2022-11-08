package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the the row and column for 2D array: ");
        int size1 = Integer.parseInt(input.nextLine());
        int size2 = Integer.parseInt(input.nextLine());
        double[][] arr = new double[size1][size2];
        for (int i = 0; i < size1; i++) {
            System.out.println("enter row: " + (i + 1));
            for (int j = 0; j < size2; j++) {
                System.out.print("enter element: " + (j + 1) + ": ");
                arr[i][j] = Double.parseDouble(input.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.print("Enter the column you want to sum: ");
        int col = Integer.parseInt(input.nextLine());
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        System.out.println("sum of column " + col + ": " + sum);
    }
}
