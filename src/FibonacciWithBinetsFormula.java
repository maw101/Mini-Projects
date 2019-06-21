/**
 * The FibonacciWithBinetsFormula program implements an application that
 * displays the nth Fibonacci number to the standard output calculated
 * through use of Binet's formula.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-21
 */
public class FibonacciWithBinetsFormula {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(3)); // 2
        System.out.println(fibonacciNumber(6)); // 8
        System.out.println(fibonacciNumber(9)); // 34
        System.out.println(fibonacciNumber(15)); // 610
        System.out.println(fibonacciNumber(20)); // 6765
    }

    private static int fibonacciNumber(int n) {
        // using Binet's Formula
        double phi = (Math.sqrt(5) + 1) / 2;
        return (int) Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }

}