/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Matthew Sulpizio
 * Date Developed: 1/20/26
 * Last Date Changed: 1/25/26
 * Rev: 1/26/26

 */

// Manufacturer class
/**
 * Represents the motorcycle manufacturer
 */
public class Manufacturer {

    private String manufacturer;

    /**
     * Constructs a Manufacturer with the manufacturer name.
     *
     * @param manufacturer the manufacturer
     */
    public Manufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Sets the manufacturer.
     *
     * @param manufacturer1 the manufacturer
     */
    public void setManufacturer(String manufacturer1) {
        this.manufacturer = manufacturer1;
    }

    /**
     * Returns the manufacturer.
     *
     * @return the manufacturer
     */
    public String getManufacturer() {
        return this.manufacturer;
    }

}