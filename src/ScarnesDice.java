import java.util.Random;
import java.util.Scanner;

/**
 * The ScarnesDice program implements an application that provides
 * a simulation the Scarnes Dice game given a positive integer 
 * goal n. It facilitiates two players to play against each other
 * taking turns to roll a six-sided die and deciding to keep the 
 * number they rolled or reroll and hope for a better score if 
 * the roll was not 1.
 *
 * If roll a 1, score no points and lose turn. If roll a
 * 2 to 6, add the rolled value to points and choose to reroll
 * or keep score and end turn. Winner is first player who reaches
 * a given number of points.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-05-17
 */
public class ScarnesDice {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int scoreToStopAt = Integer.parseInt(args[0]);
        scarnesDiceGame(scoreToStopAt);
    }

    private static void scarnesDiceGame(int terminationScore) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int roll;
        int playerOneHighScore = 0;
        int playerTwoHighScore = 0;
        boolean playerOnesGo = true;
        boolean reroll;

        do {

            System.out.println();
            System.out.print("Player ");
            if (playerOnesGo) {
                System.out.print("One");
            } else {
                System.out.print("Two");
            }
            System.out.println(" to go: ");

            do {
                roll = rand.nextInt(6) + 1; // generate number between 1 and 6 inclusive
                
                System.out.println("Rolled a " + roll);
                reroll = false;
                
                if (roll == 1) {
                    System.out.println("No points added!");
                } else {
                    System.out.println("Reroll or keep score and end turn? ('R' or 'Q'): ");
                    if (in.nextLine().toUpperCase().equals("R")) {
                        reroll = true;
                    } else {
                        if (playerOnesGo) {
                            playerOneHighScore += roll;
                        } else {
                            playerTwoHighScore += roll;
                        }
                        System.out.println(roll + " points added!");
                    }
                }
            } while (reroll);

            playerOnesGo = !playerOnesGo;

        } while (
                (playerOneHighScore < terminationScore) && 
                (playerTwoHighScore < terminationScore)
            );

        System.out.println();
        System.out.println("Score to Reach: " + terminationScore);
        System.out.println("Player One's Score: " + playerOneHighScore);
        System.out.println("Player Two's Score: " + playerTwoHighScore);
    }

}