package BasicPrograms;

import java.util.*;

public class RottenOranges {
    public static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static boolean isValid(int[][] arr, int r, int c) {
        return r >= 0 && r < arr.length && c >= 0 && c < arr[r].length;
    }

    public static int findRottenOrangeDays(int[][] arr) {
        int rottenNum = 2;
        int days = 0;
        boolean isConverted = true;
        while (isConverted) {
            isConverted = false;
            for (int r = 0; r < arr.length; r++) {
                //check and convert to rotten oranges
                for (int c = 0; c < arr[r].length; c++) {
                    if (arr[r][c] == 2) {
                        //check if top is 1, convert it to 2
                        if (isValid(arr, r - 1, c) && arr[r - 1][c] == 1) {
                            arr[r - 1][c] = rottenNum + 1;
                            isConverted = true;
                        }
                        //check if right is 1, convert it to 2
                        if (isValid(arr, r, c + 1) && arr[r][c + 1] == 1) {
                            arr[r][c + 1] = rottenNum + 1;
                            isConverted = true;

                        }
                        //check if bottom is 1, convert it to 2
                        if (isValid(arr, r + 1, c) && arr[r + 1][c] == 1) {
                            arr[r + 1][c] = rottenNum + 1;
                            isConverted = true;
                        }
                        //check if left is 1, convert it to 2
                        if (isValid(arr, r, c - 1) && arr[r][c - 1] == 1) {
                            arr[r][c - 1] = rottenNum + 1;
                            isConverted = true;
                        }
                    }
                }
            }
            for (int r = 0; r < arr.length; r++) {
                //check and convert to rotten oranges
                for (int c = 0; c < arr[r].length; c++) {
                    if (arr[r][c] == 3) {
                        arr[r][c] = 2;
                    }
                }
            }
            if (isConverted) days++;
        }
        return days;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {2, 1, 1, 1, 2},
                {1, 1, 1, 0, 1},
                {1, 1, 1, 0, 1}
        };
        System.out.println(findRottenOrangeDays(arr));
        print2dArray(arr);
    }
}
