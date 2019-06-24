/**
 * The type Circle.
 */
public class Circle extends CurvedShape {

    private double radius;

    /**
     * Instantiates a new Circle.
     *
     * @param radius the radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

}