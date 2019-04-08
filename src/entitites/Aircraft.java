/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitites;

/**
 * Class represent a airplane object.
 *
 * @author hal-9000
 */
public class Aircraft {

    private Pilot pilot;

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
}
