/**
 * The OneHundredDoors program implements an application that
 * displays the 100 doors problem to the standard output.
 *
 * The problem: 100 doors in a row initially closed. 100 passes 
 * made by the doors. First time through, each door visited and
 * the door is toggled (i.e. closed if open, opened if closed).
 * Second time through, only visit every 2nd door. Third time
 * only visit every 3rd door. Etc until reaching the 100th door.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-07-13
 */
public class OneHundredDoors {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        formatHundredDoors(hundredDoors()); // Formatted: 1,4,9,16,25,36,49,64,81,100
    }

    private static boolean[] hundredDoors() {
        boolean[] doors = new boolean[101]; // 101 as door 1 at index 1 not index 0

        for (int i = 1; i < doors.length; i++) // visit each door
            for (int j = i; j < doors.length; j += i) // toggle each jth door
                doors[j] = !doors[j];

        return doors;
    }

    private static void formatHundredDoors(boolean[] doors) {
        for (int i = 1; i < doors.length; i++)
            if (doors[i])
                System.out.println("Door " + i + " Open");
    }
}