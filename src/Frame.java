/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Matthew Sulpizio
 * Date Developed: 1/20/26
 * Last Date Changed: 1/25/26
 * Rev: 1/25/26

 */

// Frame class
public class Frame {
    private Material material;
    public Frame(Material material) {
        this.material = material;
    }
    public Material getMaterial() {
        return material;
    }
}