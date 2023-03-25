package DSA.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DistinctNumbersInAllWindows {
    public static int[] distinctNumbersInWindows(int[] arr, int windowSize) {
        int[] distinctCounts = new int[arr.length - windowSize + 1];
        //traverse each window
        for (int i = 0; i < distinctCounts.length; i++) {
            //check distinct numbers count in each window
            HashSet<Integer> window = new HashSet<>();
            for (int j = i; j < i + windowSize; j++) {
                window.add(arr[j]);
            }
            //put each number in an array
            distinctCounts[i] = window.size();
        }
        //return the array
        return distinctCounts;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 3, 2, 2, 2, 3, 1, 5, 4, 6, 5, 8, 9, 4};
        System.out.println(Arrays.toString(distinctNumbersInWindows(arr, 3)));
    }
}
