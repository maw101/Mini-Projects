/**
 * The CountWordsInString program implements an application that
 * displays the total number of words in a string to the standard
 * output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-10
 */
public class CountWordsInString {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(wordCount("1 2 3 4 5 6 7 8")); // 8
        System.out.println(wordCount("One and only")); // 3
        System.out.println(wordCount("The quick brown fox.")); // 4
        System.out.println(wordCount("The quick brown fox jumps \tover the lazy dog\n")); // 9
        System.out.println(wordCount("It was getting dark, and we weren’t there yet.")); // 9
        System.out.println(wordCount("The book is in \tfront\n of the table.")); // 8
    }

    private static int wordCount(String in) {
        int count = 0;
        boolean newWord = true;

        for (int i = 0; i < in.length(); i++) {
            if ((in.charAt(i) == ' ') || (in.charAt(i) == '\t') || (in.charAt(i) == '\n')) {
                newWord = true;
            } else if (newWord) {
                count++;
                newWord = false;
            }
        }

        return count;
    }

}