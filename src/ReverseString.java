public class ReverseString {

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