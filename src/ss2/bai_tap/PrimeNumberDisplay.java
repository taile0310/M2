package ss2.bai_tap;

import java.util.Scanner;

public class PrimeNumberDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.println("Prime number display: " + n);
        // đếm số số nguyên tố
        int count = 0;
        // tìm số nguyên tố bắt dầu từ số 2
        int i = 2;
        while (count < n) {
            if (primeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    
    public static boolean primeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // kiem tra so nguyen to khi n >= 2
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
