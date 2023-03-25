package DSA.Recursion;
import java.util.*;

public class ReverseNumber {
    // Method to reverse the digits of an integer
    static int temp = 0;
    static void reverseInteger(int n) {
        // Write your code here
        if(n>0) {
            if(n<10) {
                temp+=n;
                return;
            }
            temp = temp*10 + n%10*10;
            reverseInteger(n/10);
        }
        if(n<0) {
            n=Math.abs(n);
            if(n<10) {
                temp+=n;
                return;
            }
            temp = temp*10 + n%10*10;
            reverseInteger(n/10);
            if(temp > 0) temp = -temp;
        }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        reverseInteger(n);
        System.out.print(temp);
    }
}
