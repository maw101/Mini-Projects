/**
 * The FibonacciFromLastTwoFibNumbers program implements an application that
 * displays the nth Fibonacci number to the standard output calculated
 * through use of the previous two Fibonacci numbers.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-20
 */
public class FibonacciFromLastTwoFibNumbers {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(fibonacciNumberFromPreviousTwo(3)); // 2
        System.out.println(fibonacciNumberFromPreviousTwo(6)); // 8
        System.out.println(fibonacciNumberFromPreviousTwo(9)); // 34
        System.out.println(fibonacciNumberFromPreviousTwo(15)); // 610
        System.out.println(fibonacciNumberFromPreviousTwo(20)); // 6765
    }

    private static int fibonacciNumberFromPreviousTwo(int n) {
        int twoBack = 0;
        int oneBack = 1;
        int currentFib = 0;
        if (n == 0)
            return twoBack;
        for (int fibCount = 2; fibCount < n; fibCount++) {
            currentFib = oneBack + twoBack;
            twoBack = oneBack;
            oneBack = currentFib;
        }
        return currentFib;
    }

}