package ss11.bai_tap;

import java.sql.Struct;
import java.util.*;

public class StrPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input str: ");
        String strPalin = scanner.nextLine();
        String[] words = strPalin.split(" ");
        System.out.println("the string entered is: " + Arrays.toString(words) + "\n");

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        for (int i = 0; i < words.length; i++) {
//            push element to array
            if (!Objects.equals(words[i]," ")){
                stack.push(words[i]);
            }
        }

        System.out.println("array entered push to stack is: " + stack);

        int sizeStack = stack.size();
        String popStack = "";

        for (int i = 0; i < sizeStack; i++) {
//            add the deleted element to the string
            popStack += stack.pop();
        }

        System.out.println("add the deleted element to the string: " + popStack + "\n");

        for (int i = 0; i < words.length; i++) {
            if (!Objects.equals(words[i]," ")){
                queue.offer(words[i]);
            }
        }

        System.out.println("array entered push to queue is: " + queue);

        int sizeQueue = queue.size();
        String popQueue = "";

        for (int i = 0; i < sizeQueue; i++) {
//            poll: trả về và loại phần đầu của hàng đợi
            popQueue += queue.poll();
        }

        System.out.println("return and remove the header is: " + popQueue + "\n");

        if (popStack.equals(popQueue)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
