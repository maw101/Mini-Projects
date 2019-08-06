import java.util.*;

/**
 * The SierpinskiTriangle program implements an application that outputs
 * a Sierpinski Triangle of order 'size' to the standard output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-08-06
 */
public class SierpinskiTriangle {

    public static void printSierpinskiTriangle(int size) {
        int n = 1 << size; // logical bit shift
        for (int y = n-1; y >= 0; y--) {
            for (int i = 0; i < y; i++)
                System.out.print(" ");
            for (int x = 0; x+y < n; x++) {
                if ((x & y) != 0)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        printSierpinskiTriangle(4);
    }
}