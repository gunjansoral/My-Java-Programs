package Patterns;
import java.util.*;

public class StarPattern {
    static void printSpace(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(" ");
        printSpace(num - 1);
    }

    // function for print stars
    static void printStars(int star) {
        if (star == 0) {
            return;
        }
        System.out.print("* ");
        printStars(star - 1);
    }

    // function to print the pattern
    static void pattern(int n, int num) {
        if (n == 0) {
            return;
        }
        printSpace(n - 1);
        printStars(num - n + 1);
        System.out.println();
        pattern(n - 1, num);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        pattern(num, num);
    }
}
