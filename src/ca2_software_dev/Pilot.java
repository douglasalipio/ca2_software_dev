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
    private int rate;
    private String qualification;

    /**
     * Creating constructor Pilot with name and rate
     *
     * @param name of pilot
     */
    public Pilot(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Pilot(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getRate() {
        return this.rate;
    }

    public String getQualification() {
        return this.qualification;
    }

}
