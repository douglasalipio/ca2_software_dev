/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitites;

/**
 *
 * That class represent an airplane object.
 *
 * @author hal-9000
 */
public class Airplane extends Aircraft {

    private final String make;
    private final String model;
    private final int capacity;

    /**
     * Creating an airplane object.
     *
     * @param make type of plane, such as, "Boeing"
     * @param model number that describes the airplane
     * @param capacity how many seats
     */
    public Airplane(String make, String model, int capacity) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }

    /**
     * @return the make values
     */
    public String getMake() {
        return make;
    }

    /**
     *
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     *
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Printing all attributes.
     *
     * @return
     */
    @Override
    public String toString() {
        return "AirPlane{" + "make=" + make + ", model=" + model + ", "
                + "capacity=" + capacity + ", pilot=" + getPilot().toString() + "}";
    }

}
