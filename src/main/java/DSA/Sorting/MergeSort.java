package DSA.Sorting;

import java.util.*;

public class MergeSort {
    private static int count;

    public static int[] merge(int[] a1, int[] a2) {
        int n1 = a1.length, n2 = a2.length;
        int[] arr = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (a1[i] < a2[j]) {
                arr[k++] = a1[i++];
            } else {
                arr[k++] = a2[j++];
            }
        }
        while (i < n1) {
            arr[k++] = a1[i++];
        }
        while (j < n2) {
            arr[k++] = a2[j++];
        }
        return arr;
    }

    public static int[] sort(int[] arr) {
        if (arr.length < 2) return arr;
        int mid = arr.length / 2;
        int[] a1 = new int[mid];
        int[] a2 = new int[arr.length - mid];
        int i = 0;
        for (; i < mid; i++) a1[i] = arr[i];
        for (; i < arr.length; i++) a2[i - mid] = arr[i];
        a1 = sort(a1);
        a2 = sort(a2);
        System.out.println(Arrays.toString(arr));
        count++;
        return merge(a1, a2);
    }
}
