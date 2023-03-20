package Games;

import java.sql.SQLOutput;

public class MaxStones {
    public static boolean whoWins(int totalStones) {
        if (totalStones % 4 == 0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        int totalStones = 6;
        boolean iWin = whoWins(totalStones);
        if (iWin) {
            System.out.println("I won the game");
        } else {
            System.out.println("He won the game");
        }
    }
}
