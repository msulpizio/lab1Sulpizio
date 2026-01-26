/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Matthew Sulpizio
 * Date Developed: 1/20/26
 * Last Date Changed: 1/25/26
 * Rev: 1/25/26

 */

// Engine class
public class Engine {

    private String cc;
    private String hp;

    public Engine(String cc) {
        this.cc = cc;
    }

    public Engine(String cc, String hp) {
        this.cc = cc;
        this.hp = hp;
    }

    public void setCC(String c1) {
        this.cc = c1;
    }

    public void setHP(String h1) {
        this.hp = h1;
    }

    public String getCC() {
        return this.cc;
    }

    public String getHP() {
        return this.hp;
    }

}
