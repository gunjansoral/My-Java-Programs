package Arrays;

import java.util.*;

public class SmallerThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int[] freq = new int[101];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        System.out.println(Arrays.toString(freq));

        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }
        System.out.println(Arrays.toString(freq));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[i] = freq[nums[i] - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 1, 2, 3, 5, 6, 5};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
