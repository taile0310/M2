package ss4.bai_tap;

import java.util.Scanner;

public class ThuatToan {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        System.out.println("integer array after addition");
        int[] arr = {2, 5, 6, 8, 7, 9, 4, 3, 1};
        int num = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num){
                    System.out.println("[" + arr[i] + "," + arr[j] + "]");
                }
            }
        }
    }
}
