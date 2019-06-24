/**
 * The type Ellipse.
 */
public class Ellipse extends CurvedShape {

    private double a, b;

    /**
     * Instantiates a new Ellipse.
     *
     * @param a the length of the Semi-major Axis
     * @param b the length of the Semi-minor Axis
     */
    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return pi * a * b;
    }

    @Override
    public double perimeter() {
        return 2 * pi * (Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2));
    }

}