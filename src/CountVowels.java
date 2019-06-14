/**
 * The CountVowels program implements an application that
 * displays the total number of vowels in a string along
 * with counts for each individual vowel to the standard
 * output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-10
 */
public class CountVowels {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(vowelCountFormat(vowelCount("aeiou"))); // 5 1a 1e 1i 1o 1u
        System.out.println(vowelCountFormat(vowelCount("aeiouu"))); // 6 a e i o u
        System.out.println(vowelCountFormat(vowelCount("QxmjtGb9Bp"))); // 0
        System.out.println(vowelCountFormat(vowelCount("L7igNyno6x"))); // 2 0a 0e 1i 1o 0u
        System.out.println(vowelCountFormat(vowelCount("Gd2gdrt5dy"))); // 0
        System.out.println(vowelCountFormat(vowelCount("avxpH rxVIe"))); // 3 1a 1e 1i 0o 0u
        System.out.println(vowelCountFormat(vowelCount("1kfp3zY1NR"))); // 0
        System.out.println(vowelCountFormat(vowelCount("oHHRLNk hpd"))); // 1 0a 0e 0i 1o 0u
        System.out.println(vowelCountFormat(vowelCount("nr sVDfXuBm"))); // 1 0a 0e 0i 0o 1u
        System.out.println(vowelCountFormat(vowelCount("PA2IXxbcfm"))); // 2 1a 0e 1i 0o 0u
        System.out.println(vowelCountFormat(vowelCount("hjpIVKnEIn"))); // 3 0a 1e 2i 0o 0u
        System.out.println(vowelCountFormat(vowelCount("poWd55ww il"))); // 2 0a 0e 1i 1o 0u
    }

    private static int[] vowelCount(String str) {
        int[] counts = new int[5]; // A E I O U
        char currentChar;

        for (int characterPos = 0; characterPos < str.length(); characterPos++) {
            currentChar = Character.toUpperCase(str.charAt(characterPos));
            switch (currentChar) {
                case 'A':   counts[0] += 1; break;
                case 'E':   counts[1] += 1; break;
                case 'I':   counts[2] += 1; break;
                case 'O':   counts[3] += 1; break;
                case 'U':   counts[4] += 1; break;
            }
        }

        return counts;
    }

    private static String vowelCountFormat(int[] counts) {
        return  "" + (counts[0] + counts[1] + counts[2] + counts[3] + counts[4]) + " " +
                counts[0] + "a " +
                counts[1] + "e " +
                counts[2] + "i " +
                counts[3] + "o " +
                counts[4] + "u ";
    }

}
