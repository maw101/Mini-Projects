import java.util.Random;

public class CoinFlip {

    private static Random rand = new Random();

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
        return rand.nextInt(2) == 0;
    }

}