/**
 * The FibonacciWithRecursion program implements an application that
 * displays the nth Fibonacci number to the standard output calculated
 * through use of recursion.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-18
 */
public class FibonacciWithRecursion {

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
        if (n <= 1)
            return n;
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

}