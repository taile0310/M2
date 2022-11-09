package ss3.bai_tap;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrN = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element in array: " + i);
            arrN[i] = Integer.parseInt(sc.nextLine());
        }
        int size = arrN.length;
        System.out.print("enter the element to be deleted in the array: ");
        int x = Integer.parseInt(sc.nextLine());
        int[] newArr = new int[size];
        int count = 0;

        for (int j : arrN) {
            if (j != x) {
                newArr[count] = j;
                count++;
            }
        }

        for (int numb : newArr) {
            System.out.print(numb + " ");
        }

    }
}
