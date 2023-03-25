package DSA.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            for (int j = i - 1; j >= 0 && key < arr[j]; j--) {
                arr[j + 1] = arr[j];
                arr[j] = key;
            }
        }
    }
}
