/**
 * The type Regular hexagon.
 */
public class RegularHexagon extends RegularPolygon {

    private double sideLength;

    /**
     * Instantiates a new Regular hexagon.
     *
     * @param sideLength the side length
     */
    public RegularHexagon(double sideLength) {
        this.sideLength = sideLength;
        sides = 6;
    }

    @Override
    public double area() {
        return (1.5 * Math.sqrt(3)) * Math.pow(sideLength, 2);
    }

    @Override
    public double perimeter() {
        return sides * sideLength;
    }

}