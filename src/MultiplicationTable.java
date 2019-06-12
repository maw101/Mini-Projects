/**
 * The MultiplicationTable program implements an application that provides
 * a formatted multiplication table upto a given integer n. It simply displays  
 * a table containing each number up to the given n on both axis and 
 * provides the value when the row is multiplied by the column. This is
 * displayed to the standard output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-05-17
 */
public class MultiplicationTable {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int dimension = Integer.parseInt(args[0]);
        generateMultiplicationTable(dimension);
    }

    private static void generateMultiplicationTable(int dimension) {
        // print headings
        for (int i = 1; i <= dimension; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        
        // print seperator
        System.out.println();
        
        // print print each row in turn
        for (int i = 1; i <= dimension; i++) {
            System.out.print(i + " -");
            for (int j = 1; j <= dimension; j++) {
                System.out.print("\t" + i*j);
            }
            System.out.println();
        }
    }

}
