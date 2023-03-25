package DSA.Recursion;

import java.util.Scanner;

public class GCD {
    static int gcd(int first, int second) {
        if(first == 0 || first == second) return second;
        if(second == 0) return first;
        int ans = 0;
        if(first > second) return gcd(first - second, second);
        if(first < second) return gcd(first, second - first);
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        System.out.println(gcd(first, second));
    }
}
