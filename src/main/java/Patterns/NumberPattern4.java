package Patterns;

public class NumberPattern4 {
    public static void main(String[] args) {
        int n = 5;
        int plus = 1;
        //rows print
        for(int i = 1; i<= n; i++) {
            //print space
            for (int j = 1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            //columns print
            for(int j = 1; j<=plus; j++) {
                System.out.print(j);
            }
            plus +=2;
            System.out.println();
        }
    }
}
