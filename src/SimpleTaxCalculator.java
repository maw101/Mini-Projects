/**
 * The SimpleTaxCalculator program implements an application that
 * calculates a final cost by adding a percentage of tax to the 
 * untaxed cost and displays this to standard output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-25
 */
public class SimpleTaxCalculator {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(calcCostWithTax(35.17, 17.5)); // 41.32475
        System.out.println(calcCostWithTax(10.00, 20)); // 12.0
    }

    private static double calcCostWithTax(double cost, double taxPercentage) {
        return cost * (1 + (taxPercentage / 100));
    }

}