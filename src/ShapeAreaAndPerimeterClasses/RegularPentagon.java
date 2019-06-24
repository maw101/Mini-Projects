/**
 * The type Regular pentagon.
 */
public class RegularPentagon extends RegularPolygon {

    private double sideLength;

    /**
     * Instantiates a new Regular pentagon.
     *
     * @param sideLength the side length
     */
    public RegularPentagon(double sideLength) {
        this.sideLength = sideLength;
        sides = 5;
    }

    @Override
    public double area() {
        return 1.7204774 * Math.pow(sideLength, 2);
    }

    @Override
    public double perimeter() {
        return sides * sideLength;
    }

}