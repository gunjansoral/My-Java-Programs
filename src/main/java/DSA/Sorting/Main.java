package DSA.Sorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {20, 18, 16, 14, 12, 10, 8, 6, 4, 2};
        InsertionSort insertionSort = new InsertionSort();
//        int[] sortedArr = insertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));

//        int[] a1 = {0, 2, 4, 6};
//        int[] a2 = {1, 3, 5};
        arr = MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
