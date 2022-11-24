package ss14.thuc_hanh;

import java.util.Arrays;

public class AlgorithmSettings {
    public static void bubbleSort(int[] list){
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] < list[j + 1]){
                    int temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                }

            }
        }
    }

    public static void selectionSort(int[] list){
        for (int i = 0; i < list.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < list.length; j++) {
                if (list[j] < list[min]){
                    min = j;
                }
            }

            if (min != i){
                int temp = list[min];
                list[min] = list[i];
                list[i] = temp;
            }
        }
    }

    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > key; j--) {
                list[j + 1] = list[j];
            }

            list[j + 1] = key;
        }
    }
}
