package ss11.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> arrBinary = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("input num: ");
            num = Integer.parseInt(scanner.nextLine());
            System.out.println(num);
        }while (num <= 0);

        while (num > 0){
//            thực hiện phép chia lấy phân dư cho 2
            int surplus = num % 2;
//            thêm vào stack
            arrBinary.push(surplus);
            num = num / 2;
        }

        int size = arrBinary.size();
        for (int i = 0; i < size; i++) {
            System.out.println("the num entered decimal to binary ís : " + arrBinary.pop() + " ");
        }
    }
}
