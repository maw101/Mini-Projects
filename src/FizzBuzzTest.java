/**
 * The FizzBuzzTest program implements an application that displays the result
 * of the fizz buzz test to the standard output for numbers 1 through 100.
 *
 * The test goes as follows:
 *  "Write a program that prints the numbers from 1 to 100. But for multiples of
 *  three print “Fizz” instead of the number and for the multiples of five print
 *  “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”."
 *  (http://wiki.c2.com/?FizzBuzzTest)
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-09
 */
public class FizzBuzzTest {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        fizzBuzz();
    }

    private static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) { // common multiple of 3 and 5
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // multiple of 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // multiple of 5
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}