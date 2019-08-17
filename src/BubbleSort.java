/**
 * The BubbleSort program implements an application that
 * implements the Bubble Sorting Algorithm.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-08-17
 */
public class BubbleSort {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] array = {9, 7, 8, 3, 6, 5, 4, 1, 2};
        printArray(array);
        bubbleSort(array);
        printArray(array);
    }

    private static void bubbleSort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "; ");
        System.out.println();
    }

}