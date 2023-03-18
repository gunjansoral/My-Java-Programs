package Arrays;

import java.util.*;

public class Permutations {
    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

    public static void arrayPermutations(int[] arr, int size) {
        if (size == 1) print(arr);
        for (int i = 0; i < size; i++) {
            arrayPermutations(arr, size - 1);
            if (size % 2 == 1)
                swap(arr, 0, size - 1);
            else
                swap(arr, i, size - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arrayPermutations(arr, arr.length);
    }
}
