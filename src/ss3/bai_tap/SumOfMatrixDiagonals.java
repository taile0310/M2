package ss3.bai_tap;

import java.util.Scanner;

public class SumOfMatrixDiagonals {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the order of the matrix: ");
        n = sc.nextInt();
        int A[][] = new int [n][n];
        System.out.println("enter the element for the matrix:");
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                System.out.print("A[" + i + "][" + j + "] =");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix just entered is: ");
        for (int i =0;i<n;i++){
            for (int j =0;j<n;j++){
                System.out.println(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i =0;i<n;i++){
            for (int j = 0;j<n;j++){
                if(i == j){
                    sum += A[i][j];
                }
            }
        }
        System.out.println("sum of the elements lying on the diagonal: " + sum);
    }
}
