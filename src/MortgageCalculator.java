/**
 * The MortgageCalculator program implements an application that
 * calculates both a fixed monthly payment amount or the remaining
 * loan balance for a mortgage and displays this to standard output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-23
 */
public class MortgageCalculator {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(calcFixedMonthlyPayment(139000, 240, 0.05/12)); // 917.34 (rounded)
        System.out.println(calcFixedMonthlyPayment(210000, 360, 0.06/12)); // 1259.06 (rounded)

        System.out.println(calcRemainingLoanBalance(139000,19,240, 0.05/12)); // ~132328.00 (rounded)
        System.out.println(calcRemainingLoanBalance(210000,65,360, 0.06/12)); // ~193990.05 (rounded)
    }

    private static double calcFixedMonthlyPayment(double loanValue, int numberOfMonths, double monthlyInterestRateAsDecimal) {
        double compoundInterestCompounded = Math.pow((1 + monthlyInterestRateAsDecimal), numberOfMonths);
        return loanValue * (monthlyInterestRateAsDecimal * compoundInterestCompounded) / (compoundInterestCompounded - 1);
    }

    private static double calcRemainingLoanBalance(double startingLoanValue, int numberOfMonthsPaid, int numberOfMonthsInTerm, double monthlyInterestRateAsDecimal) {
        double compoundInterestForTerm = Math.pow((1 + monthlyInterestRateAsDecimal), numberOfMonthsInTerm);
        double compoundInterestPaid = Math.pow((1 + monthlyInterestRateAsDecimal), numberOfMonthsPaid);
        return startingLoanValue * (compoundInterestForTerm - compoundInterestPaid) / (compoundInterestForTerm - 1);
    }

}