package Arrays;

import java.util.Scanner;

public class SquareMatrixRotate90Degree {
    public static void swap(int[][] arr, int p1, int p2) {
        int temp = arr[p1][p2];
        arr[p1][p2] = arr[p2][p1];
        arr[p2][p1] = temp;
    }

    public static void swap(int[][] arr, int row, int p1, int p2) {
        int temp = arr[row][p1];
        arr[row][p1] = arr[row][p2];
        arr[row][p2] = temp;
    }

    static void rotate90Clockwise(int[][] arr) {
        //swap rows into columns and vice versa
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                swap(arr, i, j);
            }
        }
        //swap to make a mirror
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr.length - 1;
            while (left < right) {
                swap(arr, i, left, right);
                left++;
                right--;
            }
        }
    }

    static void printArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int m, n, i, j;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int arr[][] = new int[m][n];
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        rotate90Clockwise(arr);
        printArr(arr);

    }
}
