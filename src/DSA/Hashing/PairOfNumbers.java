package DSA.Hashing;

import java.util.ArrayList;
import java.util.Hashtable;

public class PairOfNumbers {
    public static ArrayList<String> pairNumbers(int[] arr, int target) {
        Hashtable<Integer, Integer> pairs = new Hashtable<>();

        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int other = Math.abs(curr - target);
            if (pairs.containsKey(other)) {
                //generate a pair of (curr, other)
                str.add("(" + curr + ", " + other + ")");
            }
            pairs.put(curr, 1);
        }
        return str;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 12, 13, 14, 15};
        System.out.println(pairNumbers(arr, 15));
    }
}
