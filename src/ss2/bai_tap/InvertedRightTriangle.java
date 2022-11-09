package ss2.bai_tap;

import java.util.Scanner;

public class InvertedRightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the line number: ");
        int line = scanner.nextInt();
        
//        Vòng lặp ngoài hiển thị số dòng (chiều dài)
        for (int i = line; i >= 1; i--) {
//            Vòng lặp trong hiển thị số lượng * có trong mỗi dòng.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
