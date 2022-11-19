package ss11.bai_tap;

import java.util.*;

public class StrReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input str: ");

        String str = scanner.nextLine();

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        Stack<String> strResever = new Stack<>();
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            strResever.push(arr[i]);
        }

        Collections.reverse(strResever);
        System.out.println(strResever);







//        Stack<Integer> arrNum = new Stack<>();
//        arrNum.push(0);
//        arrNum.push(1);
//        arrNum.push(2);
//        arrNum.push(3);
//        arrNum.push(4);
//        arrNum.push(5);
//        System.out.println("array is: " + arrNum);
//        Collections.reverse(arrNum);
//        System.out.println("reverse array is: " + arrNum);
    }
}
