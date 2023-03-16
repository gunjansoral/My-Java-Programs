package DSA.Searching;

public class BinarySearchIterative {
    private static int searchWorker(int[] arr, int key, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int search(int[] arr, int key) {
        return searchWorker(arr, key, 0, arr.length - 1);
    }
}
