package DSA.Recursion;

public class SumOfNNaturalNumbers {
    static int sum(int n){
        //base condition
        if(n <= 0) return 0;
        //logic
        //recursive call

        return n + sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(-1));
    }
}
