/**
 * The ReverseString program implements an application that provides
 * a reversed version of the string input. It simply displays this
 * reversed output to the standard output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-05-17
 */
public class ReverseString {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(reverseString("test")); // tset
        System.out.println(reverseString("eat")); // tae
        System.out.println(reverseString("command")); // dnammoc
        System.out.println(reverseString("constant")); // tnatsnoc
        System.out.println(reverseString("habit")); // tibah
    }

    private static String reverseString(String input) {
        String reversedString = "";
        for (int i = (input.length() - 1); i >= 0; i--) {
            reversedString += input.charAt(i);
        }
        return reversedString;
    }

}