package BasicPrograms;
import java.util.Scanner;

import static java.lang.Math.max;

public class GCD {
    static int gcd(int first, int second) {
        if(first == 0 || first == second) return second;
        if(second == 0) return first;
        int ans = 0;
        for(int i = 1; i< Math.min(first, second); i++) {
            if(first%i == 0 && second%i == 0) ans = i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        System.out.println(gcd(first, second));
    }
}
