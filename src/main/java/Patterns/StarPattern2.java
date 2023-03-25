package Patterns;

import java.util.Scanner;

public class StarPattern2 {
    public static void main(String[] args) {
        //taking input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i<n; i++) {
            for(int j = 1; j<n-i; j++)
                System.out.print(" ");
            for(int j = 1; j<=2*i+1; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i = n-1; i>=1; i--) {
            for(int j = 1; j<=n-i; j++)
                System.out.print(" ");
            for(int j = 3 ; j<=2*i+1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
