package DSA.Hashing;

import java.util.HashMap;

public class FindSubset {
    public static boolean isSubset(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (map.getOrDefault(arr2[i], 0) > 0)
                map.put(arr2[i], map.get(arr2[i]) - 1);
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 1, 3, 7, 5, 6, 8, 9};
        int[] arr2 = {11, 1, 3, 6};
        System.out.println(isSubset(arr1, arr2));
    }
}
