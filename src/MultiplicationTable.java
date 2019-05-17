public class MultiplicationTable {

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