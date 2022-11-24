package ss15.bai_tap;

import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("input b: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("input c: ");
        int c = Integer.parseInt(scanner.nextLine());

        TriangleException triangleException = new TriangleException();

        try {
            triangleException.check(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }


    }

    private void check(int a, int b, int c) throws Exception {
        if (a > 0 && b > 0 && c > 0 && (a + b > c || a + c > b || c + b > a)) {
            System.out.println("this is a triangle");
        } else {
            System.out.println("this is not a triangle");
        }
    }
}

