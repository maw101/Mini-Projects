import java.lang.Character;

/**
 * The VigenereCipher program implements an application that
 * provides both encryption and decryption functions using 
 * the Vigenere Cipher algorithm when provided with text and 
 * a key.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-09
 */
public class VigenereCipher {

    // TODO: add support for lowercase characters in both the key and message

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(vigenereEncrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "AWONDERFULKEY")); // AXQQHJXMCUUPKNKDDUWKZPHHCX
        System.out.println(vigenereDecrypt("AXQQHJXMCUUPKNKDDUWKZPHHCX", "AWONDERFULKEY")); // ABCDEFGHIJKLMNOPQRSTUVWXYZ

        System.out.println(vigenereEncrypt("THIS IS JUST A TEST FOR THE CAESAR CIPHER!", "ADECENTKEY")); // TKMU MF CEWR A WIUX SHB XFE FEGWNK MMNHHV!
        System.out.println(vigenereDecrypt("TKMU VL NSSW C GXCX FRV XUX GYEVET PBZLCR!", "ADECENTKEY")); // THIS IS JUST A TEST FOR THE CAESAR CIPHER!
        
        System.out.println(vigenereEncrypt("ANOTHER TEST WITH PUNCTUATION !@£$%^&*()_\"/?", "ASLIGHTLYLONGERKEY")); // AFZBNLK RPGG AZDL PMYKZBTEGZB !@£$%^&*()_"/?
        System.out.println(vigenereDecrypt("AFZBNLK RPGG AZDL PMYKZBTEGZB !@£$%^&*()_\"/?", "ASLIGHTLYLONGERKEY")); // ANOTHER TEST WITH PUNCTUATION !@£$%^&*()_"/?
    }

    private static String vigenereEncrypt(String plaintext, String key) {
        StringBuilder outputText = new StringBuilder();
        String cyclicKey;
        char currentChar;
        char currentKeyChar;

        cyclicKey = generateCyclicKey(plaintext, key);

        for (int currentPos = 0; currentPos < plaintext.length(); currentPos++) {
            currentChar = Character.toUpperCase(plaintext.charAt(currentPos));
            currentKeyChar = cyclicKey.charAt(currentPos);

            if (currentChar >= 'A' && currentChar <= 'Z') { // uppercase
                outputText.append((char) (((currentChar + currentKeyChar) % 26) + 'A')); // (i-th char of text + i-th char of cyclic key) mod 26
            } else {
                outputText.append(currentChar);
            }
        }
        return outputText.toString();
    }  

    private static String vigenereDecrypt(String ciphertext, String key) {
        StringBuilder outputText = new StringBuilder();
        String cyclicKey;
        char currentChar;
        char currentKeyChar;
        
        cyclicKey = generateCyclicKey(ciphertext, key);

        for (int currentPos = 0; currentPos < ciphertext.length(); currentPos++) {
            currentChar = Character.toUpperCase(ciphertext.charAt(currentPos));
            currentKeyChar = cyclicKey.charAt(currentPos);

            if (currentChar >= 'A' && currentChar <= 'Z') { // uppercase
                outputText.append((char) ((((currentChar - currentKeyChar) + 26) % 26) + 'A')); // (i-th char of text - i-th char of cyclic key + 26) mod 26
            } else {
                outputText.append(currentChar);
            }
        }
        return outputText.toString();
    }

    private static String generateCyclicKey(String message, String key) {
        StringBuilder cyclicKey = new StringBuilder();
        // generate cyclic key - ie repeat current key until length of text
        for (int posInCyclicKey = 0, posInKey = 0; posInCyclicKey < message.length(); ++posInCyclicKey, ++posInKey){
            if (posInKey == key.length()) { // if we have reached the end of the given key, loop again
                posInKey = 0;
            }
            cyclicKey.append(key.charAt(posInKey));
        }
        return cyclicKey.toString();
    }

}