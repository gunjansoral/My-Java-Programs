package Patterns;

public class NumberPattern5 {
    public static void main(String[] args) {
        int n = 5;
        int plus = 1;
        //rows print
        for(int i = 1; i<= n-1; i++) {
            //print left space
            for (int j = 1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            //column 1 print
            System.out.print("1");
            //print inner space
            for(int j = 1; j<i*2-2; j++) {
                System.out.print(" ");
            }
            //print right column
            if (i > 1) {
                System.out.print("2");
            }
            System.out.println();
        }
        //print last row
        for(int i = 1; i<n*2; i++) {
            System.out.print(i);
        }
    }
}
