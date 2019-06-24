/**
 * The type Square.
 */
public class Square extends RegularPolygon {

    private double sideLength;

    /**
     * Instantiates a new Square.
     *
     * @param sideLength the side length
     */
    public Square(double sideLength) {
        this.sideLength = sideLength;
        sides = 4;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public double perimeter() {
        return sideLength * 4;
    }

}