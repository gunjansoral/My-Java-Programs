package Patterns;

public class NumberPattern {
    public static void main(String args[]) throws Exception {
        // write your code here
        int n = 20;
        int c = 4;
        int temp = n;
        // for rows
        for (int i = 1; i <= n / 2; i += (c + 1)) {
            // for spaces
            for (int j = 0; j <= 4 - c; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            // for first column
            for (int j = i + 1; j <= (c + (i - 1)); j++) {
                // print
                System.out.print("*" + j);
            }
            // for second column
            for (int j = temp - (c - 1); j <= temp; j++) {
                // print
                System.out.print("*" + j);
            }
            temp -= c;
            c--;
            System.out.println();
        }
    }
}
