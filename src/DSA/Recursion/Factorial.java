package DSA.Recursion;

public class Factorial {
    static int Fact(int n) {
        //Base Condition
        if(n <= 1) return 1;

        //logic
        return n*Fact(n-1);
    }

    public static void main(String[] args) {
        System.out.println(Fact(5));
    }
}
