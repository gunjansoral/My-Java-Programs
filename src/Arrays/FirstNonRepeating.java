package Arrays;

import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int answer = firstNonRepeating(arr);
        if (answer != 0)
            System.out.print(answer);
        else
            System.out.print("All elements are repeated");
    }

    static int firstNonRepeating(int arr[]) {
        //write your logic here
        int firstNonRepeated = 0;
        int r = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int element = arr[Math.abs(arr[i] % n)];
            if (element < 0) {
                firstNonRepeated = arr[Math.abs(arr[i] % n)];
                break;
            }
            arr[Math.abs(arr[i] % n)] = -arr[Math.abs(arr[i] % n)];
        }
        for (int i = 0; i < n; i++) {
            if (Math.abs(arr[i]) == Math.abs(firstNonRepeated)) {
                r = Math.abs(arr[i]);
                break;
            }
        }
        return r;
    }
}
