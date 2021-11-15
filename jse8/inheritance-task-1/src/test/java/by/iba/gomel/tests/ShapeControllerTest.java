package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.AbstractRectangle;
import by.iba.gomel.Circle;
import by.iba.gomel.Rhombus;
import by.iba.gomel.Shape;
import by.iba.gomel.ShapeController;
import by.iba.gomel.Square;

public class ShapeControllerTest {

    Rhombus                    rh  = new Rhombus(12, 5, 8);
    Square                     sqr = new Square(3);
    Circle                     crl = new Circle(3);

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testCircle() {
        new Circle(6);
        final double actual = this.crl.getRadius();
        final double expected = 3.0;
        Assert.assertEquals("test", expected, actual, 2);
    }

    @Test
    public void testOfSums() {
        final double radius = 5;
        Shape testArea = new Circle(radius);
        System.out.print("Circle area: PI (3.14) * radius (" + radius + ")^2 = "
                + Double.toString(testArea.getArea()) + "\n");

        double side = 6;
        testArea = new Square(side);
        System.out.print("Square area: a (" + side + ")^2 = " + testArea.getArea() + "\n");

        side = 3;

        final double firstdiagonal = 4;
        final double seconddiagonal = 6;
        testArea = new Rhombus(firstdiagonal, side, seconddiagonal);
        System.out.print("Rhombus area: 0.5 * diagonal 1 (" + firstdiagonal + ") * diagonal 2("
                + seconddiagonal + ") = " + testArea.getArea() + "\n");

        final ShapeController shapeController = new ShapeController();
        System.out.print("Sum of all shapes: " + shapeController.sum() + "\n");

        final String first = "Circle area: PI (3.14) * radius (5.0)^2 = 78.5\n";
        final String second = "Square area: a (6.0)^2 = 36.0\n";
        final String third = "Rhombus area: 0.5 * diagonal 1 (4.0) * diagonal 2(6.0) = 12.0\n";
        final String fourth = "Sum of all shapes: 703.16\n";
        Assert.assertEquals("test", first + second + third + fourth, this.log.getLog());
    }

    @Test
    public void testRhombus() {
        new Rhombus(13, 5, 12);
        final String actual = this.rh.toString();
        final String expected = "Rhombus [firstdiagonal=12.0, seconddiagonal=8.0]";
        Assert.assertEquals("test", expected, actual);
        final double actual2 = this.rh.getWidth(12);
        final double expected2 = 12.0;
        Assert.assertEquals("test", expected2, actual2, 2);
        final double actual3 = AbstractRectangle.getHeight(3) * this.rh.getWidth(12);
        final double expected3 = 36.0;
        Assert.assertEquals("Test", expected3, actual3, 1);
    }

    @Test
    public void testSquare() {
        new Square(6);
        final String actual = this.sqr.toString();
        final String expected = "Square [side length=3.0]";
        Assert.assertEquals("test", expected, actual);
        final double actual2 = this.sqr.getWidth(3);
        final double expected2 = 3;
        Assert.assertEquals("test", expected2, actual2, 1);
    }

    @Test
    public void testTwo() {
        final Shape[] emptyinit = new Shape[5];
        final ShapeController shape = new ShapeController(emptyinit);

        System.out.print("ShapeController class = " + shape.getClass() + "\n");
        // Second test has to proof your code still works if array member of ShapeController class
        // is initialized, but empty..
        final String first = "Array member of ShapeController is initialized, but empty.\n";
        final String second = "ShapeController class = class by.iba.gomel.ShapeController\n";
        Assert.assertEquals("test", first + second, this.log.getLog());

    }

    @Test
    public void testTwoNegOne() {
        final Shape[] emptyinit = new Shape[0];
        final ShapeController shape = new ShapeController(emptyinit);

        System.out.print("ShapeController class = " + shape.getClass() + "\n");
        // Second test has to proof your code still works if array member of ShapeController class
        // is initialized, but empty..
        final String first = "Array member of ShapeController is initialized, but empty.\n";
        final String second = "ShapeController class = class by.iba.gomel.ShapeController\n";
        Assert.assertNotEquals("test", first + second, this.log.getLog());

    }

    @Test
    public void testTwoNegTwo() {
        final ShapeController shape = new ShapeController(null);

        System.out.print("ShapeController class = " + shape.getClass() + "\n");
        // Second test has to proof your code still works if array member of ShapeController class
        // is initialized, but empty..
        final String first = "Array member of ShapeController is initialized, but empty.\n";
        final String second = "ShapeController class = class by.iba.gomel.ShapeController\n";
        Assert.assertNotEquals("test", first + second, this.log.getLog());

    }

}
