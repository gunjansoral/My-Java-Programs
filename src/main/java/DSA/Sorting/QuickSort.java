package DSA.Sorting;

public class QuickSort {
    public static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

    public static int pivot(int[] arr, int low, int high) {
        int p = high;
        int curr = low;
        for (int i = low; i < high; i++) {
            if (arr[i] < arr[p]) {
                swap(arr, i, curr);
                curr++;
            }
        }
        swap(arr, curr, p);
        return p;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int pivot = pivot(arr, low, high);
        quickSort(arr, 0, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }

    public static int[] sort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);
        return arr;
    }
}
