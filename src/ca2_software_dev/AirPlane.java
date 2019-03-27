/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2_software_dev;

/**
 *
 * That class represent an airplane object.
 *
 * @author hal-9000
 */
public class AirPlane {

    private final String make;
    private final int model;
    private final int capacity;
    private final String pilot;

    /**
     * Creating an airplane object.
     *
     * @param make type of plane, such as, "Boeing"
     * @param model number that describes the airplane
     * @param capacity how many seats
     * @param pilot the name of the pilot
     */
    public AirPlane(String make, int model, int capacity, String pilot) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.pilot = pilot;
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
    public int getModel() {
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
     *
     * @return the pilot name
     */
    public String getPilot() {
        return pilot;
    }
}