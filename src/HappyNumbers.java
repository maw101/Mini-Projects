import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * The HappyNumbers program implements an application that
 * displays the first N happy numbers to the standard
 * output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-12
 */
public class HappyNumbers {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findNHappyNumbers(8))); // 1, 7, 10, 13, 19, 23, 28, 31
        System.out.println(Arrays.toString(findNHappyNumbers(10))); // 1, 7, 10, 13, 19, 23, 28, 31, 32, 44
    }

    private static long[] findNHappyNumbers(int n) {
        long[] happyNumbers = new long[n];
        int happyNumberCount = 0;

        for (long currentNumber = 0; happyNumberCount < n; currentNumber++) {
            if (isHappyNumber(currentNumber)) {
                happyNumbers[happyNumberCount] = currentNumber;
                happyNumberCount++;
            }
        }
        return happyNumbers;
    }

    private static boolean isHappyNumber(long number) {
        long sum;
        int digit;
        Set<Long> numbersCycle = new HashSet<>(); // used to store a potential cycle

        while ((number != 1) && (numbersCycle.add(number))) { // while number not 1 and we are not going in a cycle
            sum = 0;
            while (number > 0) { // find square of each digit in turn and sum them
                digit = (int) (number % 10);
                sum += digit * digit;
                number /= 10;
            }
            number = sum;
        }
        return (number == 1);
    }
}
