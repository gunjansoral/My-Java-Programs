package DSA.Recursion;

import java.util.*;

public class CapitalizeWords {
    public static String[] toUpper(String[] arr, int i) {
        //base condition
        if(i>=arr.length) return arr;
        arr[i] = arr[i].toUpperCase();
        return toUpper(arr, i+1);
    }
    public static String[] convertToUpper(String[] arr) {
        //Add code here
        return toUpper(arr, 0);
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];

        sc.nextLine();
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextLine();
        }

        String[] res = convertToUpper(arr);
        for(int i=0; i<res.length; i++) {
            System.out.println(res[i]);
        }
    }
}