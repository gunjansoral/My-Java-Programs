package DSA.Hashing;

import java.util.HashMap;

public class PrintPairsSum {
    public static void printPairsSum(int[] arr) {
        HashMap<Integer, Integer[]> pairs = new HashMap<>();
        //iterate two times
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                Integer pair[] = {arr[i], arr[j]};
                int sum = arr[i] + arr[j];
                if (!pairs.containsKey(sum)) {
                    pairs.put(sum, pair);
                } else {
                    System.out.println("Matching pairs are : (" + arr[i] + ", " + arr[j] + ") and (" + pairs.get(sum)[0] + ", " + pairs.get(sum)[1] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printPairsSum(arr);
    }
}
