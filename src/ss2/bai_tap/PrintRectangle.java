package ss2.bai_tap;

import java.util.Scanner;

public class PrintRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the line number: ");
        int line = scanner.nextInt();

        System.out.print("enter the column number: ");
        int column = scanner.nextInt();

//        Vòng lặp ngoài hiển thị số dòng (chiều dài)
        for (int i = 1; i <= line; i++) {
//            Vòng lặp trong hiển thị số cột (chiều rộng)
            for (int j = 1; j <= column; j++) {
                System.out.print("*  ");
            }
            System.out.println("");

        }
    }
}
