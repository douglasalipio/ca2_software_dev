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
    private final String model;
    private final int capacity;
    private Pilot pilot;

    /**
     * Creating an airplane object.
     *
     * @param make type of plane, such as, "Boeing"
     * @param model number that describes the airplane
     * @param capacity how many seats
     */
    public AirPlane(String make, String model, int capacity) {
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
     * @param pilot
     */
    public void assignPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    /**
     *
     * @return pilot
     */
    public Pilot getPilot() {
        return this.pilot;
    }

    @Override
    public String toString() {
        return "AirPlane{" + "make=" + make + ", model=" + model + ", "
                + "capacity=" + capacity + ", pilot=" + pilot + '}';
    }

}
