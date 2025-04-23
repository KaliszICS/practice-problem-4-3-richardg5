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
     * Creates an instance of the rectangle class with length 4 and width 8
     */
    public Rectangle() {
        this.length = 4;
        this.width = 8;
    }

    /**
     * Creates an instance of the rectangle class with given length and width 8
     * @param length a double representing the length of the rectangle
     */
    public Rectangle(double length) {
        this.length = length;
        this.width = 8;
    }

    /**
     * Creates an instance of the rectangle class with given length and given width
     * @param length a double representing the length of the rectangle
     * @param width a double representing the width of the rectangle
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Gets the length of the rectangle
     * @return a double representing the length of the rectangle
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Gets the width of the rectangle
     * @return a double representing the width of the rectangle
     */
    public double getWidth() {
        return this.width;
    }
}
