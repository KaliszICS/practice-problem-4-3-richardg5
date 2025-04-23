/**
 * Class representing a chair, comes with variables for number of legs and material of the chair
 * @author Richard Gao
 * @version 1.0.0
 */
public class Chair {
    //instance variables once again
    private int legs;
    private String material;

    /**
     * Creates an instance of the chair class with 4 legs and wood material
     */
    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }

    /**
     * Creates an instance of the chair class with given number of legs and wood material
     * @param legs an int representing the number of legs
     */
    public Chair(int legs) {
        this.legs = legs;
        this.material = "wood";
    }

    /**
     * Creates an instance of the chair class with given number of legs and given material
     * @param legs an int representing the number of legs
     * @param material a String representing the material
     */
    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    /**
     * Gets the number of legs on the chair
     * @return an int representing the number of legs
     */
    public int getLegs() {
        return this.legs;
    }

    /**
     * Gets the material of the chair
     * @return a String representign the material
     */
    public String getMaterial() {
        return this.material;
    }
}
