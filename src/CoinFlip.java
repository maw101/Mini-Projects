import java.util.Random;

/**
 * The CoinFlip program implements an application that provides
 * a simulation of n coin flips. It simply displays counts for 
 * both the number of heads flipped and the number of tails 
 * that are flipped to the standard output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-05-17
 */
public class CoinFlip {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int numCoins = Integer.parseInt(args[0]);
        flipManyCoins(numCoins);
    }

    private static void flipManyCoins(int coinsToFlip) {
        int countHeads = 0;
        int countTails = 0;
        for (int i = 0; i < coinsToFlip; i++) {
            if (coinFlipIsHead()) {
                System.out.print("H");
                countHeads++;
            } else {
                System.out.print("T");
                countTails++;
            }
        }
        System.out.println();
        System.out.println("Number of HEADS: " + countHeads);
        System.out.println("Number of TAILS: " + countTails);
    }

    private static boolean coinFlipIsHead() {
        Random rand = new Random();
        return rand.nextInt(2) == 0;
    }

}