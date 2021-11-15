package by.iba.gomel;

/**
 * The Class Circle.
 */
public class Circle implements Shape {

    private static final double PI = 3.14;
    private final double        radius;

    /**
     * Instantiates a new circle.
     *
     * @param radius
     *            the radius
     */
    public Circle(final double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Circle.PI * this.radius * this.radius;
    }

    /**
     * Gets the radius.
     *
     * @return the radius
     */
    public double getRadius() {
        return this.radius;
    }

}
