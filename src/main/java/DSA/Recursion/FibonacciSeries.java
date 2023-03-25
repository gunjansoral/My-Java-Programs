package DSA.Recursion;

public class FibonacciSeries {
    static int fibo(int n){
        //base condition
        if( n< 0 ) return -1;
        if( n<=1 ) return n;
        //logic
        int current = fibo(n-2) + fibo(n-1);
        return current;
    }
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }
}