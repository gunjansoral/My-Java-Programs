package DSA.Searching;

public class RotationCount {
    private static int rotationCountWorker(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] > arr[mid + 1] && arr[mid] > arr[high] && arr[mid] >= arr[low]) return mid + 1;
        if (arr[mid] < arr[low] && arr[mid] < arr[high]) return rotationCountWorker(arr, low, mid);
        if (arr[mid] > arr[high] && arr[mid] > arr[low]) return rotationCountWorker(arr, mid, high);
        return 0;
    }

    public static int rotationCount(int[] arr) {
        return rotationCountWorker(arr, 0, arr.length - 1);
    }
}
