/**
 * The CollatzConjecture program implements an application that provides
 * a simulation of the Collatz Conjecture given a valid starting integer. 
 * It simply displays the count for the number of steps taken for the 
 * sequence to reach 1 again to the standard output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-05-17
 */
public class CollatzConjecture {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int startingNumber = Integer.parseInt(args[0]);
        System.out.println(solveCollatz(startingNumber));
    }

    private static int solveCollatz(int number) {
        if (number <= 1) {
            // we require number > 1
            return 0;
        } else if (number % 2 == 0) { 
            // If number even, divide by 2.
            return solveCollatz(number / 2) + 1; // adding one to the end for the count
        } else { 
            // If number odd, multiply by 3 and add 1.
            return solveCollatz((number * 3) + 1) + 1; // adding one to the end for the count
        }    
    }

}