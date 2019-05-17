/**
* An application which implements Scarne's Dice game.
* 
* If roll a 1, score no points and lose turn. If roll a
* 2 to 6, add the rolled value to points and choose to reroll
* or keep score and end turn. Winner is first player who reaches
* a given number of points.
*/

import java.util.Random;
import java.util.Scanner;

public class ScarnesDice {

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