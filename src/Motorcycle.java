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
/**
 * Represents a motorcycle with color, size, frame, wheels, and engine details.
 */
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
     * The frame of the motorcycle
     */
    private Frame frame;
    /**
     * The wheels of the motorcycle
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
     * The manufacturer of the motorcycle
     */
    private String manufacturer;
    /**
     * The model of the motorcycle
     */
    private String model;
    /**
     * Constructs a Motorcycle with specific details.
     *
     * @param color the color of the motorcycle
     * @param size the size of the motorcycle
     * @param frameMaterial the frame material of the motorcycle
     * @param wheelSize the wheel size of the motorcycle
     * @param cc the engine cc of the motorcycle
     * @param hp the engine hp of the motorcycle
     * @param manufacturer the manufacturer of the motorcycle
     * @param model the model of the motorcycle
     */
    public Motorcycle(String color, double size, Material frameMaterial, double wheelSize, String cc, String hp, String manufacturer, String model) {
        this.color = color;
        this.size = size;
        this.frame = new Frame(frameMaterial);
        this.wheels = new Wheel[2];
        this.wheels[0] = new Wheel(wheelSize);
        this.wheels[1] = new Wheel(wheelSize);
        this.cc = cc;
        this.hp = hp;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    /**
     * Returns the motorcycle color.
     *
     * @return the motorcycle color
     */
    public String getColor(){
        return color;
    }

    /**
     * Sets the motorcycle color.
     *
     * @param color the motorcycle color
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * Returns the motorcycle size.
     *
     * @return the motorcycle size
     */
    public double getSize(){
        return size;
    }

    /**
     * Sets the motorcycle size.
     *
     * @param size the motorcycle size
     */
    public void setSize(double size){
        this.size = size;
    }

    /**
     * Returns the frame material.
     *
     * @return the frame material
     */
    public Material getFrameMaterial(){
        return frame.getMaterial();
    }

    /**
     * Returns the wheel size.
     *
     * @return the wheel size
     */
    public double getWheelSize(){
        return wheels[0].getSize();
    }

    /**
     * Prints a message that the motorcycle started.
     */
    public void start() {
        System.out.println("Motorcycle started!");
    }
    /**
     * Prints a message that the motorcycle stopped.
     */
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}

