/**
 * The Palindrome program implements an application that
 * displays whether a given string is a palindrome to
 * the standard output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-07-12
 */
public class Palindrome {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("NOTPAL")); // false
        System.out.println(isPalindrome("Palindrome")); // false
        System.out.println(isPalindrome("abcdba")); // false
        System.out.println(isPalindrome("Avide fdiva.")); // false
        System.out.println(isPalindrome("DaD")); // true
        System.out.println(isPalindrome("A but tuba")); // true
        System.out.println(isPalindrome("alula")); // true
        System.out.println(isPalindrome("abcba")); // true
        System.out.println(isPalindrome("Art, name no tub time. Emit but one mantra.")); // true
        System.out.println(isPalindrome("Avid diva.")); // true
    }

    private static boolean isPalindrome(String str) {
        int left, right;
        str = str.replaceAll("[^a-zA-Z]", "").toUpperCase(); // remove non alphabetical chars
        left = 0;
        right = str.length() - 1;

        while (left < right) {
            // check if characters are equal
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}