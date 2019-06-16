/**
 * The ReturnChange program implements an application that
 * displays the break down of change in coins and notes
 * when given an amount in pence to the standard output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-16
 */
public class ReturnChange {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(getChange(5953)); // 1x£50 Note 1x£5 Note 4xPound 1x50p 1x2p 1x1p
        System.out.println(getChange(2330)); // 1x£20 Note 3xPound 1x20p 1x10p
        System.out.println(getChange(1794)); // 1x£10 Note 1x£5 Note 2xPound 1x50p 2x20p 2x2p
        System.out.println(getChange(1090)); // 1x£10 Note 1x50p 2x20p
        System.out.println(getChange(614)); // 1x£5 Note 1xPound 1x10p 2x2p
        System.out.println(getChange(123)); // 1xPound 1x20p 1x2p 1x1p
        System.out.println(getChange(100)); // 1xPound
        System.out.println(getChange(57)); // 1x50p 1x5p 1x2p
        System.out.println(getChange(58)); // 1x50p 1x5p 1x2p 1x1p
        System.out.println(getChange(68)); // 1x50p 1x10p 1x5p 1x2p 1x1p
        System.out.println(getChange(77)); // 1x50p 1x20p 1x5p 1x2p
    }

    private static String getChange(int pence) {
        String out = "";
        int[] denominations = new int[] {5000, 2000, 1000 ,500 ,100, 50, 20, 10, 5, 2, 1};
        String[] denominationNames = new String[] {"£50 Note", "£20 Note", "£10 Note", "£5 Note", "Pound", "50p", "20p", "10p", "5p", "2p", "1p"};
        int quantity, i;

        i = 0;
        // for each denomination work out the quantity
        while ((pence > 0) && (i < denominations.length)) {
            quantity = (int) (pence / denominations[i]);
            if (quantity != 0) {
                pence = pence % denominations[i];
                out += quantity;
                out += "x" + denominationNames[i] + " ";
            }
            i++;
        }

        return out;
    }

}