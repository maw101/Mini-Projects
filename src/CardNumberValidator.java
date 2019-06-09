/**
 * The CardNumberValidator program implements an application that provides
 * validation of a given card number using Luhn's Algorithm. It simply 
 * displays if the given card number is valid or not to the standard output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-09
 */
public class CardNumberValidator {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(luhnAlgorithmTest("4002290601547596")); // valid - true
        System.out.println(luhnAlgorithmTest("4225543331542043")); // valid - true
        System.out.println(luhnAlgorithmTest("8989334267763821")); // invalid - false
        System.out.println(luhnAlgorithmTest("3463865")); // invalid - false
        System.out.println(luhnAlgorithmTest("12120267")); // valid - true
    }

    private static boolean luhnAlgorithmTest(String cardNumber) {
        int luhnSum = 0;
        int currentValue;
        String reverseCardNumber = new StringBuffer(cardNumber).reverse().toString();

        if (reverseCardNumber.length() <= 16) {
            for (int pos = 0; pos < reverseCardNumber.length(); pos++) {
                // get value
                currentValue = Integer.parseInt(String.valueOf(reverseCardNumber.charAt(pos)));
                if (pos % 2 != 0) { // for digits in even positions (!= used as zero based array)
                    // double value
                    currentValue *= 2;
                    // check if currentVal is made up of two digits
                    if (currentValue >= 10) {
                        // if it is, split it so the two digits that make up the number are added
                        currentValue = (1 + (currentValue % 10));
                    }
                }
                // add the given value, may have been doubled
                luhnSum += currentValue;
            }

            if (luhnSum % 10 == 0) { // is valid
                return true;
            }
        } else {
            System.err.println("Card Number length is >16");
        }
        return false;
    }

}