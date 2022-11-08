package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number and location to add: ");
        int number = Integer.parseInt(input.nextLine());
        int index = Integer.parseInt(input.nextLine());
        while (index < 0 || index > 8) {
            System.out.print("re-enter location: ");
            index = Integer.parseInt(input.nextLine());
        }
        for (int i = arr.length - 2; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = number;
        System.out.println("New array is: " + Arrays.toString(arr));
        }
    }

