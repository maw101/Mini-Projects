/**
 * The AdditivePersistence program calculates the additive persistence
 * of a number, defined as how many loops you have to sum its digits
 * for until you get a single digit. The total number of iterations 
 * is the additive persistence of the number, this is printed to the
 * standard output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-08-07
 */
public class AdditivePersistence {

	/**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        printAdditivePersistence(123); // 1
        printAdditivePersistence(299); // 2
    }

    public static void printAdditivePersistence(long num) {
        long persistence = 1;
        long sum = sumDigits(num);
        while (sum >= 10) { // still digits to process
            sum = sumDigits(sum);
            persistence++;
        }
        System.out.println("Additive Persistence (of " + num + ") is: " + persistence);
    }

    private static long sumDigits(long d) {
        return d >= 10 ? d % 10 + sumDigits(d / 10) : d;
    }

}