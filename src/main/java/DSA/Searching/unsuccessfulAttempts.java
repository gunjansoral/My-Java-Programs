package DSA.Searching;

public class unsuccessfulAttempts {
    private static int searchWorker(int[] arr, int key, int low, int high) {
        int count = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) return count;
            if (arr[mid] < key) {
                low = mid + 1;
                count++;
            } else {
                high = mid - 1;
                count++;
            }
        }
        return count;
    }

    public static int search(int[] arr, int key) {
        return searchWorker(arr, key, 0, arr.length - 1);
    }
}
