package Arrays;

import java.util.*;

public class SpiralMatrix {
    public static int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int count = 1;
        int top = 0, right = n - 1, bottom = n - 1, left = 0;
        while (count <= n * n) {
            for (int i = left; i <= right; i++) {
                mat[top][i] = count++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = count++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                mat[bottom][i] = count++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                mat[i][left] = count++;
            }
            left++;
        }
        return mat;
    }

    public static void print2dArray(int[][] mat) {
        for (int i = 0; i < mat[0].length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }

    public static void main(String[] args) {
        int[][] mat = generateMatrix(5);
        print2dArray(mat);
    }
}
