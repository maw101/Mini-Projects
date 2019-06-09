/**
 * The NumberWordEquivalent program implements an application that provides
 * a formatted word equivalent of a given integer n. It simply displays  
 * the description of the given number to the standard output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-10
 */
public class NumberWordEquivalent {

    private static final String[] units = new String[]
            {
                    "Zero", "One", "Two",
                    "Three", "Four", "Five",
                    "Six", "Seven", "Eight",
                    "Nine", "Ten", "Eleven",
                    "Twelve", "Thirteen",
                    "Fourteen", "Fifteen",
                    "Sixteen", "Seventeen",
                    "Eighteen", "Nineteen"
            };

    private static final String[] tens = new String[]
            {
                    " ", " ", "Twenty", "Thirty",
                    "Forty", "Fifty","Sixty",
                    "Seventy", "Eighty", "Ninety"
            };

    private static final String[] powers = new String[]
            {
                    " Hundred", " Thousand",
                    " Hundred Thousand", " Million"
            };

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(numberToWords(1)); // One
        System.out.println(numberToWords(12)); // Twelve
        System.out.println(numberToWords(123)); // One Hundred Twenty Three
        System.out.println(numberToWords(1234)); // One Thousand Two Hundred Thirty Four
        System.out.println(numberToWords(12345)); // Twelve Thousand Three Hundred Forty Five
        System.out.println(numberToWords(123456)); // One Hundred Thousand Twenty Three Thousand Four Hundred Fifty Six
        System.out.println(numberToWords(1234567)); // Twelve Hundred Thousand Thirty Four Thousand Five Hundred Sixty Seven
        System.out.println(numberToWords(12345678)); // One Million Twenty Three Hundred Thousand Forty Five Thousand Six Hundred Seventy Eight
        System.out.println(numberToWords(123456789)); // Twelve Million Thirty Four Hundred Thousand Fifty Six Thousand Seven Hundred Eighty Nine
        System.out.println(numberToWords(103)); // One Hundred Three
    }

    private static String numberToWords(final int number) {
        if (number < 20) {
            return units[number];
        } else if (number < 100) {
            return tens[number / 10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
        } else if (number < 1000) {
            return units[number / 100] + powers[0] + ((number % 100 != 0) ? " " : "") + numberToWords(number % 100);
        } else if (number < 100000) {
            return numberToWords(number / 1000) + powers[1] + ((number % 10000 != 0) ? " " : "") + numberToWords(number % 1000);
        } else if (number < 10000000) {
            return numberToWords(number / 100000) + powers[2] + ((number % 100000 != 0) ? " " : "") + numberToWords(number % 100000);
        }
        return numberToWords(number / 10000000) + powers[3] + ((number % 10000000 != 0) ? " " : "") + numberToWords(number % 10000000);
    }

}