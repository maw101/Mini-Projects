public class CaesarCipher {

    public static void main(String[] args) {
        System.out.println(caesarEncrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 27)); // BCDEFGHIJKLMNOPQRSTUVWXYZA
        System.out.println(caesarDecrypt("BCDEFGHIJKLMNOPQRSTUVWXYZA", 27)); // ABCDEFGHIJKLMNOPQRSTUVWXYZ

        System.out.println(caesarEncrypt("This is just a test for the Caesar Cipher!", 9)); // Cqrb rb sdbc j cnbc oxa cqn Ljnbja Lryqna!
        System.out.println(caesarDecrypt("Cqrb rb sdbc j cnbc oxa cqn Ljnbja Lryqna!", 9)); // This is just a test for the Caesar Cipher!
        
        System.out.println(caesarEncrypt("Another test with punctuation !@£$%^&*()_\"/?", 22)); // Wjkpdan paop sepd lqjypqwpekj !@£$%^&*()_"/?
        System.out.println(caesarDecrypt("Wjkpdan paop sepd lqjypqwpekj !@£$%^&*()_\"/?", 22)); // Another test with punctuation !@£$%^&*()_"/?
    }

    private static String caesar(String text, int key) {
        String outputText = "";
        char currentChar;

        for (int currentPos = 0; currentPos < text.length(); currentPos++) {
            currentChar = text.charAt(currentPos);

            if (currentChar >= 'a' && currentChar <= 'z') { // lowercase
                outputText += (char) (mod((currentChar - 'a' + key), 26) + 'a'); // (i-th char of text + shift (key)) mod 26
            } else if (currentChar >= 'A' && currentChar <= 'Z') { // uppercase {
                outputText += (char) (mod((currentChar - 'A' + key), 26) + 'A'); // (i-th char of text + shift (key)) mod 26
            } else {
                outputText += currentChar;
            }
        }
        return outputText;
    }

    private static String caesarEncrypt(String plaintext, int key) {
        return caesar(plaintext, key);
    }    

    private static String caesarDecrypt(String ciphertext, int key) {
        return caesar(ciphertext, -key);
    }

    // we cannot use remainder operator as we may have a -'ve 'a' value in the case of some decryptions
    private static int mod(int a, int b) {
        int ret = a % b;
        if (ret < 0)
            ret += b;
        return ret;
    }

}