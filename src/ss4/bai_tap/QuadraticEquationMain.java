package ss4.bai_tap;

import javax.jws.Oneway;
import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a: ");
        double a = Double.parseDouble(sc.nextLine());

        System.out.println("Enter number b: ");
        double b = Double.parseDouble(sc.nextLine());

        System.out.println("Enter number c: ");
        double c = Double.parseDouble(sc.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        quadraticEquation.getA();
        quadraticEquation.getB();
        quadraticEquation.getC();

        System.out.println("delta value is: " + quadraticEquation.getDiscriminant());

        if (quadraticEquation.getDiscriminant() >= 0){
            System.out.println("r1: " + quadraticEquation.root1());
            System.out.println("r2: " + quadraticEquation.root2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("r1 = r2: " + quadraticEquation.root1());

        } else if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("the equation has no solution");

        }
    }


}
