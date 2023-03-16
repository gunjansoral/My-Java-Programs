package DSA.Recursion;

public class IsPowerOf {
    static boolean powerOf(int n, int p) {
        if(n <= 0) return false;
        if(n == p) return true;
        if( n%p != 0) return false;
        return powerOf(n/p, p);
    }

    public static void main(String[] args) {
        System.out.println(powerOf(33, 2));
    }
}
