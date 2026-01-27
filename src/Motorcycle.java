/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Matthew Sulpizio
 * Date Developed: 1/20/26
 * Last Date Changed: 1/25/26
 * Rev: 1/26/26

 */

// Motorcycle class
public class Motorcycle {
    /**
     * The color of the motorcycle
     */
    private String color;
    /**
     * The size of the motorcycle
     */
    private double size;
    /**
     * The frame material of the motorcycle
     */
    private Frame frame;
    /**
     * The wheel size of the motorcycle
     */
    private Wheel[] wheels;
    /**
     * The Engine of the motorcycle
     */
    private Engine engine;
    /**
     * The Engine cc of the motorcycle
     */
    private String cc;
    /**
     * The Engine hp of the motorcycle
     */
    private String hp;
    /**
     * The brand of the motorcycle
     */
    private String manufacturer;
    /**
     * The model of the motorcycle
     */
    private String model;
    /**
     *
     * Adds two numbers and returns the result.
     *
     * @param color This is the color of the motorcycle frame.
     * @param size This is the size of the motorcycle frame.
     */
    public Motorcycle(String color, double size, Material frameMaterial, double wheelSize, String cc, String hp, String manufacturer, String model) {
        this.color = color;
        this.size = size;
        this.frame = new Frame(frameMaterial);
        this.wheels = new Wheel[2];
        this.wheels[0] = new Wheel(wheelSize);
        this.wheels[1] = new Wheel(wheelSize);
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getSize(){
        return size;
    }

    public void setSize(double size){
        this.size = size;
    }

    public Material getFrameMaterial(){
        return frame.getMaterial();
    }

    public double getWheelSize(){
        return wheels[0].getSize();
    }

    public void start() {
        System.out.println("Motorcycle started!");
    }
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}

