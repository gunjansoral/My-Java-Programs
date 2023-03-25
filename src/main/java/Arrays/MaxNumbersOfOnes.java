package Arrays;

import java.util.*;

public class MaxNumbersOfOnes {
    public static int findRowWithMaximumOnes(int[][] arr) {
        int maxRowIndex = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
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


        System.out.println(findRowWithMaximumOnes(arr));
    }
}
