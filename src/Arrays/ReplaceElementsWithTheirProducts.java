package Arrays;

import java.util.*;

public class ReplaceElementsWithTheirProducts {
    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static int product(int[] arr, int leftProduct, int index) {
        if (index == arr.length) return 1;
        int rightProduct = 1;
        for (int i = index + 1; i < arr.length; i++) {
            rightProduct *= arr[i];
        }
        int prod = leftProduct * rightProduct;
        int newLeftProduct = leftProduct * arr[index];
        arr[index] = prod;
        return product(arr, newLeftProduct, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        product(arr, 1, 0);
        print(arr);
    }
}
