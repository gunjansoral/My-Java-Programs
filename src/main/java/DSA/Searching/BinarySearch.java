package DSA.Searching;

public class BinarySearch {
    private static int searchWorker(int[] arr, int key, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) return mid;
        for (int i = low; i < high; i++) {
            if (arr[mid] < key) {
                return searchWorker(arr, key, mid + 1, high);
            } else {
                return searchWorker(arr, key, low, mid - 1);
            }
        }
        return -1;
    }

    public static int search(int[] arr, int key) {
        return searchWorker(arr, key, 0, arr.length - 1);
    }
}
