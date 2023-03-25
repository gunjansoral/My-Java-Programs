package Arrays;

import java.util.*;

public class FindRepeatedNumber {
    public static int findRepeatedNumber(int[] arr, int n) {
        int missingElement = 0;
        for (int i = 0; i < n; i++) {
            int element = arr[Math.abs(arr[i] % n)];
            if (element < 0) {
                missingElement = arr[i];
                break;
            }
            arr[Math.abs(arr[i] % n)] = -arr[Math.abs(arr[i] % n)];
        }
        return Math.abs(missingElement);
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findRepeatedNumber(arr, n);

        System.out.println(result);
    }
}
