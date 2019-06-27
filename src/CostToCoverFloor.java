/**
 * The CostToCoverFloor program implements an application that
 * calculates the number of tiles required to cover a room given
 * both the rooms dimensions and the tiles dimensions. The 
 * application also calcualtes the cost for flooring given
 * room and tile dimensions along with the cost per tile.
 * These are displayed to standard output.
 *
 * @author  Matthew Williams
 * @version 1.0
 * @since   2019-06-27
 */
public class CostToCoverFloor {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(getCostForFlooring(12,2, 0.4,3.23)); // 193.80
        System.out.println(getCostForFlooring(2,3.4, 0.15,0.98)); // 45.08
    }

    private static int getNumberOfTilesRequired(double roomWidth, double roomHeight, double tileArea) {
        double roomArea = roomWidth * roomHeight;
        return (int) Math.ceil(roomArea / tileArea);
    }

    private static double getCostForFlooring(double roomWidth, double roomHeight, double tileArea, double costPerTile) {
        return getNumberOfTilesRequired(roomWidth, roomHeight, tileArea) * costPerTile;
    }
    
}