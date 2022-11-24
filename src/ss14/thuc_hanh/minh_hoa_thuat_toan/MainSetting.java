package ss14.thuc_hanh;

import java.util.Arrays;

public class MainSetting extends AlgorithmSettings {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,4,1,3,9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
   }
}
