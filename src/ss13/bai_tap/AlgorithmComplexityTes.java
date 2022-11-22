package ss13.bai_tap;

import java.util.Scanner;

public class AlgorithmComplexityTes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = inputString.charAt(i);
            frequentChar[ascii]++;
        }
        int max=0;
        char character = 255;
        for (int i = 0; i < 255; i++) {
            if(frequentChar[i]>max){
                max = frequentChar[i];
                character = (char) i;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");

    }
}