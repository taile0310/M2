package ss13.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input lenght: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("input elememt: " + (i + 1));
            int value = Integer.parseInt(scanner.nextLine());
            arr[i] = value;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("the element to look for is: ");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println(binarySearch(arr, 0, length - 1, value));
    }

    static String binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return "the element to look for index is: " + middle;
            } else if (array[middle] > value) {
                return binarySearch(array, left, middle - 1, value);
            } else {
                return binarySearch(array, middle + 1, right, value);
            }
        }
        return "The element to be searched for is not present";
    }
}
