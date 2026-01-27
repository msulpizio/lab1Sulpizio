/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Matthew Sulpizio
 * Date Developed: 1/20/26
 * Last Date Changed: 1/25/26
 * Rev: 1/26/26

 */

// Wheel class
/**
 * Represents a wheel with a wheel size.
 */
public class Wheel {
    private double size;
    /**
     * Constructs a Wheel with the wheel size.
     *
     * @param size the wheel size
     */
    public Wheel(double size) {
        this.size = size;
    }
    /**
     * Returns the wheel size.
     *
     * @return the wheel size
     */
    public double getSize() {
        return size;
    }
    /**
     * Sets the wheel size.
     *
     * @param size the wheel size
     */
    public void setSize(double size) {
        this.size = size;
    }
}