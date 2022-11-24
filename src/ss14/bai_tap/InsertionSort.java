package ss14.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list =  {7,3,8,5,4};

        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j;
            for (j = i - 1; j >= 0 && key < list[j]; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = key;
            System.out.println(Arrays.toString(list));
        }
    }
}
