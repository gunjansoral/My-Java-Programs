package Arrays;

import java.util.*;

public class SumOfDigits {
    static int recursiveSumDigits(int n) {
        if (n < 10) return n;
        return n % 10 + recursiveSumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursiveSumDigits(n));
    }
}
