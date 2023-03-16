package DSA.Recursion;

public class Power {
    static double myPow(double a, int n) {
        if(n == 0) return 1;
        if(n > 0) return a*myPow(a, n-1);
        return 1/a*myPow(a, n+1);
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -4));
    }
}
