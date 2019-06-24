/**
 * The type Triangle.
 */
public class Triangle extends RegularPolygon {

    private double sideA, sideB, sideC, base, height;

    /**
     * Instantiates a new Triangle.
     *
     * @param sideA  side a
     * @param sideB  side b
     * @param sideC  side c
     * @param base   the base
     * @param height the height
     */
    public Triangle(double sideA, double sideB, double sideC, double base, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.base = base;
        this.height = height;
        sides = 3;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

}