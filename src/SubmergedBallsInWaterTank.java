/**
 * The SubmergedBallsInWaterTank program implements an application that
 * determines if a water tank overflows given a number of balls are
 * submerged in it, the result is displayed to standard output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-08-05
 */
public class SubmergedBallsInWaterTank {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
      System.out.println("Overflows? " + determineIfOverflows(5, 2.5, 5, 2, 2)); // will overflow as water is already at max
      System.out.println("Overflows? " + determineIfOverflows(5, 2.5, 5, 0, 0)); // will not overflow as water is equal to max tank capacity
      System.out.println("Overflows? " + determineIfOverflows(5, 3, 4, 3, 0.5)); // will not overflow
    }

    private static boolean determineIfOverflows(double tankHeight, double tankRadius, double waterHeight, int numberOfBalls, double ballRadius) {
        final double tankMaxVolume = Math.PI * tankHeight * Math.pow(tankRadius, 2);
        final double waterVolume = Math.PI * waterHeight * Math.pow(tankRadius, 2);
        final double ballsVolume = numberOfBalls * ((4/3.0) * Math.PI * Math.pow(ballRadius, 3));
        final double ballAndWaterVolume = ballsVolume + waterVolume;

        // print calculation results
        System.out.println("Water Tank Capacity = " + tankMaxVolume);
        System.out.println("Water Volume = " + waterVolume);
        System.out.println("Volume of the Balls = " + ballsVolume);
        System.out.println("Water Volume + Balls Volume = " + ballAndWaterVolume);

        return ballAndWaterVolume > tankMaxVolume;
    }

}
