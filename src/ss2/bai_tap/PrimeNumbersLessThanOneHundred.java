package ss2.bai_tap;

import java.util.Scanner;

public class PrimeNumbersLessThanOneHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = scanner.nextInt();
        System.out.print("Prime numbers less than one hundred: ");
        if (n >= 2 ){
            System.out.print(2);
        }
        for (int i = 3; i < n; i = i + 2) {
            if (primeNumber(i)){
                System.out.print(" " + i);
            }

        }
    }

    public static boolean primeNumber(int n){
//        so nguyen < 2 khong phai la SNT
        if (n < 2){
            return false;
        }
//        kiem tra SNT khi n >= 2
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i < sqrt; i++) {
            if (n % i ==0){
                return  false;
            }

        }
        return true;
    }
}
