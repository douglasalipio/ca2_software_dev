/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2_software_dev;

/**
 * Creating Pilot Class This class represents a Pilot
 *
 * @author asus
 */
public class Pilot {

    private final String name;
    private Qualification qualification;
    private boolean status;

    /**
     * Creating constructor Pilot with name and rate
     *
     * @param name of pilot
     */
    public Pilot(String name, Qualification qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    public Pilot(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Qualification getQualification() {
        return this.qualification;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public enum Qualification {
        SMALL_AIRCRAFT,
        MEDIUM_AIRCRAFT,
        LARGE_AIRCRAFT
    }

    @Override
    public String toString() {
        return "Pilot{" + "name=" + name + ", qualification=" + qualification + ", status=" + status + '}';
    }

}
