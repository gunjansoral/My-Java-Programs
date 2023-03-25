package Patterns;

public class NumberPattern3 {
    public static void main(String[] args) {
        //rows print
        int n = 5;
        for(int i = 0; i< n; i++) {
            //print space
            for (int j = 0; j<=i; j++) {
                System.out.print("  ");
            }
            //columns print
            for(int j = i+1; j<=n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
