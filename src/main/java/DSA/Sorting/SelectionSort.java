package DSA.Sorting;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 11, 50, 87};
        for (int i = 0; i < arr.length; i++) {
            int lowest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[lowest]) lowest = j;
            }
            int temp = arr[i];
            arr[i] = arr[lowest];
            arr[lowest] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
