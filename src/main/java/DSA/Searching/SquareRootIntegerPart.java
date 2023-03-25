package DSA.Searching;

public class SquareRootIntegerPart {
    public static int sqrtWorker(int num, int low, int high) {
        int mid = low + (high - low) / 2;
        if (mid * mid == num) return mid;
        if (low > high) return mid - 1;
        if (mid * mid > num) {
            return sqrtWorker(num, low, mid - 1);
        } else {
            return sqrtWorker(num, mid + 1, high);
        }
    }

    public static int sqrt(int num) {
        return sqrtWorker(num, 1, num);
    }
}
