package Arrays;

import java.util.*;

public class MedianOfTwoSortedArrays {
    public static double median(int[] arr) {
        if (arr.length % 2 != 0)
            return arr[(arr.length - 1) / 2];
        else
            return (double) (arr[(arr.length / 2) - 1] + arr[(arr.length / 2)]) / (double) 2;
    }

    public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        while (i < n1)
            arr3[k++] = arr1[i++];

        while (j < n2)
            arr3[k++] = arr2[j++];
        Arrays.sort(arr3);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int arr3[] = new int[n1 + n2];
        mergeArrays(nums1, nums2, n1, n2, arr3);
        return median(arr3);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
