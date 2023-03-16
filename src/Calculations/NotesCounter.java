package Calculations;
import java.util.*;

public class NotesCounter {
    static int count(int note, int amount) {
        int i;
        for(i = 0; amount>0; i++) {
            if(amount < note) break;
            amount -= note;
        }
        return i;
    }
    static int printOutput(int note, int totalAmount) {
        int c = count(note, totalAmount);
        System.out.print(c + " x " + note + "'s ");
        System.out.print(c != 1 ? "notes" : "note" );
        return totalAmount - c*note;
    }
    public static void main(String[] args) {
        //taking input from user
        System.out.println("Enter amount: ");
        Scanner sc = new Scanner(System.in);
        int totalAmount = sc.nextInt();
        int arr[] = {2000, 500, 100, 50, 10, 5, 2, 1};
        //showing the results
        for (int note: arr) {
            if(totalAmount < note) continue;
            totalAmount = printOutput(note, totalAmount);
            System.out.println(totalAmount == 0 ? "" : ", ");
        }
        System.out.println("are required!");
    }
}
