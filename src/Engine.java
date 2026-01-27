/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Matthew Sulpizio
 * Date Developed: 1/20/26
 * Last Date Changed: 1/25/26
 * Rev: 1/26/26

 */

// Engine class
/**
 * Represents an engine with cc and hp.
 */
public class Engine {

    private String cc;
    private String hp;

    /**
     * Constructs an Engine with a cc value.
     *
     * @param cc the engine cc
     */
    public Engine(String cc) {
        this.cc = cc;
    }

    /**
     * Constructs an Engine with cc and hp.
     *
     * @param cc the engine cc
     * @param hp the engine hp
     */
    public Engine(String cc, String hp) {
        this.cc = cc;
        this.hp = hp;
    }

    /**
     * Sets the engine cc
     *
     * @param c1 the engine cc
     */
    public void setCC(String c1) {
        this.cc = c1;
    }

    /**
     * Sets the engine hp.
     *
     * @param h1 the engine hp
     */
    public void setHP(String h1) {
        this.hp = h1;
    }

    /**
     * Returns the engine cc
     *
     * @return the engine cc
     */
    public String getCC() {
        return this.cc;
    }

    /**
     * Returns the engine hp.
     *
     * @return the engine hp
     */
    public String getHP() {
        return this.hp;
    }

}
