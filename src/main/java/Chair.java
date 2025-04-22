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
     * Constructor taking no parameters, sets legs to 4 and material to wood
     * For the lazy
     */
    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }

    /**
     * Constructor taking legs of the chair only, sets material to wood
     * @param legs Number of legs for the chair as an int
     */
    public Chair(int legs) {
        this.legs = legs;
        this.material = "wood";
    }

    /**
     * Constructor taking legs of the chair and material of the chair
     * @param legs Number of legs for the chair as an int
     * @param material Material of the chair as a string
     */
    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    /**
     * Getter for number of legs on the chair
     * @return Number of legs on the chair as an int
     */
    public int getLegs() {
        return this.legs;
    }

    /**
     * Getter for material of the chair
     * @return Material of the chair as a string
     */
    public String getMaterial() {
        return this.material;
    }
}
