public class CollatzConjecture {

    public static void main(String[] args) {
        int startingNumber = Integer.parseInt(args[0]);
        System.out.println(solveCollatz(startingNumber));
    }

    private static int solveCollatz(int number) {
        if (number <= 1) {
            // we require number > 1
            return 0;
        } else if (number % 2 == 0) { 
            // If number even, divide by 2.
            return solveCollatz(number / 2) + 1; // adding one to the end for the count
        } else { 
            // If number odd, multiply by 3 and add 1.
            return solveCollatz((number * 3) + 1) + 1; // adding one to the end for the count
        }    
    }

}