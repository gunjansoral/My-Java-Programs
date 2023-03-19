package Arrays;

import java.util.*;

public class PrimeOrNot {
    public static int[] checkPrime(int[] arr) {
        int[] prime = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int j, m = 0, flag = 1;
            m = arr[i] / 2;
            if (arr[i] == 0 || arr[i] == 1) {
                flag = 0;
            } else {
                for (j = 2; j <= m; j++) {
                    if (arr[i] % j == 0) {
                        flag = 0;
                        break;
                    }
                }
            }
            prime[i] = flag;
        }
        return prime;
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = checkPrime(arr);

        for (int i = 0; i < res.length; i++) {
            if (i == res.length - 1) {
                System.out.print(res[i]);
            } else {
                System.out.print(res[i] + " ");
            }
        }
    }
}
