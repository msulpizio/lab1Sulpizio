/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Matthew Sulpizio
 * Date Developed: 1/20/26
 * Last Date Changed: 1/25/26
 * Rev: 1/26/26

 */

// Model class
/**
 * Represents the motorcycle model.
 */
public class Model {

    private String model;


    /**
     * Constructs a Model with the model name.
     *
     * @param model the model
     */
    public Model(String model) {
        this.model = model;
    }

    /**
     * Sets the model.
     *
     * @param model1 the model
     */
    public void setModel(String model1) {
        this.model = model1;
    }

    /**
     * Returns the model.
     *
     * @return the model
     */
    public String getModel() {
        return this.model;
    }

}
