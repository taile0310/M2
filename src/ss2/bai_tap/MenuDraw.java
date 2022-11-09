package ss2.bai_tap;

import java.util.Scanner;

public class MenuDraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to draw a picture: ");
        int num = Integer.parseInt(scanner.nextLine());
        int line;

        switch (num) {
            case 1:
                System.out.print("enter the line number: ");
                line = Integer.parseInt(scanner.nextLine());

//        Vòng lặp ngoài hiển thị số dòng (chiều dài)
                for (int i = line; i >= 1; i--) {
//            Vòng lặp trong hiển thị số lượng * có trong mỗi dòng.
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;

            case 2:
                System.out.print("enter the line number: ");
                line = Integer.parseInt(scanner.nextLine());

                System.out.print("enter the column number: ");
                int column = Integer.parseInt(scanner.nextLine());

//        Vòng lặp ngoài hiển thị số dòng (chiều dài)
                for (int i = 1; i <= line; i++) {
//            Vòng lặp trong hiển thị số cột (chiều rộng)
                    for (int j = 1; j <= column; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println("");

                }
                break;

            case 3:
                System.out.print("enter the line number: ");
                line = Integer.parseInt(scanner.nextLine());

//        Vòng lặp ngoài hiển thị số dòng (chiều dài)
                for (int i = 0; i <= line; i++) {
//            Vòng lặp trong hiển thị số lượng * có trong mỗi dòng.
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
//            bottom-left corner edge
                }
                break;
        }

    }
}
