package DSA.Recursion;
import java.util.*;

public class SumOfDigits {
    public static int sum(int n) {
        //write your code here
        if(n <= 0) return 0;
        int digit = n%10;
        return digit + sum(n/10);
    }
    public static void main(String[] args) {
        //read the input number
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        //pass the number to sum() method
        System.out.println(sum(input));

    }
}
