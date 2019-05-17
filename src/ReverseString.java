public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("test"));
        System.out.println(reverseString("eat"));
        System.out.println(reverseString("command"));
        System.out.println(reverseString("constant"));
        System.out.println(reverseString("habit"));
    }

    private static String reverseString(String input) {
        String reversedString = "";
        for (int i = (input.length() - 1); i >= 0; i--) {
            reversedString += input.charAt(i);
        }
        return reversedString;
    }

}