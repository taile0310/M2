package ss2.bai_tap;

import java.util.Scanner;

public class PrintTheSquareTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the line number: ");
        int line = sc.nextInt();

//        Vòng lặp ngoài hiển thị số dòng (chiều dài)
        for (int i = 0; i <= line; i++) {
//            Vòng lặp trong hiển thị số lượng * có trong mỗi dòng.
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
//            bottom-left corner edge
        }
    }
}
