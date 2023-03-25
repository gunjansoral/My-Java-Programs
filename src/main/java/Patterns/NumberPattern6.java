package Patterns;

public class NumberPattern6 {
    public static void main(String[] args) {
        System.out.println("Enter a number for spiral pattern :");
        int n = Util.getInput();
        for(int r = 1; r<=n; r++) {
            int p = 1;
            for(int c = 1; c<r; c++) {
                System.out.print(p+"  ");
                p++;
            }
            for(int c = r; c<=2*n-r; c++) {
                System.out.print(p+"  ");
            }
            for(int c = n-r+1; c<n; c++) {
                p--;
                System.out.print(p+"  ");
            }
            System.out.println();
        }

        for(int r = 1; r<=n-1; r++) {
            int p = 1;
            for(int c = r; c<n; c++) {
                System.out.print(p+"  ");
                p++;
            }
            p--;
            for(int c = 1; c<=2*r; c++) {
                System.out.print(p+"  ");
            }
            for(int c = n-r-1; c>0; c--) {
                p--;
                System.out.print(p+"  ");
            }
            System.out.println();
        }
    }
}
