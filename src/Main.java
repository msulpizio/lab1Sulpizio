/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Matthew Sulpizio
 * Date Developed: 1/20/26
 * Last Date Changed: 1/25/26
 * Rev: 1/25/26

 */

// Main class
public class Main {
    public static void main(String[] args) {
        Motorcycle m1 = new Motorcycle("Blue", 60.0, Material.STEEL, 29.5, "630", "330", "Harley", "Street");
        Engine myEng = new Engine("630", "330");
        Manufacturer myManufacturer = new Manufacturer("Harley");
        Model myModel = new Model("Street");
        m1.setColor("Green");
        m1.setSize(63.0);
        myEng.setCC("660");
        myEng.setHP("360");
        myManufacturer.setManufacturer("Indian");
        myModel.setModel("Sport");
        Motorcycle m2 = new Motorcycle("Yellow", 67.5, Material.ALUMINUM, 34.5, "600", "300", "Kawasaki", "Vulcan");
        Engine myEng2 = new Engine("600", "300");
        Manufacturer myManufacturer2 = new Manufacturer("Kawasaki");
        Model myModel2 = new Model("Vulcan");
        m2.setColor("Orange");
        m2.setSize(70.0);
        myEng2.setCC("630");
        myEng2.setHP("330");
        myManufacturer2.setManufacturer("Harley");
        myModel2.setModel("Softail");
        Motorcycle m3 = new Motorcycle("Red", 67.0, Material.MAGNESIUM, 34.0, "610", "370","Indian", "Pursuit");
        Engine myEng3 = new Engine("610", "370");
        Manufacturer myManufacturer3 = new Manufacturer("Indian");
        Model myModel3 = new Model("Pursuit");
        m3.setColor("Purple");
        m3.setSize(71.5);
        myEng3.setCC("640");
        myEng3.setHP("400");
        myManufacturer3.setManufacturer("Kawasaki");
        myModel3.setModel("Z");

        System.out.println("Motorcycle color: " + m1.getColor());
        System.out.println("Motorcycle size: " + m1.getSize());
        System.out.println("Frame material: " + m1.getFrameMaterial());
        System.out.println("Wheel size: " + m1.getWheelSize());
        System.out.println("Engine cc: " + myEng.getCC());
        System.out.println("Engine hp: " + myEng.getHP());
        System.out.println("Manufacturer: " + myManufacturer.getManufacturer());
        System.out.println("Model: " + myModel.getModel());
        m1.start();
        m1.stop();

        System.out.println("Motorcycle color: " + m2.getColor());
        System.out.println("Motorcycle size: " + m2.getSize());
        System.out.println("Frame material: " + m2.getFrameMaterial());
        System.out.println("Wheel size: " + m2.getWheelSize());
        System.out.println("Engine cc: " + myEng2.getCC());
        System.out.println("Engine hp: " + myEng2.getHP());
        System.out.println("Manufacturer: " + myManufacturer2.getManufacturer());
        System.out.println("Model: " + myModel2.getModel());
        m2.start();
        m2.stop();

        System.out.println("Motorcycle color: " + m3.getColor());
        System.out.println("Motorcycle size: " + m3.getSize());
        System.out.println("Frame material: " + m3.getFrameMaterial());
        System.out.println("Wheel size: " + m3.getWheelSize());
        System.out.println("Engine cc: " + myEng3.getCC());
        System.out.println("Engine hp: " + myEng3.getHP());
        System.out.println("Manufacturer: " + myManufacturer3.getManufacturer());
        System.out.println("Model: " + myModel3.getModel());
        m3.start();
        m3.stop();
    }
}
