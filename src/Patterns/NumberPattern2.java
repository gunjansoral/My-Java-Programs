package Patterns;

public class NumberPattern2 {
    public static void main(String[] args) {
        //rows print
        int n = 5;
        for(int i = 0; i< n; i++) {
            //columns print
            for(int j = 1; j<=n-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
