/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitites;

/**
 * Creating Pilot Class This class represents a Pilot
 *
 * @author asus
 */
public class Pilot {

    private final String name;
    private Qualification qualification;

    /**
     * Creating constructor Pilot with name and rate
     *
     * @param name of pilot
     * @param qualification of pilot
     */
    public Pilot(String name, Qualification qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    /**
     * Creating a pilot.
     *
     * @param name
     */
    public Pilot(String name) {
        this.name = name;
    }

    /**
     * Getting pilot name.
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getting pilot qualification.
     *
     * @return
     */
    public Qualification getQualification() {
        return this.qualification;
    }

    /**
     * Qualification for a pilot.
     */
    public enum Qualification {
        SMALL_AIRCRAFT,
        MEDIUM_AIRCRAFT,
        LARGE_AIRCRAFT
    }

    /**
     * Printing all attributes.
     *
     * @return
     */
    @Override
    public String toString() {
        
        return "" +"\n\tname: " + name + "\n\t"
                + "qualification: " + qualification + "";
    }

}
