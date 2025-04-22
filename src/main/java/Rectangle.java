/**
 * Class representing a rectangle, comes with variables representing length and width
 * @author Richard Gao
 * @version 1.0.0
 */
public class Rectangle {
    //instance variables, as usual
    private double length;
    private double width;

    /**
     * Constructor taking no parameters, sets length to 4 and width to 8
     * Wow you're lazy for using this
     */
    public Rectangle() {
        this.length = 4;
        this.width = 8;
    }

    /**
     * Constructor taking only length, sets width to 8
     * @param length Length of the rectangle as a double
     */
    public Rectangle(double length) {
        this.length = length;
        this.width = 8;
    }

    /**
     * Constructor, takes length and width
     * @param length Length of the rectangle as a double
     * @param width Width of the rectangle as a double
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Getter for rectangle length
     * @return Length of the rectangle as a double
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Getter for rectangle width
     * @return Width of the rectangle as a double
     */
    public double getWidth() {
        return this.width;
    }
}
