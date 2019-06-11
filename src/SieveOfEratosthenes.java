/**
 * The SieveOfEratosthenes program implements an application that
 * provides an implementation of the Sieve of Eratosthenes prime
 * finding algorithm.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-11
 */
public class SieveOfEratosthenes {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(getTrueValueIndices(sieveOfEratosthenes(120))); // 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103 107 109 113
        System.out.println(getTrueValueIndices(sieveOfEratosthenes(1))); // error
        System.out.println(getTrueValueIndices(sieveOfEratosthenes(-10))); // error
        System.out.println(getTrueValueIndices(sieveOfEratosthenes(2))); // 2
        System.out.println(getTrueValueIndices(sieveOfEratosthenes(20))); // 2 3 5 7 11 13 17 19
    }

    private static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime;
        int p, i, j;

        if (n > 1) {
            isPrime = new boolean[n + 1];
            isPrime[0] = false;
            isPrime[1] = false;

            // initialize isPrimeArray to all true as any number i, 1 < i <= n, are candidates
            for (i = 2; i <= n; i++) {
                isPrime[i] = true;
            }

            // perform sieve
            p = 2; // start with first prime, 2

            while (p <= n) {
                // find next prime number i, found if isPrime[i] is true
                for (i = p; i <= n; i++) {
                    if (isPrime[i]) { // found next prime
                        break;
                    }
                }

                // set all multiples (>1) of i up to n to false
                for (j = (2*i); j <= n; j += i) {
                    isPrime[j] = false;
                }

                p = ++i;
            }

            return isPrime;
        } else {
            System.err.println("n must be >1");
            return null;
        }
    }

    private static String getTrueValueIndices(boolean[] a) {
        String output = "";
        if (a != null) {
            for (int i = 0; i < a.length; i++) {
                if (a[i]) {
                    output += i;
                    output += " ";
                }
            }
        }
        return output;
    }

}