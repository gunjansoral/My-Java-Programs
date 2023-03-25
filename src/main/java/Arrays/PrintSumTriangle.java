package Arrays;
import java.util.*;

public class PrintSumTriangle {
    public static void printSumTriangle(int[] A) {
        //Add code here
        if(A.length < 1) return;
        int[] B = new int[A.length-1];
        for(int i=0; i<B.length; i++) {
            B[i] = A[i] + A[i+1];
        }
        printSumTriangle(B);
        System.out.println(Arrays.toString(A));
    }

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] testcase = new int[n];

        for(int i=0; i<n; i++) {
            testcase[i] = sc.nextInt();
        }
        printSumTriangle(testcase);
    }
}
