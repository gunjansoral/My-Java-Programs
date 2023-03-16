package Games;
import java.util.*;
import java.lang.String;

public class RockPaperScissor {
    public static String display(int playerInput) {
        switch (playerInput) {
            case 1:
                return "paper";
            case 2:
                return "scissor";
            case 3:
                return "rock";
            default:
                return "Please enter between 1 and 3";
        }
    }

    public static void main(String[] args) {

        // initialize variables
        int userScore = 0;
        int compScore = 0;
        String winner = "";

        while (userScore < 5 || compScore < 5) {
            // taking input from user
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();

            System.out.println(display(userInput));

            // generating random input from computer
            int compInput = (int) (Math.random() * 3 + 1);
            System.out.println(display(compInput));

            // comparing userInput from compInput and updating the scores
            if (userInput > compInput && userInput <= 3) {
                userScore++;
            } else if (userInput < compInput) {
                compScore++;
            }
            System.out.println("Scores -> User: " + userScore + ", Computer: " + compScore);
            if (userScore >= 5) {
                winner = "User";
                break;
            }
            if (compScore >= 5) {
                winner = "Computer";
                break;
            }
        }
        // showing the results
        System.out.println(winner + " wins!");
    }
}
