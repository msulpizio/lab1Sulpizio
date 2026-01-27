/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Matthew Sulpizio
 * Date Developed: 1/20/26
 * Last Date Changed: 1/25/26
 * Rev: 1/26/26

 */

// Frame class
/**
 * Represents the frame material of the motorcycle.
 */
public class Frame {
    private Material material;
    /**
     * Constructs a motorcycle frame with the frame material.
     *
     * @param material the frame material
     */
    public Frame(Material material) {
        this.material = material;
    }
    /**
     * Returns the frame material.
     *
     * @return the frame material
     */
    public Material getMaterial() {
        return material;
    }
}