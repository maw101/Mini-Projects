/**
 * The type Regular octagon.
 */
public class RegularOctagon extends RegularPolygon {

    private double sideLength;

    /**
     * Instantiates a new Regular octagon.
     *
     * @param sideLength the side length
     */
    public RegularOctagon(double sideLength) {
        this.sideLength = sideLength;
        sides = 8;
    }

    @Override
    public double area() {
        return (2 * (1 + Math.sqrt(2))) * Math.pow(sideLength, 2);
    }

    @Override
    public double perimeter() {
        return sides * sideLength;
    }

}