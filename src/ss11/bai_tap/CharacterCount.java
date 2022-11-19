package ss11.bai_tap;

import java.util.*;

public class CharacterCount {
    public static void main(String[] args) {
        Map<String, Integer> character = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("input str: ");
        String str = scanner.nextLine();
        System.out.println(str);

        String[] arr = str.toLowerCase().split(" ");
        System.out.println(Arrays.toString(arr));

        int size = arr.length;
        int count = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i].equals(arr[j])){
                   count++;
                }
            }
            if (!Objects.equals(arr[i],"")){
                character.put(arr[i], count);
            }
                count = 0;
        }
        System.out.println(character);
    }
}
